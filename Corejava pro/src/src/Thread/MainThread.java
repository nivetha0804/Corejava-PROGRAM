package Thread;

class Hello
{
	void display()
	{
		System.out.println("Hello Display"+Thread.currentThread());
	}
}
public class MainThread 
{
	public static void main(String[] args) 
	{
		System.out.println(Thread.currentThread());	
		Hello ob=new Hello();
		ob.display();
	}
}
