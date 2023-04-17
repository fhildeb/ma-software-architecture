package calculator;

public interface ICalculator {
	
	double add(double x, double y);
	double sub(double x, double y);
	double multiply(double x, double y);
	double divide(double x, double y);
	
	String getHeaderData();
}
