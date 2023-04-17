package mediator;

public interface IMediator {

	public void register(Participant participant);
	public void send(String from, String to, String message);
	
	public void sendToAll(String from, String message);
}
