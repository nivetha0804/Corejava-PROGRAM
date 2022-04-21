package com.selfstudy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Emp
{
	int EmpId;
	String EmpName;
	float EmpSalary;
	String EmpDeptName;
	public String sid;

	public Emp(int EmpId, String EmpName, float EmpSalary,String EmpDeptName) 
	{
		super();
		this.EmpId = EmpId;
		this.EmpName = EmpName;
		this.EmpSalary = EmpSalary;
		this.EmpDeptName=EmpDeptName;
	}
	@Override
	public String toString() 
	{
		return "Empolyee [EmpId=" + EmpId + ";  "
				+ "EmpName=" + EmpName + "; "
				+ "EmpSalary=" + EmpSalary + ";"
				+ "EmpDeptName=" + EmpDeptName +"]";
	}	
}
public class Employee
{
	public static void main(String[] args) 
	{
		Emp e1=new Emp(1, "Akshaya", 25000,"EC");
		Emp e2=new Emp(2, "Monika", 25000,"BCA");
		Emp e3=new Emp(3, "Kaviya", 25000,"MATHS");	
		Emp e4=new Emp(4, "Nivetha", 25000,"CS");	
		ArrayList<Emp> slist=new ArrayList<Emp>();
		slist.add(e1);
		slist.add(e2);
		slist.add(e3);
		slist.add(e4);
		System.out.println(slist);		
		//Iterator 
		System.out.println("BEFORE SORTING");
		Iterator<Emp> sit=slist.iterator();
		while(sit.hasNext()) 
		{
			Emp emp=sit.next();
			System.out.println(emp.EmpId+" "+emp.EmpName+" "+emp.EmpSalary+" "+emp.EmpDeptName);
		}
		
	}
}

