package com.explicit;

import java.util.Scanner;

public class SumofDigits 
{
	public static void main(String[] args) 
	{
			Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter a Number");
		n=sc.nextInt();
		int temp=n;
		int digits=0,sum=0,rev=0;
		//int n1=n;
		//int d,rev=0;
		while(n>0)  //n=123   n=12
		{
			digits=n%10;  //d=3     d=2
			rev=rev*10+digits;  //rev=0*10+3=3     rev=3*10+2=32
			sum=sum+digits;
			n=n/10;
		}
		System.out.println("Reversed number= "+rev);		
		if(temp==rev)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}
}
	