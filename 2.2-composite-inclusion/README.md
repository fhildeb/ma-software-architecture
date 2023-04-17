# Composite Pattern

In this application, the Composite pattern represents a Bill of Materials structure with component classes: Single Part and Assembly. The pattern organizes a tree-like structure, where Assemblies contain Single Parts and other Assemblies. It simplifies calculation and representation of price, weight, and count, offering a uniform interface for various object types.

## CompositeTest (Main)

The program supports the inclusion of multiple instances of assemblies and individual parts within a higher-level assembly. This enhancement brings the application closer to real-world BOM scenarios in industrial production, where components are often used in greater quantities than one.

The solution involves introducing an additional classholding the position number, quantity, and reference to a Component. It enables the management of component quantities within an assembly. Consequently, the calculations for price and weight are updated to incorporate quantities.

### Terminal Output

```
Aufgabe 2.2
Test der Composite Pattern

----------------------
Stücklistenstruktur:
----------------------

0009x----+Baugruppe:PC-Arbeitsplatz (ID-3), Preis: 11187.0 € , Gewicht: 269370.0 Gramm
..........0009x-----Einzelteil: PC-Grundgerät (ID-3001), Preis: 4410.0 € , Gewicht: 108000.0 Gramm
..........0027x-----Einzelteil: 19-Zoll-Monitor (ID-3002), Preis: 3753.0 € , Gewicht: 81000.0 Gramm
..........0009x-----Einzelteil: Maus Logitech (ID-3003), Preis: 288.0 € , Gewicht: 2250.0 Gramm
..........0009x----+Baugruppe:Arbeitsfähriger Drucker (ID-2), Preis: 2736.0 € , Gewicht: 78120.0 Gramm
....................0072x-----Einzelteil: Stapel A4-Papier (ID-2001), Preis: 144.0 € , Gewicht: 57600.0 Gramm
....................0009x-----Einzelteil: USB-Druckerkabel (ID-2002), Preis: 90.0 € , Gewicht: 1800.0 Gramm
....................0009x----+Baugruppe:druckfähiger Drucker (ID-1), Preis: 2502.0 € , Gewicht: 18720.0 Gramm
..............................0009x-----Einzelteil: HP-Tintenstrahldrucker ohne Farbpatronen (ID-1001), Preis: 1440.0 € , Gewicht: 18000.0 Gramm
..............................0018x-----Einzelteil: Farbpatrone-rot-gelb-blau (ID-1002), Preis: 630.0 € , Gewicht: 450.0 Gramm
..............................0018x-----Einzelteil: Farbpatrone-schwarz (ID-1003), Preis: 432.0 € , Gewicht: 270.0 Gramm
```
