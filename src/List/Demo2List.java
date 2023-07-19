package List;

import java.util.ArrayList;
import java.util.List;

public class Demo2List {
	
	public static void main(String[]args) {
		
		List<Integer>list1=new ArrayList<>();
		
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(90);
		list1.add(10);
		list1.add(10);
		list1.add(40);
		list1.add(50);
		
		System.out.println("List1:" 
				            +list1);
		
		
		
		List<Integer>list2=new ArrayList<>();
		
		list2.add(30);
		list2.add(40);
		list2.add(50);
		list2.add(60);
		list2.add(80);
		
		System.out.println("List2:" 
	            +list2);
		
		list1.retainAll(list2);
		System.out.println("Common Elements:"
				                +list1);
		
		
		list1.clear();
		System.out.println("Clear List1:");
		System.out.println(list1);
		
		list2.clear();
		System.out.println("Clear List2:");
		System.out.println(list2);
		
		list1.removeAll(list1);
		System.out.println("Remove All List1:");
		System.out.println(list1);
		
		list1.removeAll(list2);
		System.out.println("Remove All List2:");
		System.out.println(list2);
		
		
	}

}
