package builder;

public abstract class VehicleBuilder {

	protected Vehicle vehicle;
	
	public Vehicle getVehicle() {
		return vehicle;
	}
	
	public abstract void BuildFrame();
	public abstract void BuildEngine();
	public abstract void BuildWheels();
	public abstract void BuildDoors();
}
