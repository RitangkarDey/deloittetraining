public class Hello 
{
	public void display()
	{
		System.out.println("Display called");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Hello and welcome to IDE");
		Hello h=new Hello();
		h.display();
		Employee emp=new Employee();
		emp.getdetails();
	}

}
