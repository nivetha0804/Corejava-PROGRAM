package com.Annonymous;

class Table
{
	void printTable(int n)
	{
		for(int i=1;i<=10;i++)
			System.out.println(n+"X"+i+"="+n*i);
	}
}
public class Annonymous 
{
	public static void main(String[] args) 
	{
		//Annonymous class
		Thread tob=new Thread()
		{
			public void run()
			{
				System.out.println("1.Run Method");
			}
		};
		tob.start();
		//or
		new Thread()
		{
			public void run()
			{
				System.out.println("2.Run Method");
			}
		}.start();

		Runnable rob=new Runnable()
		{
			public void run()
			{
				System.out.println("3.Runnable Run Method");
			}
		};
		Thread tob1=new Thread(rob);
		tob1.start();
	}
}

