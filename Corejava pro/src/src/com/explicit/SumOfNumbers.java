package com.explicit;

import java.util.Scanner;

public class SumOfNumbers 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter Value");
		n=sc.nextInt();
		sc.close();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("Sum Of Number="+sum);
	}
}
