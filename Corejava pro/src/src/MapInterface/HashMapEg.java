package MapInterface;

import java.util.HashMap;
import java.util.Map;
//https://github.com/nivetha0804/CoreJava1.git
public class HashMapEg 
{
	public static void main(String[] args) 
	{
		HashMap<Integer, String> mob=new HashMap<Integer, String>();
		mob.put(1, "NIVETHA");
		mob.put(2, "MONIKA");
		mob.put(3, "AKSHAYA");
		mob.put(4, "BHUVANESHWARI");
		mob.put(5, "VISHNU PRIYA");
		System.out.println(mob);
		System.out.println("                   ");
		for(Map.Entry<Integer, String> m:mob.entrySet())
		{  
			System.out.println(m.getKey()+" "+m.getValue()); 

		}
	}	
}



