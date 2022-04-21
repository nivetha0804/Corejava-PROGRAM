package Thread;
//Creating thread by implementing runnable interface
class MyThread1 implements Runnable
{
	@Override
	public void run()
	{
		System.out.println("INSIDE RUN METHOD"+Thread.currentThread());
	}
}
public class MainRunnable {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		MyThread1 mt =new MyThread1();
		//start method is defined in thread
		//create an object of thread
		Thread tob=new Thread(mt);
		tob.setName("My first name");
		tob.start();
		tob.join();
		Thread tob1=new Thread(mt);
		tob1.setName("My second name");
		tob1.start();
		tob1.join();
		Thread tob2=new Thread(mt);
		tob2.setName("My third name");
		tob2.start();
		tob2.join();
	}

}
