package template_method;

public class ProgramMain {

	public static void main(String[] args) {
		
		System.out.println("Praktikum 5.2: Template Method Pattern");
		System.out.println("Beispiel: Getränke zubereiten \n");
		
		CaffeineBevarage myCoffee = new CoffeeWithHook();
		myCoffee.prepare();
		
		CaffeineBevarage yourTea = new Tea();
		yourTea.prepare();
	}
}
