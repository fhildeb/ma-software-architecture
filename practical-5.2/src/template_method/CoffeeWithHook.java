package template_method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBevarage {

	@Override
	void brew() {
		System.out.println("Der Kaffee läuft gerade tropfend durch den Filter");
		
	}

	@Override
	void addCondiments() {
		System.out.println("Zucker und Milch werden in den Kaffee gegeben");
		
	}
	
	public boolean customerWantsCondiments() {
		
		String answer = getUserInput();
		if(answer.toLowerCase().startsWith("y")) {
			return true;
		}
		else {
			return false;
		}
	}

	private String getUserInput() {
		String answer = null;
		System.out.println("Möchten Sie Zucker und Milch in den Kaffee (y/n)?");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			answer = in.readLine();
		}
		catch(IOException ioe){
			System.err.println("Ein-/Ausgabefehler");
		}
		if(answer == null) {
			return "n";
		}
		return answer;
	}
}
