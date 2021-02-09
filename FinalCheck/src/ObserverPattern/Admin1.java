package ObserverPattern;

public class Admin1 implements IAdminObserver {
private String name;
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name ;
	}

	public Admin1(String name) {
		super();
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void notifyMessage() {
		System.out.println(name+" Notification Received");
		
	}

}
