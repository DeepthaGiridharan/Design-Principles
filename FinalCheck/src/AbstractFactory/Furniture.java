package AbstractFactory;

public class Furniture extends Product {

	public Furniture(Channel channel) {
		super(channel,ProductType.FURNITURE);
		this.processOrder();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void processOrder() {
		System.out.println("Processing furniture order");

	}

}
