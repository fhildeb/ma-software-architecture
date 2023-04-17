package builder;

public class BikeBuilder extends VehicleBuilder{

	@Override
	public void BuildFrame() {
		vehicle = new Vehicle("Fahrrad");
		vehicle.buildPart("frame", "Aluminiumrahmen");
		
	}

	@Override
	public void BuildEngine() {
		vehicle.buildPart("engine", "Gangschaltung Shimano");
		
	}

	@Override
	public void BuildWheels() {
		vehicle.buildPart("wheels", "2");
		
	}

	@Override
	public void BuildDoors() {
		vehicle.buildPart("doors", "0");
		
	}
}
