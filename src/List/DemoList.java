package List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DemoList {
	
	public static void main(String[]args) {
		
	List<Integer>li=new ArrayList<>();
	
	li.add(10);
	li.add(20);
	li.add(30);
	li.add(90);
	li.add(10);
	li.add(10);
	li.add(40);
	li.add(50);
	
	System.out.println("******ArrayList******");
	
	System.out.println(li);
	
	System.out.println("******Length of Array List******");
	
	int size=li.size();
	
	System.out.println(size);
	
	List<Integer>li1=new LinkedList<>();
	
	li1.add(100);
	li1.add(200);
	li1.add(300);
	li1.add(400);
	li1.add(500);
	li1.add(600);
	li1.add(700);
	
	
	System.out.println("******LinkedList******");
	
	System.out.println(li1);
	
	System.out.println("******Length of Linked List******");
	
	int size1=li1.size();
	
	System.out.println(size1);
		
	}

}
