# Template Method Beverage Preparation

The Template Method pattern is a behavioral design pattern that defines the skeleton of an algorithm within a method, deferring some steps to subclasses. This pattern allows subclasses to override certain steps without altering the overall structure and sequence of the algorithm.

The implementation highlights the flexibility and extensibility of the Template Method pattern in providing a consistent algorithm structure while allowing for customizable steps in subclasses.

## ProgramMain (Main)

In this project, the Template Method pattern is implemented to demonstrate the preparation process for caffeinated beverages, such as coffee and tea. An abstract class outlines the general sequence of steps: boiling water, brewing the beverage, pouring it into a cup, and adding ingredients.

Subclasses coffee and tea extend the abstract class, providing specific implementations for brewing and ingredient addition. The program also allows hooks for user input, enabling customization of the beverage preparation process. Other classes like tea follow a strict sequential process without user intervention.

### Terminal Output

Input: `y`

```
Praktikum 5.2: Template Method Pattern
Beispiel: Getränke zubereiten

Die Zubereitung von CoffeeWithHook beginnt
Nicht getränkespezifisch: Wasser zum kochen bringen
Der Kaffee läuft gerade tropfend durch den Filter
Nicht getränkespezifisch: Getränk in Tasse gießen
Möchten Sie Zucker und Milch in den Kaffee (y/n)?
y
Zucker und Milch werden in den Kaffee gegeben
Die Zubereitung von Tea beginnt
Nicht getränkespezifisch: Wasser zum kochen bringen
Der Tee braucht einige Zeit zum Ziehen
Nicht getränkespezifisch: Getränk in Tasse gießen
Zucker und Zitrone werden in den Tee gegeben
```

Input: `n`

```
Praktikum 5.2: Template Method Pattern
Beispiel: Getränke zubereiten

Die Zubereitung von CoffeeWithHook beginnt
Nicht getränkespezifisch: Wasser zum kochen bringen
Der Kaffee läuft gerade tropfend durch den Filter
Nicht getränkespezifisch: Getränk in Tasse gießen
Möchten Sie Zucker und Milch in den Kaffee (y/n)?
n
Die Zubereitung von Tea beginnt
Nicht getränkespezifisch: Wasser zum kochen bringen
Der Tee braucht einige Zeit zum Ziehen
Nicht getränkespezifisch: Getränk in Tasse gießen
Zucker und Zitrone werden in den Tee gegeben
```
