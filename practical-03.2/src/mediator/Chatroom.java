package mediator;

import java.util.HashMap;
import java.util.Iterator;

public class Chatroom implements IMediator {

	private HashMap<String, Participant> participants = new HashMap<String, Participant>();
	
	@Override
	public void register(Participant participant) {
		if(participants.get(participant.getName()) == null) {
			participants.put(participant.getName(), participant);
		}
		
		participant.setChatroom(this);
	}

	@Override
	public void send(String from, String to, String message) {
		Participant partDestination = participants.get(to);
		
		if(partDestination != null) {
			partDestination.receive(from, message);
		}
	}

	@Override
	public void sendToAll(String from, String message) {
		String nextKey;
		Iterator<String> it = participants.keySet().iterator();
		
		while(it.hasNext()) {
			nextKey = (String) it.next();
			
			if(nextKey != from) {
				System.out.print("Rundruf: ");
				participants.get(nextKey).receive(from, message);
			}
		}
	}
}
