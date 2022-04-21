package com.explicit;
//1!+2!+3!+4!+5!+6!
public class Sum4 
{
	public static void main(String[] args) 
	{
		int f;
		int s=0;
		for(int i=1;i<=6;i++)
		{
			f=1;
			for(int j=1;j<=i;j++)
			{
				f=f*j;
			}
			s=s+f;
		}
		System.out.println("Sum of series= "+s);
	}
}
