package com.explicit;

import java.util.Scanner;

public class ReverseNumber 
{
	static void reversenumberCheckPalindrome()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		int n1=n;
		int d,rev=0;
		while(n!=0)  //n=123   n=12
		{
			d=n%10;  //d=3     d=2
			rev=rev*10+d;  //rev=0*10+3=3     rev=3*10+2=32
			n=n/10;
		}
		System.out.println("Reversed number= "+rev);		
		if(n1==rev)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not apalindrome");
		}
	}
}
