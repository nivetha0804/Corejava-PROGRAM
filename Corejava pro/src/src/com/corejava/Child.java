package com.corejava;

class Child0 extends Parent0{ //dependent class

	void display() {
		//System.out.println("sal ="+sal); //private not accesseble
		System.out.println("Name="+name); //another extended class only public and protected 
		//can be accessed
		System.out.println("age="+age);
		//System.out.println("accno="+accno);//default becomes private to another package
	}
	public static void main(String[] args) 
	{
		Child0 ob=new Child0();
		ob.input();
		ob.display();
		ob.printSal();
		//independent class
		Parent0 ob1=new Parent0();
		//System.out.println("sal ="+sal); //private not accesseble
		System.out.println("Name="+ob1.name); //another extended class only public and protected 
		//can be accessed
		//System.out.println("age="+ob1.age);//protected data cannot be accessed from 
		//another package
		//System.out.println("accno="+accno);
	}
}


