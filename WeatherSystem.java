import java.util.Scanner;
public class WeatherSystem 
{
	double cel=0;
	public double conversion(double temp,int choice) //converts the temperature
	{
		if(choice==1)
		{
			cel=(5*(temp-32))/19;//conversion 
		}
		else
			cel=temp;
		
		WeatherSystem a=new WeatherSystem();
		a.check(cel); //calls the temperature range check method
		return cel;
	}
	public void check(double cel) //checks if the temperature is beyond range
	{
		if(cel>60 || cel<-10)
		{
			System.out.println("WARNING: Temperature is beyond range");
		}
		else
		{
			System.out.println("Temperature is okay");
		}
	}
	
	public static void main(String[] args) 
	{	
	    int i=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 1 for Fahrenheit or 2 for Celcius");
		int choice=sc.nextInt();
		while(choice<1 || choice>2)
		{
			System.out.println("Enter a valid choice :"); //asks to enter a valid choice for temperature unit
			choice=sc.nextInt();
		}
		System.out.println("How many city temperature you want to enter:"); //asks for how many city temperature is to be entered
		int n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
		System.out.println("Enter temperature : "); //asks for temperature
		double temp=sc.nextDouble();
		WeatherSystem w=new WeatherSystem();
		w.conversion(temp,choice);//calls the conversion table
		}
		
	}

}
