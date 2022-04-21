package com.corejava;

import java.util.Scanner;

class Parent1
{
	private int sal; //data accessed with in class , scope is with in class
	public String name;
	protected int age;
	int accno;
	void input() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Age");
		age=sc.nextInt();
		System.out.println("Enter Salary");
		sal=sc.nextInt();
		System.out.println("Enter Accno");
		accno=sc.nextInt();
		System.out.println("Enter Name");
		name=sc.next();
		sc.close();
	}
	void printSal() 
	{
		System.out.println("Salary="+sal);
	}
}
class Child1 extends Parent1
{ //dependent class
	void display() 
	{
		//System.out.println("sal ="+sal); //private not accesseble
		System.out.println("Name="+name);
		System.out.println("Age="+age);
		System.out.println("Accno="+accno);
	}
}
public class Inheritance 
{  //indepent class
	public static void main(String[] args) 
	{
		Child1 ob=new Child1();
		ob.input();
		ob.display();
		ob.printSal();		
	}
}

