package com.corejava;

import java.util.Scanner;

class Parent0
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




