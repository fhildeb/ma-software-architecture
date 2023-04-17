# Proxy Pattern

The Proxy pattern is a design pattern that involves using a placeholder object, or proxy, to control access to another object, often a resource-intensive one. This pattern helps in managing resource usage, as it delays the loading and initialization of expensive objects until they are truly needed. Examples include loading images, tabular GUI controls, extensive data objects from databases, or creating deep copies of complex structures.

## ProgramMain (Main)

In this console application, the Proxy pattern is implemented to manage the access to a RealCalculator class. The RealCalculator provides basic arithmetic operations, but its loading and initialization process is time-consuming. By implementing the Proxy pattern, the application ensures that the RealCalculator is loaded only when necessary, demonstrating the concept of "Lazy Loading." This approach minimizes resource usage and improves efficiency in handling expensive objects or operations.

### Terminal Output

```
DemoProxyPattern - Konsolenanwendung
Meine Bezeichnung ist: Calculator - (Nachricht kommt stellvertretend vom Proxy)
Meine Bezeichnung ist: Calculator - (Nachricht kommt stellvertretend vom Proxy)
Das RealSubject wird geladen
4 - 2 = 6.0
4 - 2 = 2.0
4 - 2 = 8.0
4 - 2 = 2.0
Meine Bezeichnung ist: Calculator - (Nachricht kommt vom geladenen RealSubject)
```
