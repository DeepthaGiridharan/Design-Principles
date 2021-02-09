package ObserverPattern;

public class Admin2 implements IAdminObserver{
	private String name;
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void notifyMessage() {
		System.out.println(name+" Notification Received");
		
	}
	public Admin2(String name) {
		super();
		this.name = name;
	}

	
	

}
