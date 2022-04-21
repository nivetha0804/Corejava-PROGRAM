package Thread;
//Method local innerclass( defining a class inside the method)
class MyOuterClass
{
	void method() 
	{
		System.out.println("Outer Class Method");
		class MyLocalInnerClass
		{
			int n;
			void innerMethod() 
			{
				System.out.println("Inner Class Method");
			}			
		} //local inner class ends
		MyLocalInnerClass iob=new MyLocalInnerClass();
		iob.innerMethod();
	}//method ends
}
public class MethodLocalInnerClass 
{
	public static void main(String[] args) 
	{
		MyOuterClass ob=new MyOuterClass();
        ob.method();
	}

}
