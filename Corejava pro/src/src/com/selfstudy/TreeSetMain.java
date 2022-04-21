package com.selfstudy;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetMain 
{
	public static void main(String[] args) 
	{
		TreeSet<Integer> tob=new TreeSet<Integer>();
		tob.add(10);
		tob.add(20);
		tob.add(30);
		tob.add(40);
		System.out.println(tob);
		System.out.println("=======INTEGER=======");
		//individual elements to be displayed
		//Ascending
		System.out.println("ASCENDING ORDER");
		Iterator<Integer>it=tob.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("=============================");
		//Descending order
		System.out.println("DESCENDING ORDER");
		Iterator<Integer>it1=tob.descendingIterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
		System.out.println("=========STRING=========");
		TreeSet<String> tob1=new TreeSet<String>();
		tob1.add("ANITHA");
		tob1.add("NIVETHA");
		tob1.add("CHITRA");
		tob1.add("SELVAM");
		System.out.println(tob1);
		System.out.println("=============================");
		//Individual elements to be displayed
		//Ascending
		System.out.println("Ascending order");
		Iterator<String> it2=tob1.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		System.out.println("============================");
		//Descending order
		System.out.println("Descending order");
		Iterator<String> it3=tob1.descendingIterator();
		while(it3.hasNext()) {
			System.out.println(it3.next());
		}
		System.out.println("=========FLOAT=========");
		TreeSet<Float> tob3=new TreeSet<Float>();
		tob3.add(5.0f);
		tob3.add(6.0f);
		tob3.add(7.0f);
		tob3.add(8.0f);
		System.out.println(tob3);
		System.out.println("=============================");
		//Individual elements to be displayed
		//Ascending
		System.out.println("Ascending order");
		Iterator<Float> it4=tob3.iterator();
		while(it4.hasNext()) {
			System.out.println(it4.next());
		}
		System.out.println("============================");
		//Descending order
		System.out.println("Descending order");
		Iterator<Float> it5=tob3.descendingIterator();
		while(it5.hasNext()) {
			System.out.println(it5.next());

		}
	}
}

