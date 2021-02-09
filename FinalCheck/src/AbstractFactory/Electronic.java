package AbstractFactory;

public class Electronic extends Product {

	public Electronic(Channel channel) {
		super(channel, ProductType.ELECTRONICS);
		this.processOrder();
		
	}

	@Override
	public void processOrder() {
	
		System.out.println("Processing electronic order");
	}

}
