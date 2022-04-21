package Thread;
//WAIT AND NOTIFY METHOD
class MyClass1 extends Thread
{
	int Total;
	public void run()
	{
		System.out.println("INSIDE RUN");
		synchronized (this)
		{
			for(int i=1;i<=10;i++)
			{
				Total=Total+i;
			}
			notify();
		}
	}
}
public class ThreadLifeCycle2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		MyClass1 ob=new MyClass1();
		ob.start();
		synchronized (ob) 
		{
			try
			{
				System.out.println("BEFORE WAIT");
				ob.wait();
				System.out.println("AFTER WAIT");
				System.out.println("Total="+ob.Total);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
