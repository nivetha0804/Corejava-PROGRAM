package com.Annonymous;

class Table01
{
	void printTable(int n)
	{
		for(int i=1;i<=10;i++)
			System.out.println(n+"X"+i+"="+n*i);
	}
}
public class Annonymous01
{
	public static void main(String[] args) 
	{
		Table01 table=new Table01();
		Thread tob=new Thread()
		{
			public void run()
			{
				System.out.println("1.Run Method");
				table.printTable(4);
			}
		};
		tob.start();
	}
}

