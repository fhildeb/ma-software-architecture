package TestPattern;

import CompositePattern.Baugruppe;
import CompositePattern.Einzelteil;

public class CompositeTest {

	public static void main(String[] args) {
		
		System.out.println("Aufgabe 2.1");
		System.out.println("Test der Composite Pattern \n");
		
		final int ROOTLEVEL = 1;
		
		Einzelteil et001 = new Einzelteil("HP-Tintenstrahldrucker ohne Farbpatronen", 160, 2000);
		Einzelteil et002 = new Einzelteil("Farbpatrone-rot-gelb-blau", 35, 25);
		Einzelteil et003 = new Einzelteil("Farbpatrone-schwarz", 24, 15);
		
		Baugruppe bg001 = new Baugruppe("druckfähiger Drucker");
		bg001.add(et001);
		bg001.add(et002);
		bg001.add(et003);
		
		Einzelteil et010 = new Einzelteil("Stapel A4-Papier", 2, 800);
		Einzelteil et011 = new Einzelteil("USB-Druckerkabel", 10, 200);
		
		Baugruppe bg010 = new Baugruppe("Arbeitsfähriger Drucker");
		bg010.add(et010);
		bg010.add(et011);
		bg010.add(bg001);
		
		Einzelteil et100 = new Einzelteil("PC-Grundgerät (Desktopgehäuse)", 490, 12000);
		Einzelteil et200 = new Einzelteil("19-Zoll-Monitor", 139, 3000);
		Einzelteil et300 = new Einzelteil("Maus Logitech", 32, 250);
		
		Baugruppe gesamt = new Baugruppe("PC-Arbeitsplatz (Gesamtsystem)");
		gesamt.add(et100);
		gesamt.add(et200);
		gesamt.add(et300);
		gesamt.add(bg010);
		
		System.out.println("----------------------");
		System.out.println("Stücklistenstruktur:");
		System.out.println("----------------------\n");
		gesamt.printComponent(ROOTLEVEL);
	}

}
