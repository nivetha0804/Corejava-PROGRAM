package com.StaticAndNonstatic;
abstract class Area
{
	abstract void calArea();
	Area()
	{
		System.out.println("Abstract class can have constructor");
	}
	void display()
	{
		System.out.println("Method with the body");
	}
}
class Reactangle extends Area
{
	@Override
	void calArea()
	{
		int l=3;
		int b=4;
		int area=l*b;
		System.out.println("Area of Reactangle="+area);
	}
}
public class Abstraction 
{
	public static void main(String[] args) 
	{
		Reactangle rc=new Reactangle();
		rc.calArea();
	}
}
