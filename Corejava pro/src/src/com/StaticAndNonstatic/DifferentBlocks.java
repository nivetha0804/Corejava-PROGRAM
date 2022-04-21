package com.StaticAndNonstatic;

public class DifferentBlocks 
{
	static
	{
		System.out.println("Static executes before main");
	}
	//Normal Block
	{
		System.out.println("Normal Block");
		System.out.println("Normal block will executes an object creation before constructor");
	}
	DifferentBlocks()
	{
		System.out.println("Constructor Block");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Blocks");
		DifferentBlocks db = new DifferentBlocks();
	}
}
