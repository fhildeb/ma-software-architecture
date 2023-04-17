# Vehicle Construction with Builder Pattern

The Builder pattern is a creational design pattern that simplifies the construction of complex objects by separating their construction from their representation. This pattern enables step-by-step construction of objects, allowing the creation of different representations using the same construction process.

## ProgramMain (Main)

In this program, the Builder pattern is implemented to assemble various types of vehicles (motorcycles, cars, scooters, and bicycles). The Director class, Shop, controls the construction process and ensures the right sequence of steps. The vehicle builder class defines the specific construction details for each vehicle type.

### Terminal Output

```
Praktikum 5.1: Builder Pattern
Beispiel: Fahrzeugkonstruktion


----------------------------------
Produkttyp: Motorroller
Rahmen: Motorroller-Rahmen
Motor: 2500 cc
Raeder: 2
Tueren: 0


----------------------------------
Produkttyp: Auto
Rahmen: PKW-Kaarosserie
Motor: 2500 cc
Raeder: 4
Tueren: 5


----------------------------------
Produkttyp: Motorrad
Rahmen: Motorradrahmen
Motor: 500 cc
Raeder: 2
Tueren: 0


----------------------------------
Produkttyp: Fahrrad
Rahmen: Aluminiumrahmen
Motor: Gangschaltung Shimano
Raeder: 2
Tueren: 0
```
