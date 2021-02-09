package AbstractFactory;
enum ProductType {
	ELECTRONICS, TOYS, FURNITURE
}

enum Channel {
	E_COMMERCE, TELE_CALLER
}
public abstract class Product {
	Channel channel=null;
	ProductType productType=null;
	public Channel getChannel() {
		return channel;
	}
	public  void setChannel(Channel channel) {
		this.channel = channel;
	}
	@Override
	public String toString() {
		return "Product [channel=" + channel + ", productType=" + productType + "]";
	}
	public ProductType getProductType() {
		return productType;
	}
	public void setProductType(ProductType productType) {
		this.productType = productType;
	}
	public Product(Channel channel, ProductType productType) {
		super();
		this.channel = channel;
		this.productType = productType;
	}
	public abstract void  processOrder();	

}
