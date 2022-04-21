package staticmethod;
//static can be applied to variable,method,inner class and static block
//program to demonstrate static variable
//static data is shared by all objects
class Demostatic
{
	static int i;//variable as static-->shared all objects
	int j;
	Demostatic()
	{
		i=1; 
		j=1;
		System.out.println("static initial value of i="+i);
		System.out.println("non-static initial value of j="+j);
	}
	void diplay()
	{
		i=i+1;//static
		j=j+1;//non-static
		System.out.println("static i="+i);//i=i+1=2  //i=2+1=3
		System.out.println("non-static j="+j);//j=j+1=2
	}
}
public class MainClass 
{
	public static void main(String[] args) 
	{
		System.out.println("Main");
		Demostatic ds=new Demostatic();
		Demostatic ds1=new Demostatic();
		ds.diplay();
		ds1.diplay();
	}
}
