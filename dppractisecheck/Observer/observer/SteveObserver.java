package observer;

public class SteveObserver implements INotificationObserver{
	
	private String Name;
	
	

	@Override
	public void OnServerDown() {		
		System.out.println("Message received to Steve:"+Name);
		
	}



	public String getName() {
		return Name;
	}



	public void setName(String name) {
		Name = name;
	}
	
	
	

}
