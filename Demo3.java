package threaddemo;

public class Demo3 extends Thread
{
	public Demo3(int i)
	{
		super(i+"");
		start();
	}
	@Override
	public void run()
	{
		System.out.println("Run called by :"+currentThread().getName());
	}

	public static void main(String[] args) 
	{
		for (int i=1;i<=10;i++)
		{
			new Demo3(i);
		}
	}

}
