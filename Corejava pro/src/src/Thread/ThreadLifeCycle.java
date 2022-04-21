package Thread;
class MyClass extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i+" "+Thread.currentThread());
		}
	}
}
public class ThreadLifeCycle 
{
	public static void main(String[] args) throws InterruptedException 
	{
		MyClass ob=new MyClass();
		MyClass ob1=new MyClass();
		System.out.println("STATE OF THREAD1 ob "+ob.isAlive());//false	
		System.out.println("STATE OF THREAD2 ob1 "+ob1.isAlive());//false
		ob.start();
		System.out.println("STATE OF THREAD3 ob "+ob.isAlive());//true
		ob.join();
		System.out.println("STATE OF THREAD4 ob "+ob.isAlive());
		ob1.start();
		System.out.println("STATE OF THREAD5 ob1 "+ob.isAlive());
	}
}
