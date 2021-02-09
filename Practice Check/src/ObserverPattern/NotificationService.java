package ObserverPattern;
import java.util.*;
public class NotificationService implements INotificationService {
	public List<INotificationObserver> notificationList=new ArrayList<INotificationObserver>();

	@Override
	public void addSubscriber(INotificationObserver notificationObserver) {
	  notificationList.add(notificationObserver);
	  for(INotificationObserver n:notificationList) {
		 System.out.println(n.getName());
	  }
		
	}

	@Override
	public void removeSubscriber(INotificationObserver notificationObserver) {
		notificationList.remove(notificationObserver);
		for(INotificationObserver n:notificationList) {
			 System.out.println(n.getName());
		  }
		
	}

	@Override
	public void notifySubscriber() {
		for(INotificationObserver n:notificationList) {
			n.onServerDown();
		  }
		
	}

}
