package observer;

import java.util.ArrayList;
import java.util.List;

public class NotificationService implements INotificationService{
	
	private List<INotificationObserver> list=null;
	
	public NotificationService() {
		list=new ArrayList<>();
	}

	@Override
	public void addSubscriber(INotificationObserver observer) {
		list.add(observer);		
		//display();
	}

	

	@Override
	public void removeSubscriber(INotificationObserver observer) {
		list.remove(observer);
		display();
		
	}

	@Override
	public void notifySubscriber() {
		
		System.out.println("Subscribers notified:");
		for(INotificationObserver ob:list)
		{
			ob.OnServerDown();
			
		}
	
		
	}
	
	private void display() {
		
		System.out.println("Subsrcriber List:");
		for(INotificationObserver ob:list)
		{
			ob.OnServerDown();
			
		}
	
		
	}

	
}
