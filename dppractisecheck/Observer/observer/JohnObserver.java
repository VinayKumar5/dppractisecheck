package observer;

public class JohnObserver implements INotificationObserver{
	
	private String Name;
	

	@Override
	public void OnServerDown() {
		
		System.out.println("Message received to John:"+Name);
		
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}
		
	

}
