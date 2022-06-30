package builder;

public class ProgramMain {

	private static Shop shop;
	
	public static void main(String[] args) {
		
		System.out.println("Praktikum 5.1: Builder Pattern");
		System.out.println("Beispiel: Fahrzeugkonstruktion");

		shop = new Shop();
		VehicleBuilder scooterBuild = new ScooterBuilder();
		VehicleBuilder carBuild= new CarBuilder();
		VehicleBuilder motorCycleBuild = new MotorCycleBuilder();
		VehicleBuilder bikeBuild = new BikeBuilder();
		
		
		shop.construct(scooterBuild);
		scooterBuild.getVehicle().show();
		
		shop.construct(carBuild);
		carBuild.getVehicle().show();
		
		shop.construct(motorCycleBuild);
		motorCycleBuild.getVehicle().show();
		
		shop.construct(bikeBuild);
		bikeBuild.getVehicle().show();
	}
}
