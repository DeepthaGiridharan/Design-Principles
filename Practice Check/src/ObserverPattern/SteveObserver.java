package ObserverPattern;

public class SteveObserver implements INotificationObserver {
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void onServerDown() {
		System.out.println(name+" Notification Received");
		
	}

	@Override
	public String getName() {
		
		return name;
	}

	public SteveObserver(String name) {
		super();
		this.name = "Steve";
	}
	

}
