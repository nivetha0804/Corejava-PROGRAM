package MapInterface;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEg 
{
	public static void main(String[] args) 
	{
		TreeMap<Integer, String> mob=new TreeMap<Integer, String>();
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

