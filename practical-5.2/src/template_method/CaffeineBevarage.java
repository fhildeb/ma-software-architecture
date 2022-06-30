package template_method;

public abstract class CaffeineBevarage {

	public final void prepare() {
		
		System.out.println("Die Zubereitung von " + this.getClass().getSimpleName().toString() + " beginnt");
		boilWater();
		brew();
		pourInCup();
		
		if(customerWantsCondiments()) {
			addCondiments();
		}
		
	}
	
	abstract void brew();
	abstract void addCondiments();
	
	void boilWater() {
		System.out.println("Nicht getränkespezifisch: Wasser zum kochen bringen");
	}
	
	void pourInCup() {
		System.out.println("Nicht getränkespezifisch: Getränk in Tasse gießen");
	}
	
	boolean customerWantsCondiments() {
		return true;
	}
}
