package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class NotificationService implements INotificationService {
	private List<IAdminObserver> notificationList=new ArrayList<IAdminObserver>();
	@Override
	public void addSubscriber(IAdminObserver adminObserver) {
		notificationList.add(adminObserver);
		for(IAdminObserver n:notificationList) {
			 System.out.println(n.getName());
		  }
		
	}

	@Override
	public void removeSubscriber(IAdminObserver adminObserver) {
		notificationList.remove(adminObserver);
		for(IAdminObserver n:notificationList) {
			 System.out.println(n.getName());
		  }
		
	}

	@Override
	public void notifyEvent(int ticketcnt) {
	if(ticketcnt>100)
	{for(IAdminObserver n:notificationList) {
		n.notifyMessage();
	  }
		
	}
	}
	

}
