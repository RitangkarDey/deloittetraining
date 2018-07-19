
package inheritance;

public class PassengerMain 
{
	public static void main(String[] args) 
	{
		Passenger p1=new Passenger(1927, "Yamini", 25);
		Passenger p2=new Passenger(1927, "Yamini", 25);
		System.out.println(p1.equals(p2));

	}
}
