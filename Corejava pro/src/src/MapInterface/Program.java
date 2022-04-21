package MapInterface;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
//create a program with 10 phone no and names by using for loop
public class Program 
{
	public static void main(String[] args) 
	{
		TreeMap<Long, String>tob=new TreeMap<Long,String>();
		tob.put(9876543210l , "NIVETHA");
		tob.put(9658741230l, "MONIKA");
		tob.put(9513264780l, "AKSHAYA");
		tob.put(7894512369l, "BHUVANESHWARI");
		tob.put(9874152635l, "VISHNU PRIYA");
		System.out.println(tob);
		System.out.println("                   ");
		for(Map.Entry<Long, String> m:tob.entrySet())
		{  
			System.out.println(m.getKey()+" "+m.getValue()); 
		}
	}
}
