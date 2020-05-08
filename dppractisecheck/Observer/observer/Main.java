package observer;

public class Main {
	
	public static void main(String[] args) {
		
		
		JohnObserver john=new JohnObserver();
		john.setName("John");
		SteveObserver steve=new SteveObserver();
		steve.setName("Steve");
		
		NotificationService service=new NotificationService();
		service.addSubscriber(steve);
		service.addSubscriber(john);
		service.notifySubscriber();
		service.removeSubscriber(steve);		
		
	}

}
