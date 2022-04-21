package com.selfstudy;

import java.util.Vector;

class Employ
{
	int EmpId;
	String EmpName;
	float EmpSalary;
	String EmpDeptName;

	public Employ(int EmpId, String EmpName, float EmpSalary,String EmpDeptName) 
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
public class EmployeeVector 
{
	public static void main(String[] args) 
	{
		Employ e1=new Employ(1, "VIJAY", 250000,"ACTOR");
		Employ e2=new Employ(2, "AJITH", 250000,"ACTOR");
		Employ e3=new Employ(3, "SURYA", 250000,"ACTOR");	
		Employ e4=new Employ(4, "SIVAKARTHIKEYAN", 250000,"ACTOR");	
		Vector<Employ>vlist=new Vector<Employ>();
		vlist.add(e1);
		vlist.add(e2);
		vlist.add(e3);
		vlist.add(e4);
		System.out.println(vlist);	
	}
}
