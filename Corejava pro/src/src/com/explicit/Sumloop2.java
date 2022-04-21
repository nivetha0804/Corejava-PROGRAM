package com.explicit;
//1-2+3-4+5-6+7-8+10
public class Sumloop2 
{
	public static void main(String[] args) 
	{
		int i,sum=0;
		for(i=1;i<=10;i++)
		{
			if(i%2==0)
				sum=sum-(i);
			else
				sum=sum+i;
		}
		System.out.println("Sum of numbers= "+sum);
	}
}


