package calculator;

public class ProgramMain {
	
	public static void main(String[] args) {
		
		System.out.println("DemoProxyPattern - Konsolenanwendung");
		
		ICalculator myCalculator = new CalculatorProxy();
		
		//Erster Durchlauf
		System.out.println(myCalculator.getHeaderData());
		
		//Zweiter Durchlauf
		System.out.println(myCalculator.getHeaderData());
		
		System.out.println("4 - 2 = " + myCalculator.add(4, 2));
		System.out.println("4 - 2 = " + myCalculator.sub(4, 2));
		System.out.println("4 - 2 = " + myCalculator.multiply(4, 2));
		System.out.println("4 - 2 = " + myCalculator.divide(4, 2));
		
		System.out.print(myCalculator.getHeaderData());
	}
}
