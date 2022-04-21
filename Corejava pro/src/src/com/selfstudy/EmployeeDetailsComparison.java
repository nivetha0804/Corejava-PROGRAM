package com.selfstudy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Employ01
{
	int Empid;
	String Empname;
	float Empsalary;
	String Empdeptname;
	public Employ01(int Empid, String Empname, float Empsalary, String Empdeptname) 
	{
		super();
		this.Empid = Empid;
		this.Empname = Empname;
		this.Empsalary = Empsalary;
		this.Empdeptname=Empdeptname;
	}
	public String toString() 
	{
		return "Employ01 [Empid=" + Empid + ", Empname=" + Empname + ", Empsalary=" + Empsalary + "Empdeptname=" + Empdeptname +"]";
	}
}
//for sorting user defined object in ArrayList
class MySortCompare implements Comparator<Employ01>
{
	@Override
	public int compare(Employ01 o1, Employ01 o2) 
	{
		// TODO Auto-generated method stub
		if(o1.Empid>o2.Empid)
			return 1;
		else if(o1.Empid<o2.Empid)
			return -1;
		else 
			return 0;
	}
}
//based on salary
class MySortCompareSalary implements Comparator<Employ01>
{
	@Override
	public int compare(Employ01 o1, Employ01 o2) 
	{
		// TODO Auto-generated method stub
		if(o1.Empsalary>o2.Empsalary)
			return 1;
		else if(o1.Empsalary<o2.Empsalary)
			return -1;
		else 
			return 0;
	}	
}
//based on Name sort
class MySortCompareName implements Comparator<Employ01>
{
	@Override
	public int compare(Employ01 o1, Employ01 o2) 
	{
		// TODO Auto-generated method stub
		return o1.Empname.compareTo(o2.Empname);
	}
}
//based on deptname sorting
class MySortCompareDeptName implements Comparator<Employ01>
{
	@Override
	public int compare(Employ01 o1, Employ01 o2) 
	{
		// TODO Auto-generated method stub
		return o1.Empdeptname.compareTo(o2.Empdeptname);
	}
}
public class EmployeeDetailsComparison 
{
	public static void main(String[] args) 
	{		
		Employ01 E1=new Employ01(1, "NIVE", 7543.2f,"CS");
		Employ01 E2=new Employ01(2, "ANI", 6543.2f,"MATHS");
		Employ01 E3=new Employ01(3, "MONI", 321.2f,"SCIENCE");
		System.out.println(E1);
		System.out.println(E2);
		System.out.println(E3);
		ArrayList<Employ01> slist=new ArrayList<Employ01>();
		slist.add(E1);
		slist.add(E2);
		slist.add(E3);
		System.out.println(slist);
		//Iterator 
		System.out.println("Before sorting");
		Iterator<Employ01> sit=slist.iterator();
		while(sit.hasNext()) 
		{
			Employ01 Eob=sit.next();
			System.out.println(Eob.Empid+" "+Eob.Empname+" "+Eob.Empsalary+" "+Eob.Empdeptname+" "+Eob.Empdeptname);
		}
		System.out.println("===========AFTER SORTING==========");
		//to sort student data based on Empid
		MySortCompare iob=new MySortCompare();
		Collections.sort(slist,iob);
		System.out.println("Sort based on Id");
		Iterator<Employ01> sit1=slist.iterator();
		while(sit1.hasNext()) 
		{
			Employ01 Eob1=sit1.next();
			System.out.println(Eob1.Empid+" "+Eob1.Empname+" "+Eob1.Empsalary+" "+Eob1.Empdeptname);
		}
		//to sort student data based on salary
		Collections.sort(slist,new MySortCompareSalary());
		System.out.println("Sort based on Salary");

		Iterator<Employ01> sit2=slist.iterator();
		while(sit2.hasNext()) 
		{
			Employ01 Eob2=sit2.next();
			System.out.println(Eob2.Empid+" "+Eob2.Empname+" "+Eob2.Empsalary+" "+Eob2.Empdeptname);
		}
		//Based on Name
		Collections.sort(slist,new MySortCompareName());
		System.out.println("Sort based on Names");
		Iterator<Employ01> sit3=slist.iterator();
		while(sit3.hasNext()) 
		{
			Employ01 Eob3=sit3.next();
			System.out.println(Eob3.Empid+" "+Eob3.Empname+" "+Eob3.Empsalary+" "+Eob3.Empdeptname);
		}
		//Based on DeptName
		Collections.sort(slist,new MySortCompareDeptName());
		System.out.println("Sort based on DeptName");
		Iterator<Employ01> sit4=slist.iterator();
		while(sit4.hasNext()) 
		{
			Employ01 Eob3=sit4.next();
			System.out.println(Eob3.Empid+" "+Eob3.Empname+" "+Eob3.Empsalary+" "+Eob3.Empdeptname);
		}
	}
}