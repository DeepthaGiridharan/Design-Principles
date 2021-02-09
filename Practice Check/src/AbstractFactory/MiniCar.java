package AbstractFactory;

public class MiniCar extends Car {

	public MiniCar(Location location) {
		super(CarType.MINI, location);
		
	}

	@Override
	public void construct() {
		System.out.println("Connecting to mini car");
	}

}
