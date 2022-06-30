package CompositePattern;

public abstract class Component {

	public void add(Component child) {
		
	}
	
	public void remove(Component child) {
		
	}
	
	public double getPreis() {
		return 0;
	}
	
	public double getGewicht() {
		return 0;
	}
	
	public int getAnzahl() {
		return 0;
	}
	
	public abstract void printComponent(int level);
}
