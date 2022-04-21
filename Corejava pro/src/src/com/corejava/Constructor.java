package com.corejava;
//Constructor calling from child to parent class

class Parent2
{
	private int sal;
	public Parent2()
	{
		System.out.println("Parent class constructor");
	}
	public Parent2(int sal) 
	{
		this.sal=sal;
		System.out.println("Salary="+sal);
	}
}
class Child2 extends Parent2
{
	public Child2()
	{
		System.out.println("Child class constructor");
	}
	public Child2(int sal) 
	{
		super(sal);//call super class constructor , it should be the first line
		System.out.println("other statements");
	}
}
public class Constructor 
{
	public static void main(String[] args) 
	{
		//Parent ob=new Parent();
		Child2 ob=new Child2(); 
		Child2 ob1=new Child2(456);
	}
}


