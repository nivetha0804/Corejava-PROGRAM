package Thread;

class Table
{
	synchronized void printTable(int n)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+"X"+n+"="+i*n);
		}
	}
}
class FirstThread extends Thread
{
	Table t;
	public FirstThread(Table t) 
	{		
		this.t=t;
	}
	public void run()
	{
		t.printTable(5);
	}
}
class SecondThread extends Thread
{
	Table t;
	public SecondThread(Table t) 
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(10);
	}
}
public class MainTableThread 
{
	public static void main(String[] args) throws InterruptedException 
	{
		Table tob=new Table();
		FirstThread t1=new FirstThread(tob);
		SecondThread t2=new SecondThread(tob);
		t1.start();
		t1.join();
		t2.start();
	}
}
