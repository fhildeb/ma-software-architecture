package builder;

public class ScooterBuilder extends VehicleBuilder{

	@Override
	public void BuildFrame() {
		vehicle = new Vehicle("Motorroller");
		vehicle.buildPart("frame", "Motorroller-Rahmen");
		
	}

	@Override
	public void BuildEngine() {
		vehicle.buildPart("engine", "2500 cc");
		
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
