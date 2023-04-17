package mediator;

public class Student extends Participant {
	public Student(String name) {
		super(name);
	}

	public void receive(String from, String message) {
		System.out.print("Empfangsprotokoll von Student: ");
		super.receive(from, message);
	}
}
