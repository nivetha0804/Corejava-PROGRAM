package com.explicit;
//reverse the given number
//ex:654  output:456
public class Sum6 
{
	public static void main(String[] args)   
	{  
		int number = 654, reverse = 0;    
		for( ;number != 0; number=number/10)   
		{  
			int remainder = number % 10;  
			reverse = reverse * 10 + remainder;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);  
	}
}

