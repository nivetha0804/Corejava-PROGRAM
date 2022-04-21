package Thread;

class Bank
{
	static int Amount=10000;
	synchronized void deposit(int damt)
	{
		System.out.println("DEPOSIT METHOD");
		Amount=Amount+damt;
		System.out.println("AMOUNT AFTER DEPOSIT "+Amount);
		System.out.println("DEPOSITED IS COMPLETED");
		notify();
	}
	synchronized void withdraw(int wamt) throws InterruptedException
	{
		System.out.println("WITHDRAW METHOD");
		if(wamt>Amount)
		{
			wait();
		}
		else
		{
			Amount=Amount-wamt;
			System.out.println("AMOUNT AFTER WITHDRAW "+Amount);
		}
	}
}
public class MainBank 
{
	public static void main(String[] args) 
	{
		Bank ob=new Bank();
		new Thread()
		{
			public void run()
			{
				ob.deposit(20000);
			}
		}.start();
		new Thread()
		{
			public void run()
			{
				try {
					ob.withdraw(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}.start();
	}
}
