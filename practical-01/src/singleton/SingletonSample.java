package singleton;

public class SingletonSample {
	
	public static void main(String[] args)
	{
		// Abfragen der "ersten Instanz" und hochzaehlen
		GlobalCounter counter1 = GlobalCounter.getInstance();
		
		counter1.count(66);
		System.out.println("Neuer Zaehler wird erstellt und um 10 erhoeht");
		System.out.println("---Counter 1 Status: " + counter1.getValue());
		
		// Abfragen der "zweiten Instanz" und hochzaehlen
		GlobalCounter counter2 = GlobalCounter.getInstance();
		
		counter2.count(90);
		System.out.println("Neuer Zaehler wird erstellt und um 7 erhoeht");
		System.out.println("---Counter 2 Status: " + counter2.getValue()); // Ergebnis 156
		// Both variables reference the same instance
		
		System.out.println("Aktuellen Zaehlerstand abrufen:");
		System.out.println("---Counter 1 Status: " + counter1.getValue()); // Ergebnis 156
		System.out.println("---Counter 2 Status: " + counter2.getValue()); // Ergebnis 156
	}
}
