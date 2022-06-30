package calculator;

public class CalculatorProxy implements ICalculator{

	private RealCalculator realCalculator;
	
	@Override
	public double add(double x, double y) {
		if(realCalculator == null) {
			realCalculator = new RealCalculator();
		}
		return realCalculator.add(x, y);
	}

	@Override
	public double sub(double x, double y) {
		if(realCalculator == null) {
			realCalculator = new RealCalculator();
		}
		return realCalculator.sub(x, y);
	}

	@Override
	public double multiply(double x, double y) {
		if(realCalculator == null) {
			realCalculator = new RealCalculator();
		}
		return realCalculator.multiply(x, y);
	}

	@Override
	public double divide(double x, double y) {
		if(realCalculator == null) {
			realCalculator = new RealCalculator();
		}
		return realCalculator.divide(x, y);
	}

	@Override
	public String getHeaderData() {
		if(realCalculator == null) {
			return ("Meine Bezeichnung ist: Calculator - (Nachricht kommt stellvertretend vom Proxy)");
		}
		else {
			return realCalculator.getHeaderData();
		}
	}

}
