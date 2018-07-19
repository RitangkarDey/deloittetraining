
public class Client 
{
	public static void main(String[] args) 
	{
		CustomerDetails c=new CustomerDetails(9,9000);
		c.setCustName("Tintin");
		c.disp();
		int result = calc();
		System.out.println(result);
	}

	public static int calc() {
		int a=0, b=0;
		int result=a+b;
		return result;
	}
}
