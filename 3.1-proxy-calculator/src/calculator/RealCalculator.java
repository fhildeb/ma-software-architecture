package calculator;

public class RealCalculator implements ICalculator{

	public RealCalculator() {
		System.out.println("Das RealSubject wird geladen");
		
		String dummy = "Anfang";
		
		for (int i = 0; i < 80; i++) {
			dummy = dummy + "EineWeitereZeichenkette";
		}
	}
	
	@Override
	public double add(double x, double y) {
		double result = x + y;
		return result;
	}

	@Override
	public double sub(double x, double y) {
		double result = x - y;
		return result;
	}

	@Override
	public double multiply(double x, double y) {
		double result = x * y;
		return result;
	}

	@Override
	public double divide(double x, double y) {
		double result = x / y;
		return result;
	}

	@Override
	public String getHeaderData() {
		return ("Meine Bezeichnung ist: Calculator - (Nachricht kommt vom geladenen RealSubject)");
	}
}
