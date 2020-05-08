package abstractfact;


public abstract class Car
{
	CarType model;
	Location location;

	Car(CarType model, Location location)
	{
	this.model=model;
	this.location=location;
	}

	abstract void construct();

	CarType getModel()
	{
		return model;
	}

	void setModel(CarType Model)
	{
		this.model=model;
	}

	Location getLocation()
	{
		return location;
	}

	void setLocation()
	{
		this.location=location;
	}
	
	@Override
	public String toString()
	{
		return "CarModel-"+model+" location - "+location;
	}
	
}