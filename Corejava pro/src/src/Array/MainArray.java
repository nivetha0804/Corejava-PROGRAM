package Array;

import java.util.Scanner;

public class MainArray 
{
	public static void main(String[] args) 
	{
		//int i,l,k,l,m;
		//datatype vari_name[]=new datatype[size];
		int ar[]=new int[5];   //declaration
		ar[0]=34;  //ar->subscript  0->index
		ar[1]=30;
		ar[2]=25;
		ar[3]=35;
		ar[4]=40;
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		System.out.println(ar[3]);
		System.out.println(ar[4]);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Array Elements="+ar.length);
		//Reading array or input elements into array
		/*for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}*/
		//displaying array elements
		System.out.println("Array Elements Are");
		sc.close();
		for(int i=0;i<5;i++)
		{
			System.out.println(ar[i]);
		}
		//sum
		System.out.println("Sun Of All Array Elements");
		int s=0;
		for(int i=0;i<ar.length;i++)
		{
			s=s+ar[i];
		}
		System.out.println("Sum="+s);
		System.out.println("Average="+(float)s/ar.length);
		//find maximum of array element
		int max=ar[0];
		for(int i=1;i<ar.length;i++)
		{
			if(ar[i]>max) 
			{
				max=ar[i];
			}
		}
		System.out.println("Maximum of array element is="+max);
		//find minimum of array element
		int min=ar[0];
		for(int i=1;i<ar.length;i++) 
		{
			if(ar[i]<min) 
			{
				min=ar[i];
			}
		}
		System.out.println("Minimum of array element is="+min);
	}
}


