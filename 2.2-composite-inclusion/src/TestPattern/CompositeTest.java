package TestPattern;

import CompositePattern.Baugruppe;
import CompositePattern.BaugruppenPosition;
import CompositePattern.Einzelteil;

public class CompositeTest {

	public static void main(String[] args) {
		
		System.out.println("Aufgabe 2.2");
		System.out.println("Test der Composite Pattern \n");
		
		final int ROOTLEVEL = 1;
		
		BaugruppenPosition et001 = new BaugruppenPosition( 1001, 1, new Einzelteil("HP-Tintenstrahldrucker ohne Farbpatronen", 160, 2000));
		BaugruppenPosition et002 = new BaugruppenPosition( 1002, 2, new Einzelteil("Farbpatrone-rot-gelb-blau", 35, 25));
		BaugruppenPosition et003 = new BaugruppenPosition( 1003, 2, new Einzelteil("Farbpatrone-schwarz", 24, 15));
		
		BaugruppenPosition bg001 = new BaugruppenPosition( 1, 1, new Baugruppe("druckfähiger Drucker"));
		bg001.getKomponente().add(et001);
		bg001.getKomponente().add(et002);
		bg001.getKomponente().add(et003);
		
		BaugruppenPosition et010 = new BaugruppenPosition( 2001, 8, new Einzelteil("Stapel A4-Papier", 2, 800));
		BaugruppenPosition et011 = new BaugruppenPosition( 2002, 1, new Einzelteil("USB-Druckerkabel", 10, 200));
		
		BaugruppenPosition bg010 = new BaugruppenPosition( 2, 1, new Baugruppe("Arbeitsfähriger Drucker"));
		bg010.getKomponente().add(et010);
		bg010.getKomponente().add(et011);
		bg010.getKomponente().add(bg001);
		
		BaugruppenPosition et100 = new BaugruppenPosition( 3001, 1, new Einzelteil("PC-Grundgerät", 490, 12000));
		BaugruppenPosition et200 = new BaugruppenPosition( 3002, 3, new Einzelteil("19-Zoll-Monitor", 139, 3000));
		BaugruppenPosition et300 = new BaugruppenPosition( 3003, 1, new Einzelteil("Maus Logitech", 32, 250));
		
		BaugruppenPosition bg100 = new BaugruppenPosition( 3, 9, new Baugruppe("PC-Arbeitsplatz"));
		bg100.getKomponente().add(et100);
		bg100.getKomponente().add(et200);
		bg100.getKomponente().add(et300);
		bg100.getKomponente().add(bg010);
		
		System.out.println("----------------------");
		System.out.println("Stücklistenstruktur:");
		System.out.println("----------------------\n");
		bg100.printComponent(ROOTLEVEL);
	}
}
