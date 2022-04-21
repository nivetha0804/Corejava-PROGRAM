package MapInterface;

import java.util.LinkedHashMap;
import java.util.Map;


public class LinkedMapEg 
{
	public static void main(String[] args) 
	{			
		LinkedHashMap<Integer, String> mob=new LinkedHashMap<Integer, String>();
		mob.put(1, "NIVETHA");
		mob.put(2, "MONIKA");
		mob.put(3, "AKSHAYA");
		mob.put(4, "BHUVANESHWARI");
		mob.put(5, "VISHNU PRIYA");
		System.out.println(mob);
		System.out.println("");
		for(Map.Entry<Integer, String> m:mob.entrySet())
		{  
			System.out.println(m.getKey()+" "+m.getValue()); 
		}
	}
}
