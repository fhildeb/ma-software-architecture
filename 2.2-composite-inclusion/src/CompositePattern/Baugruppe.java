package CompositePattern;

import java.util.ArrayList;

public class Baugruppe extends Component{

	private String bezeichnung;
	private ArrayList<BaugruppenPosition> children = new ArrayList<>();
	
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
		
		for (BaugruppenPosition p : children) {
			endpreis += p.getKomponente().getPreis() * p.getMenge();
		}
		return endpreis;
	}
	
	public double getGewicht() {
		double endgewicht = 0;
		
		for (BaugruppenPosition p : children) {
			endgewicht += p.getKomponente().getGewicht() * p.getMenge();
		}
		return endgewicht;
	}
	
	public int getAnzahl() {
		
		return children.size();
	}
	
	@Override
	public void printComponent(int level, double menge, long posNr) {
		String organize = "---";
		String quantity = ".";
		String subbuffer = quantity.repeat(10*level);
		System.out.println(organize + "-+Baugruppe:" + getBezeichnung() + " (ID-" + posNr + ")" + ", Preis: " + getPreis() * menge + " € , Gewicht: " + getGewicht() * menge + " Gramm");
		for (BaugruppenPosition p : children) {
			if( p.getKomponente() instanceof Einzelteil) {
				System.out.print(subbuffer.repeat(1));
				System.out.print(String.format("%04d", (int) (p.getMenge() * menge)) + "x");
				p.getKomponente().printComponent(level+1, p.getMenge() * menge, p.getPosNr());
			}
			else {
				System.out.print(subbuffer.repeat(1));
				System.out.print(String.format("%04d", (int) (p.getMenge() * menge)) + "x");
				p.getKomponente().printComponent(level+1, p.getMenge() * menge, p.getPosNr());
			}
		}
	}
	
	public void add(BaugruppenPosition position) {
		if(children.size() > 0) {
			for(int i=0; i < children.size();){

				if(children.get(i).getPosNr() == position.getPosNr()) {
					System.out.println("Fehler: Gegenstand mit ID-" + position.getPosNr() + " existiert bereits!");
					System.out.println("      : Er wurde nicht hinzugefügt. \n");
					break;
				}
				else {
					children.add(position);
					break;
				}
			}
		}
		else {
			children.add(position);	
		}
	}

	public void remove(BaugruppenPosition position) {
		for (BaugruppenPosition p : children) {
			if (p == position) {
				children.remove(children.indexOf(p));
			}
		}
	}

	public ArrayList<BaugruppenPosition> getChildren() {
		return children;
	}
}
