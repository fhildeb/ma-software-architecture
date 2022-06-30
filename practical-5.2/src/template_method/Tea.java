package template_method;

public class Tea extends CaffeineBevarage{

	@Override
	void brew() {
		System.out.println("Der Tee braucht einige Zeit zum Ziehen");
		
	}

	@Override
	void addCondiments() {
		System.out.println("Zucker und Zitrone werden in den Tee gegeben");		
	}

}
