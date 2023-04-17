package mediator;

public abstract class Participant {

	private Chatroom chatroom;
	private String name;
	
	public Participant(String name) {
		this.name = name;
	}
	
	public void setChatroom(Chatroom chatroom) {
		this.chatroom = chatroom;
	}
	
	public Chatroom getChatroom() {
		return this.chatroom;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void send(String to, String message) {
		chatroom.send(name, to, message);
	}
	
	public void receive(String from, String message) {
		System.out.println("From " + from + " to " + name + ": " + message);
	}
	
	public void sendToAll(String message) {
		chatroom.sendToAll(name, message);
	}
}
