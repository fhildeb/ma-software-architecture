package CompositePattern;

public class Einzelteil extends Component{

	private String bezeichnung;
	private double preis;
	private double gewicht;
	
	public Einzelteil(String bezeichnung, double preis, double gewicht) {
		this.bezeichnung = bezeichnung;
		this.preis = preis;
		this.gewicht = gewicht;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}
	
	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}
	
	public double getPreis() {
		return Math.round(preis*100)/100;
	}

	public void setGewicht(double gewicht) {
		this.gewicht = gewicht;
	}
	
	public double getGewicht() {
		return Math.round(gewicht*100)/100;
	}

	@Override
	public void printComponent(int level) {
		String organize = "----";
		String buffer = organize.repeat((level));
		System.out.println(buffer + "--Einzelteil: " + getBezeichnung() + ", Preis: " + getPreis() + " € , Gewicht: " + getGewicht() + " Gramm");
	}

}
