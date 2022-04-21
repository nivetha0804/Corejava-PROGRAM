package com.java8NewFeatures;
// java8 allows you to create a method with the body.
//we can have default and static method.
interface MyInt
{
	void m1();
	default void m2()
	{
		System.out.println("m2 method implementation");
	}
	static void m3()
	{
		System.out.println("m3 static method");
	}
}
class MyClass implements MyInt
{
	public void m1()
	{
		System.out.println("m1 interface abstract method");
	}
}
public class InterfaceMethod
{
	public static void main(String[] args) 
	{
	MyClass mc=new MyClass();
	mc.m1();
	mc.m2();
	MyInt.m3();
	}
}

