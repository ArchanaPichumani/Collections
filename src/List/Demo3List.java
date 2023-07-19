package List;

import java.util.ArrayList;
import java.util.List;

public class Demo3List {
	
	public static void main(String[]args) {
		
		List<Integer>Li=new ArrayList<>();
		
		Li.add(10);
		Li.add(20);
		Li.add(30);
		Li.add(90);
		
	    int L=Li.indexOf(10);
		System.out.println(L);
		
		int L1=Li.indexOf(90);
		System.out.println(L1);
		
	int L2=Li.get(3);
	System.out.println(L2);
	
	int L3=Li.remove(2);
	System.out.println(Li);
		
		
		
		
	}
	
	
	

}
