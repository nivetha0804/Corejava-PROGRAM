package Array;

import java.util.ArrayList;
import java.util.Collections;

public class MyArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList<String> list=new ArrayList<String>();
		System.out.println("STRING ARRAYLIST");
		System.out.println("=========================");
		list.add("N");
		list.add("NI");
		list.add("NIV");
		list.add("NIVE");
		list.add("NIVET");
		list.add("NIVETH");
		list.add("NIVETHA");
		list.add(7,"NIVETHA.S");//specified index
		System.out.println("GET VALUE IN 3RD INDEX="+list.get(7));
		System.out.println(list);//displaying list
		System.out.println(list.contains("NIVETHA"));
		System.out.println(                              );
		//contains all
		ArrayList<String> list2=new ArrayList<String>();
		list2.add("NIVE");
		list2.add("NIVETHA");
		System.out.println(list.containsAll(list2));
		//list.addall(list2)
		list.addAll(list2);
		System.out.println(list);
		Collections.sort(list2);
		System.out.println(list2);
		System.out.println("BEFORE SHUFFLE "+list);
		Collections.shuffle(list);
		System.out.println("AFTER SHUFFLE "+list);
		//integer arraylist
		System.out.println("INTEGER ARRAYLIST");
		System.out.println("=========================");
		ArrayList<Integer> iob=new ArrayList<Integer>();
		//add element
		//display
		iob.add(10);
		iob.add(20);
		iob.add(30);
		iob.add(40);
		iob.add(50);
		iob.add(60);
		System.out.println(iob);
		System.out.println(                              );
		//float arraylist
		System.out.println("FLOAT ARRAYLIST");
		System.out.println("=========================");
		ArrayList<Float> fob=new ArrayList<Float>();
		fob.add(1.0f);
		fob.add(2.0f);
		fob.add(3.0f);
		fob.add(4.0f);
		fob.add(5.0f);
		fob.add(6.0f);
		System.out.println(fob);
	}
}
