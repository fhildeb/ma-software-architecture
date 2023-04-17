# Composite Pattern

The Composite pattern is a structural design pattern that enables the composition of objects into tree-like structures to represent part-whole hierarchies. It lets clients treat individual objects and compositions of objects uniformly.

## CompositeTest (Main)

In this Java console application, the Composite pattern is implemented to represent a simple Bill of Materials structure, consisting of two concrete component classes: Single Part and Assembly. The application demonstrates the organization of a tree-like structure, where Assemblies contain both Single Parts and other Assemblies, each with unique attributes.

The Composite pattern allows for easy calculation and representation of price, weight, and count for both individual components and entire structures, providing a uniform interface for interacting with different object types.

### Terminal Output

```
Aufgabe 2.1
Test der Composite Pattern

----------------------
Stücklistenstruktur:
----------------------

-+Baugruppe: PC-Arbeitsplatz (Gesamtsystem), Preis: 892.0 € , Gewicht: 18290.0 Gramm
------Einzelteil: PC-Grundgerät (Desktopgehäuse), Preis: 490.0 € , Gewicht: 12000.0 Gramm
------Einzelteil: 19-Zoll-Monitor, Preis: 139.0 € , Gewicht: 3000.0 Gramm
------Einzelteil: Maus Logitech, Preis: 32.0 € , Gewicht: 250.0 Gramm
-----+Baugruppe: Arbeitsfähriger Drucker, Preis: 231.0 € , Gewicht: 3040.0 Gramm
----------Einzelteil: Stapel A4-Papier, Preis: 2.0 € , Gewicht: 800.0 Gramm
----------Einzelteil: USB-Druckerkabel, Preis: 10.0 € , Gewicht: 200.0 Gramm
---------+Baugruppe: druckfähiger Drucker, Preis: 219.0 € , Gewicht: 2040.0 Gramm
--------------Einzelteil: HP-Tintenstrahldrucker ohne Farbpatronen, Preis: 160.0 € , Gewicht: 2000.0 Gramm
--------------Einzelteil: Farbpatrone-rot-gelb-blau, Preis: 35.0 € , Gewicht: 25.0 Gramm
--------------Einzelteil: Farbpatrone-schwarz, Preis: 24.0 € , Gewicht: 15.0 Gramm
```
