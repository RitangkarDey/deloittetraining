package inheritance;
abstract class Vehicle 
{
	int price;
	public Vehicle()
	{
		System.out.println("Vehicle called");
	}
	public abstract void start();
	public abstract void stop();
	public void music()
	{
		System.out.println("Music");
	}
}
class Car extends Vehicle
{
	@Override
	public void start() 
	{
		System.out.println("Start car");
	}
	@Override
	public void stop() 
	{
		System.out.println("Stop car");
	}
}

	
