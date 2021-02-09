package ObserverPattern;

public class JohnObserver implements INotificationObserver  {
private String name;
	public void setName(String name) {
	this.name = name;
}

	public JohnObserver(String name) {
	super();
	this.name = name;
}

	@Override
	public String getName() {
		
		return name;
	}

	@Override
	public void onServerDown() {
		System.out.println(name+" Notification Received");
		
	}
	

}
