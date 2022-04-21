package com.corejava;

class AddOverload
{
	void add(int i,int j)
	{
		int s;
		s=i+j;
		System.out.println("The sum of INT value "+i+" and "+j+" is "+s+" ");
	}
	void add(float i, float j, float k)
	{
		float l;
		l=i+j+k;
		System.out.println("The sum of FLOAT value "+i+" , "+j+" and "+k+" is "+l+" ");	
	}
	void add(double i, double j, double k)
	{
		double l;
		l=i+j+k;
		System.out.println("The sum of DOUBLE value "+i+" , "+j+" and "+k+" is "+l+" ");
	}
}
public class Poly
{
	public static void main(String[] args) 
	{
		AddOverload ao=new AddOverload();
		ao.add(9, 8);
		ao.add(5.5f, 6.5f, 7.5f);
		ao.add(6.5, 7.5, 8.5);
	}
}



