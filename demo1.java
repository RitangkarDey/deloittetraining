package threaddemo;

public class demo1 extends Thread{
	Thread t1;
	public demo1()
	{
		t1=new Thread(this);
		t1.start();
		System.out.println("t1 started");
	}
	public void run()
	{
		System.out.println("Run called :"+Thread.currentThread().getName());
	}
	public static void main(String[] args) 
	{
	demo1 d=new demo1();
	System.out.println("Hello I am main :"+Thread.currentThread().getName());

	}

}
