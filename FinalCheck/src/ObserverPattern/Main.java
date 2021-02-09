package ObserverPattern;

public class Main {
	public static void main(String[] args) {

		IAdminObserver admin1 = new Admin1("admin1");
		IAdminObserver admin2 = new Admin2("admin2");
		NotificationService notificationService = new NotificationService();
		notificationService.addSubscriber(admin1);
		notificationService.addSubscriber(admin2);
		notificationService.notifyEvent(150);
		notificationService.notifyEvent(200);
		notificationService.removeSubscriber(admin2);

	}
}
