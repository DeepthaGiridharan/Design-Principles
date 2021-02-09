package AbstractFactory;

public class FurnitureOrder extends Order{

	@Override
	public Product processOrder(Channel channel, ProductType productType) {
		// TODO Auto-generated method stub
		return new Furniture(channel);
	}

}
