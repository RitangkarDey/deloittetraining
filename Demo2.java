package threaddemo;

class print
{
	public synchronized static void printsomething(String firstname, String lastname)
	{
		System.out.println("welcome "+firstname);
		System.out.println("bye "+lastname);
	}
}
public class Demo2 extends Thread{
private String firstname;
private String lastname;
	public Demo2(int i,String firstname, String lastname)
	{
		super(i+"");
		this.firstname=firstname;
		this.lastname = lastname;
		start();
	}
	@Override
	public void run() {
		print.printsomething(firstname,lastname);
	}
	public static void main(String[] args) {
		new Demo2(1, "tufail","ahmed");
		new Demo2(2, "raghav","tibdewal");
		new Demo2(3, "pooja","agarwal");
		new Demo2(4, "nidhi","bhatia");
	}
}