package builder;

import java.util.HashMap;

public class Vehicle {

	private String type;
	private HashMap<String, String> parts = new HashMap<String, String>();
	
	public Vehicle(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	
	public void buildPart(String partKey, String partValue) {
		
		parts.put(partKey, partValue);
	}
	
	public String getPart(String partKey) {
		
		return parts.get(partKey);
	}
	
	public void show() {
		
		System.out.println("\n");
		System.out.println("----------------------------------");
		System.out.println("Produkttyp: " + getType());
		System.out.println("Rahmen: " + parts.get("frame"));
		System.out.println("Rahmen: " + parts.get("engine"));
		System.out.println("Rahmen: " + parts.get("wheels"));
		System.out.println("Rahmen: " + parts.get("doors"));

	}
}
