package com.explicit;

import java.util.Scanner;

public class PrimeName 
{
	static void checkPrime()
	{
		int c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		sc.close();
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				c++;
			}
		}
		if(c==2)
		{
			System.out.println(n+" is prime");
		}
		else {
			System.out.println(n+" is not prime");
		}

	}
	public static void main(String[] args) 
	{
	checkPrime();	
	}
}
