package builder;

public class CarBuilder extends VehicleBuilder {

	@Override
	public void BuildFrame() {
		vehicle = new Vehicle("Auto");
		vehicle.buildPart("frame", "PKW-Kaarosserie");
		
	}

	@Override
	public void BuildEngine() {
		vehicle.buildPart("engine", "2500 cc");
		
	}

	@Override
	public void BuildWheels() {
		vehicle.buildPart("wheels", "4");
		
	}

	@Override
	public void BuildDoors() {
		vehicle.buildPart("doors", "5");
		
	}

}
