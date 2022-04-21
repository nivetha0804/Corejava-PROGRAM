package com.selfstudy;

import java.util.LinkedList;

class Emp1
{
	int EmpId;
	String EmpName;
	float EmpSalary;
	String EmpDeptName;

	public Emp1(int EmpId, String EmpName, float EmpSalary,String EmpDeptName) 
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
public class EmployeeLinkedList 
{
	public static void main(String[] args) 
	{
		Emp1 e1=new Emp1(1, "ANI", 30000,"CS");
		Emp1 e2=new Emp1(2, "MONI", 30000,"CS");
		Emp1 e3=new Emp1(3, "NIVI", 30000,"CS");	
		Emp1 e4=new Emp1(4, "SANVI", 30000,"CS");	
		LinkedList<Emp1>llist=new LinkedList<Emp1>();
		llist.add(e1);
		llist.add(e2);
		llist.add(e3);
		llist.add(e4);
		System.out.println(llist);	
	}
}
