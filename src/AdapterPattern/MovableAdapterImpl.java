package AdapterPattern;

public class MovableAdapterImpl implements MovableAdapter { 
	private Movable luxuryCars; // standard constructors
	public MovableAdapterImpl(Movable bugattiVeyron) {
		// TODO Auto-generated constructor stub
	}
	@Override public double getSpeed() 
	{ return convertMPHtoKMPH(luxuryCars.getSpeed()); } 
	private double convertMPHtoKMPH(double mph) 
	{ return mph * 1.60934; }
	
	@Override
	public double getPrice() {
		return convertUSDToEuro(luxuryCars.getPrice());
	}

	private double convertUSDToEuro(double usd) {
		return usd * 0.84;
	}
}