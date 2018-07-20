/**
 * 
 */
package assessment;

import java.util.Scanner;

/**
 * @author HELLO
 *
 */
public interface PhysicalConstants 
{
	double lightspeed=299792458;
	double gravconst=6.67428*Math.pow(10, -11);
	double g=9.80665;

}
class Application implements PhysicalConstants
{
	public void calculate(double mass)
	{
		double e=mass*(lightspeed*lightspeed);
		System.out.println("E =  "+e);
	}
	public void calculate(double m1,double m2,double r) 
	{
		double f=gravconst*((m1*m2)/(r*r));
		System.out.println("F = "+f);
	}
	public void calculate(double t,int choice)
	{
		double d=0.5*g*t;
		System.out.println("D = "+d);
	}
	
}
class Call extends Application
{
	public static void main(String[] args)
	{
		Application a=new Application();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a choice of operation : \n 1) For Energy \n 2) For Force \n 3) For Distance");
		int choice=sc.nextInt();
		while(choice<1 || choice>3)
		{
			System.out.println("Enter a valid choice:");
			choice=sc.nextInt();
		}
		if(choice==1)
		{
			System.out.println("Enter Mass :");
			double mass=sc.nextDouble();
			a.calculate(mass);
		}
		else if(choice==2)
		{
			System.out.println("Enter M1 :");
			double m1=sc.nextDouble();
			System.out.println("Enter M2 :");
			double m2=sc.nextDouble();
			System.out.println("Enter R :");
			double r=sc.nextDouble();
			a.calculate(m1,m2,r);
		}
		else if(choice==3)
		{
			System.out.println("Enter Time :");
			double t=sc.nextDouble();
			a.calculate(t,choice);
		}
		
	}
}