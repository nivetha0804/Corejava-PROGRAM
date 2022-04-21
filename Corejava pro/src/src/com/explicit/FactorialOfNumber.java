package com.explicit;

import java.util.Scanner;

public class FactorialOfNumber 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	int n;
	System.out.println("Enter the number");
	n=sc.nextInt();
	sc.close();
	int Sum=0;
	int fact=1;
	for(int i=1;i<=n;i++)
	{
		fact=1;
		for(int j=1;j<=i;j++)
		{
			Sum=Sum+(fact*i);
		}
	}
	System.out.println(Sum);
}
}
