package mediator;

public class ProgramMain {

	public static void main(String[] args) {

		System.out.println("Mediator Beispiel - Konsolenanwendung");
		
		Chatroom chatroom = new Chatroom();
		
		Participant tim = new Admin("Tim");
		Participant tom = new Admin("Tom");
		Participant lea = new Student("Lea");
		Participant ina = new Student("Ina");
		
		chatroom.register(tim);
		chatroom.register(tom);
		chatroom.register(lea);
		chatroom.register(ina);
		
		tim.send("Tom", "Ich liebe dich");
		lea.send("Ina", "Ich liebe dich auch");
		lea.send("Tim", "Ich liebe dich auch voll");
		ina.send("Lea", "Ich liebe dich auch voll doll");
		
		ina.sendToAll("Nachricht an alle");
	}

}
