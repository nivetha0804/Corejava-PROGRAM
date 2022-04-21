package Array;

public class MissingNumbers 
{
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,5};
		int s,n=5,arr=0;
		s=n*(n+1)/2;
		for(int i=0;i<a.length;i++)
		{
			arr=arr+a[i];
		}
		int mn=s-arr;
		System.out.println("MISSING NUMBER IS= "+mn);
	}
}
