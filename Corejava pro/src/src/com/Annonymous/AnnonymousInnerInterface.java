package com.Annonymous;

interface MyInt
{
	void add();
	void sub();
}
public class AnnonymousInnerInterface 
{
	public static void main(String[] args) 
	{
		MyInt ob=new MyInt()
		{
			@Override
			public void add()
			{
				System.out.println("ADD");
			}
			@Override
			public void sub()
			{
				System.out.println("SUB");
			}
		};
		ob.add();
		ob.sub();
	}
}
