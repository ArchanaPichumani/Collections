package List;

import java.util.HashMap;
import java.util.Map;

public class MapIteration {
	
	public static void main(String[] args) {
		
Map<Integer,String>Li=new HashMap<>();
		
		Li.put(10, "java");
		Li.put(20, "sql");
		Li.put(30, "oops");
		Li.put(40, "Sql");
		Li.put(50, "oracle");
		Li.put(50,"DB");
		Li.put(40, "selenium");
	
	
	
	for (Map.Entry<Integer,String> entry : Li.entrySet()) {
		Integer key = entry.getKey();
		String val = entry.getValue();
		
		System.out.println(entry.getKey()+entry.getValue());	
		
	}
	   
	System.out.print("");
	
		}
	
	
	}


	
	
	
	                           


