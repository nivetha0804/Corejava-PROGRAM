package Thread;
class Child extends Thread
{
	public void run()
	{
		System.out.println("Inside run "+Thread.currentThread());
	}
}
public class Extend 
{
	public static void main(String[] args) 
	{
		System.out.println(Thread.currentThread());	
		Child ob=new Child();
		Child ob1=new Child();
		ob.start();
		ob1.start();
	}


}
