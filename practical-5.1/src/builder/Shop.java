package builder;

public class Shop {

	public void construct(VehicleBuilder vehicleBuilder) {
		vehicleBuilder.BuildFrame();
		vehicleBuilder.BuildEngine();
		vehicleBuilder.BuildWheels();
		vehicleBuilder.BuildDoors();
	}
}
