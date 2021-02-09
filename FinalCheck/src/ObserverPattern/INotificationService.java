package ObserverPattern;

public interface INotificationService {
	
		public void addSubscriber(IAdminObserver adminObserver);
		public void removeSubscriber(IAdminObserver adminObserver);
		public void notifyEvent(int ticketcnt);

		

}
