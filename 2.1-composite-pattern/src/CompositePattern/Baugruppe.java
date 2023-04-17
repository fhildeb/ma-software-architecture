package CompositePattern;

import java.util.ArrayList;

public class Baugruppe extends Component{

	private String bezeichnung;
	private ArrayList<Component> children = new ArrayList<>();
	
	public Baugruppe(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}
	
	public String getBezeichnung() {
		return bezeichnung;
	}
	
	public double getPreis() {
		double endpreis = 0;
		
		for (Component c : children) {
			endpreis += c.getPreis();
		}
		return endpreis;
	}
	
	public double getGewicht() {
		double endgewicht = 0;
		
		for (Component c : children) {
			endgewicht += c.getGewicht();
		}
		return endgewicht;
	}
	
	public int getAnzahl() {
		
		return children.size();
	}
	
	@Override
	public void printComponent(int level) {
		int current_level = level-1;
		String organize = "----";
		String buffer = organize.repeat(current_level);
		System.out.println(buffer + "-+Baugruppe: " + getBezeichnung() + ", Preis: " + getPreis() + " € , Gewicht: " + getGewicht() + " Gramm");
		for (Component c : children) {
			if( c instanceof Einzelteil) {
				c.printComponent(current_level+1);
			}
			else {
				c.printComponent(current_level+2);
			}
		}
	}
	
	public void add(Component child) {
		children.add(child);
	}

	public void remove(Component child) {
		for (Component c : children) {
			if (c == child) {
				children.remove(children.indexOf(c));
			}
		}
	}
}
