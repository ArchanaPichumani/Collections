package List;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	
	public static void main(String[]args) {
		
		
		List<Integer>in=new ArrayList<>();
		
		in.add(10);
		in.add(20);
		in.add(30);
		in.add(90);
		in.add(10);
		in.add(10);
		in.add(40);
		in.add(50);
		
		in.add(2, 50);
		System.out.println(in);
		
	
		List<Integer>i=new ArrayList<>();
		i.add(10);
		i.add(20);
		i.add(30);
		i.add(90);
		i.add(10);
		i.add(10);
		i.add(40);
		i.add(50);
		i.add(30);
		
		//100,20,30,90,100,100,40,50,30

		
	i.remove(0);
	i.remove(3);
	i.remove(3);
	
	i.add(0, 100);
	i.add(4, 100);
	i.add(5, 100);
		
		System.out.println(i);
		

		List<Integer>i1=new ArrayList<>();
		
		//10,20,30,90,10,10,40,50
		i1.add(10);
		i1.add(20);
		i1.add(30);
		i1.add(90);
		i1.add(10);
		i1.add(10);
		i1.add(40);
		i1.add(50);
		
		System.out.println(i1);
		

		List<Integer>i2=new ArrayList<>();
		
		i2.add(30);
		i2.add(40);
		i2.add(50);
		i2.add(60);
		i2.add(80);
		
		System.out.println(i2);
		
		i1.retainAll(i2);
		System.out.println(i1);
		
		i1.clear();
		System.out.println(i1);
		
	
		
		
	}

}
