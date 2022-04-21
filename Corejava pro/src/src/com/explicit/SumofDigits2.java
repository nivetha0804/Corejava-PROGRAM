package com.explicit;

import java.util.Scanner;

public class SumofDigits2 
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
int n;
System.out.println("Enter value");
n=sc.nextInt();
sc.close();
int digit=0,sum=0;
int count=0;
while(n>0)
{
	digit=n%10;
	sum=sum+digit;
	n=n/10;
	count=count+1;
}
System.out.println("Sum is "+sum);
System.out.println("Count is "+count);
}
}
