package abstractfact;

public class CarFactory {
	
	private CarFactory()
	{
		
	}
	
	public static Car buildCar(CarType type)
	{
			Car car=null;
			
			Location location=Location.USA;
			
			switch(location)
			{
				case USA:
					car=USACarFactory.buildCar(type);
					break;
					
				case INDIA:
					car=IndiaCarFactory.buildCar(type);
					break;
				
				case DEFAULT:
					car=DeafultCarFactory.buildCar(type);
					break;
			}		
			
			return car;
	}

}
