package com.corejava;


	//Constructor calling from child to parent class
	//function overriding

	class Parent4
	{
		private int sal;
		public Parent4(){
			System.out.println("Parent class constructor");
		}
		public Parent4(int sal) {
			this.sal=sal;
			System.out.println("Salary="+sal);
		}
		void display() {
			System.out.println("Parent display");
		}
	}
	class Child4 extends Parent4{
		public Child4(){
			System.out.println("Child class constructor");
		}
		public Child4(int sal) {
			super(sal);//call super class constructor , it should be the first line
			System.out.println("other statements");
		}
		void display() 
		{
		}
	}
	public class Construct {

		public static void main(String[] args) {
			//Parent ob=new Parent();
			Child4 ob=new Child4(); 
			Child4 ob1=new Child4(456);
			ob1.display();
		}
	}


