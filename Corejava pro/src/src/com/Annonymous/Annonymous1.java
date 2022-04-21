package com.Annonymous;

class Tables
{
	synchronized void printTable(int n) 
	{
		for(int i=1;i<=10;i++) 
		{
			System.out.println(n+"X"+i+"="+n*i);
		}
	}
}
public class Annonymous1 
{
	public static void main(String[] args) 
	{
		Tables t1=new Tables();
		Thread tob=new Thread() 
		{
			public void run()
			{
				System.out.println("Run method");
				t1.printTable(4);
			}
		};
		tob.start();	
		Thread tob1=new Thread() 
		{
			public void run() 
			{
					System.out.println("Run method");
					t1.printTable(10);
			}
		};
				tob1.start();
		}

}


