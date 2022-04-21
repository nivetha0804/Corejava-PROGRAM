package Thread;

class HelloThread extends Thread
{
	public HelloThread(String string)
	{
		super(string);//super class constructor
	}
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("i="+i+" thread name"+Thread.currentThread());

			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
public class MyMainApp 
{
	public static void main(String[] args) throws InterruptedException {
		HelloThread tob1=new HelloThread("First");
		HelloThread tob2=new HelloThread("Second");
		tob1.start();
		tob1.join();
		tob2.start();
	}
}
