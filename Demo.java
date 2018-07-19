
public class Demo 
{
	public int addnum(int a,int b)
	{
		return a+b;
	}
	public static void main(String[] args) 
	{
		Demo d= new Demo();
		int sum=0;
		sum+=d.addnum(12, 15);
		sum+=d.addnum(3, 4);
		sum+=d.addnum(8, 21);
		System.out.println(sum);

	}
}
