package builder;

public class MotorCycleBuilder extends VehicleBuilder {

	@Override
	public void BuildFrame() {
		vehicle = new Vehicle("Motorrad");
		vehicle.buildPart("frame", "Motorradrahmen");
		
	}

	@Override
	public void BuildEngine() {
		vehicle.buildPart("engine", "500 cc");
		
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
