package abstractfact;

public class DeafultCarFactory {
	
	
	static Car buildCar(CarType model)
	{
		Car car=null;
		switch(model)
		{
			case MICRO:
				car=new MicroCar(Location.DEFAULT);
				break;
				
			case MINI:
				car=new MiniCar(Location.DEFAULT);
				break;
				
			case LUXURY:
				car=new LuxuryCar(Location.DEFAULT);
				break;	
		}
		
		return car;		
	}

}
