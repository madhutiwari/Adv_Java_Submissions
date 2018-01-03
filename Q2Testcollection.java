package stack;

import java.util.Map;
import java.util.TreeMap;

public class Q2Testcollection {

	public static void main(String[] args) {
		 TreeMap<String,Integer> student=new TreeMap<String,Integer>(); 
		 student.put("Amit",100);
		 student.put("Ravi",101);
		 student.put("Rahul",102);
		 student.put("Rohit",103);
		 student.put("Ajay",104);
		 
		  
		  for(Map.Entry m:student.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  

	}

}
