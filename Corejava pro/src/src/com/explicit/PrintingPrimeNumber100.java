package com.explicit;

import java.util.Scanner;

public class PrintingPrimeNumber100 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter value");
		n=sc.nextInt();
		sc.close();
		int count=0;
		for(int i=1;i<=n;i++)
		{
			count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(i+",");
			}
		}
	}
}
