package com.selfstudy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Employee01
{
	int Empid;
	String Empname;
	float Empsalary;
	String Empdeptname;
	public Employee01(int sid, String sname, float fees) 
	{
		super();
		this.Empid = Empid;
		this.Empname = Empname;
		this.Empsalary = Empsalary;
		this.Empdeptname=Empdeptname;
	}
	@Override
	public String toString() 
	{
		return "Employee01 [Empid=" + Empid + ", Empname=" + Empname + ", Empsalary=" + Empsalary + "Empdeptname=" + Empdeptname +"]";
	}
}
//for sorting user defined object in ArrayList
class MySortComapre implements Comparator<Employee01>
{
//sorting based on id
	@Override
	public int compare(Employee01 o1, Employee01 o2) {
		
		if(o1.Empid>o2.Empid)
			return 1;
			else if(o1.Empid<o2.Empid)
				return -1;
			else 
				return 0;
	}
	
}
//based on fees
class MySortComparefees implements Comparator<Employee01>{

	@Override
	public int compare(Employee01 o1, Employee01 o2) {
		if(o1.Empsalary>o2.Empsalary)
			return 1;
			else if(o1.Empsalary<o2.Empsalary)
				return -1;
			else 
				return 0;
	}
}

//based on Name sort
class MySortComapreName implements Comparator<Employee01>{

	@Override
	public int compare(Employee01 o1, Employee01 o2) {
		
		return o1.Empname.compareTo(o2.Empname);
	}
	
}

public class EmployeeDetails {

	public static void main(String[] args) {
		
		Employee01 s2=new Employee01(2, "Lokeshwari", 7543.2f);
		Employee01 s1=new Employee01(1, "Kiran", 6543.2f);
		Employee01 s3=new Employee01(3, "Pavithra", 321.2f);
		System.out.println(s1);
		
		ArrayList<Employee01> slist=new ArrayList<Employee01>();
		slist.add(s2);
		slist.add(s1);
		slist.add(s3);
		System.out.println(slist);
		
		//Iterator 
		System.out.println("Before sorting");
		Iterator<Employee01> sit=slist.iterator();
		while(sit.hasNext()) {
			Employee01 Eob=sit.next();
		System.out.println(Eob.Empid+" "+Eob.Empname+" "+Eob.Empsalary+" "+Eob.Empdeptname);
		}
		
		//to sort student data based on sid
		MySortComapre iob=new MySortComapre();
		Collections.sort(slist,iob);
		System.out.println("After sort based on id");
		
		Iterator<Employee01> sit1=slist.iterator();
		while(sit1.hasNext()) {
			Employee01 Eob1=sit1.next();
		System.out.println(Eob1.Empid+" "+Eob1.Empname+" "+Eob1.Empsalary+" "+Eob1.Empdeptname);
		}
		
		
		//to sort student data based on feees
				Collections.sort(slist,new MySortComparefees());
				System.out.println("After sort based on id");
				
				Iterator<Employee01> sit2=slist.iterator();
				while(sit2.hasNext()) {
					Employee01 Eob2=sit2.next();
				System.out.println(Eob2.Empid+" "+Eob2.Empname+" "+Eob2.Empsalary+" "+Eob2.Empdeptname);
				}
				
		//Based on Name
			Collections.sort(slist,new MySortComapreName());
			System.out.println("Sort based on Names");
			Iterator<Employee01> sit3=slist.iterator();
			while(sit3.hasNext()) {
				Employee01 Eob3=sit3.next();
				System.out.println(Eob3.Empid+" "+Eob3.Empname+" "+Eob3.Empsalary+" "+Eob3.Empdeptname);
			}
			
	}
	

}
	

