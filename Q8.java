import java.util.Map;
import java.util.TreeMap;
import java.io.BufferedReader;
import java.io.*;
import java.util.*;


public class Q8 {

	public static void main(String[] args) throws IOException {
		 HashMap<String,Integer> drinks=new HashMap<String,Integer>(); 
		 drinks.put("Type1",10);
		 drinks.put("Type2",10);
		 drinks.put("Type3",2);
		 drinks.put("Type4",10);
		 drinks.put("Type5",10);

		 for(Map.Entry m:drinks.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }

		int count = 0;
		while(count < 3)
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String n = br.readLine(); 

			if(drinks.get(n) != null & drinks.get(n) > 1)
			{
				System.out.println("Request Served");
				drinks.put(n,drinks.get(n)-1);
			}
			else
			{
				System.out.println("Request Denied");
			}
			count++;
		}

		for(Map.Entry m:drinks.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }
		  

		    

	}

}
