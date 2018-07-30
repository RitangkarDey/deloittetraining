package threaddemo;
//creating thread with anonymous class

public class Demo4 {

	public static void main(String[] args) 
	{
		System.out.println("Main called by :"+Thread.currentThread().getName());
		Thread t1=new Thread()
				{
					@Override
					public void run()
					{
						System.out.println("Run called by :"+Thread.currentThread().getName());
					}
					
				};
				t1.start();

	}

}
