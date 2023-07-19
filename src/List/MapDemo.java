package List;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {
	
	public static void main(String[] args) {
		
		Map<Integer,String>Li=new HashMap<>();
		
		Li.put(10, "java");
		Li.put(20, "sql");
		Li.put(30, "oops");
		Li.put(40, "Sql");
		Li.put(50, "oracle");
		Li.put(50,"DB");
		Li.put(40, "selenium");
		
		System.out.println(Li);
		
		Map<String, Integer>Li1=new TreeMap<>();
		Li1.put("!", 10);
		Li1.put("@",20);
		Li1.put("#",30);
		Li1.put("%", 40);
		Li1.put("^", 50);
		Li1.put("&", 60);
		Li1.put("*", 10);
		Li1.put("(", 40);
		System.out.println(Li1);
		
	Collection<Integer> k=Li1.values();
       System.out.println(k);

		Set<String> U=Li1.keySet();
		System.out.println(U);
		
	}

}
