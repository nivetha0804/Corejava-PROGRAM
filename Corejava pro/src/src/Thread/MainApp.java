package Thread;
//CLASS INSIDE ANOTHER CLASS(INNER CLASS)
class OuterClass
{
	int i;
	private class InnerClass
	{
		int varinner;
		InnerClass()
		{
			varinner=10;
		}
		void method_inner()
		{
			System.out.println("InnerClass Method "+varinner);
			System.out.println("OuterClass Variable i "+i);
		}
	}//inner class end
	void outer_method()
	{
		InnerClass ob=new InnerClass();
		ob.method_inner();//call inner class method
	}
}
public class MainApp 
{
	public static void main(String[] args) 
	{
		OuterClass ob=new OuterClass();
		ob.outer_method();
	}
}


