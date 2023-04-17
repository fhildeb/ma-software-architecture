package CompositePattern;

public class BaugruppenPosition {

	private long posNr;
	private double menge;
	private Component komponente;
	
	public BaugruppenPosition(long posNr, double menge, Component komponente) {
		this.posNr = posNr;
		this.menge = menge;
		this.komponente = komponente;
	}

	public long getPosNr() {
		return posNr;
	}

	public void setPosNr(long posNr) {
		this.posNr = posNr;
	}

	public double getMenge() {
		return menge;
	}

	public void setMenge(double menge) {
		this.menge = menge;
	}

	public Component getKomponente() {
		return komponente;
	}

	public void setKomponente(Component komponente) {
		this.komponente = komponente;
	}

	public void printComponent(int level) {
		System.out.print(String.format("%04d", (int) getMenge()) + "x");
		getKomponente().printComponent(level, getMenge(), getPosNr());
	}
}
