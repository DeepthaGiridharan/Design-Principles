package Mediator;

public class ChatApplication {
	public static void main(String[] args) {
		IUser user1 = new PremiumUser("Radha");
		IUser user2 = new BasicUser("Sita");
		IUser user3 = new BasicUser("Gita");
		IUser user4 = new BasicUser("Hari");
		IUser user5 = new PremiumUser("Ramesh");

		ChatMediator chatMediator = new ChatMediator();
		chatMediator.addUser(user2);
		chatMediator.addUser(user3);
		chatMediator.addUser(user4);
		chatMediator.addUser(user5);

		user1.sendMessage("Good Morning!");
	}

}