package ObserverPattern;

public interface INotificationService {
public void addSubscriber(INotificationObserver notificationObserver);
public void removeSubscriber(INotificationObserver notificationObserver);
public void notifySubscriber();

}
