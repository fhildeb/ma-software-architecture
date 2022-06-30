package mediator;

public class Admin extends Participant{

	public Admin(String name) {
		super(name);
	}

	public void receive(String from, String message) {
		System.out.print("Empfangsprotokoll von Admin: ");
		super.receive(from, message);
	}
}
