package com.explicit;

import java.util.Scanner;

public class Armstrong 
{
	public static void main(String args[]) 
	{
		Scanner in = new Scanner(System.in);
		int n;
		System.out.print("Enter Number: ");
		n= in.nextInt();
		int temp=n;
		int digit=0,sum=0,res=0,output=0;
		in.close();
		while (n>0) 
		{
			digit=n%10;
			res=(digit*digit*digit);
			output=output+res;
			sum=sum+digit;
			n=n/10;
		}
		System.out.println(output);
		if (temp==output)
		{
			System.out.println("It is an Armstrong number");
		}
		else
		{
			System.out.println("It is not an Armstrong number");
		}
	}
}


