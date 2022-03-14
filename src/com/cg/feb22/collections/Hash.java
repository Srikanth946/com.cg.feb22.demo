package com.cg.feb22.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class Hash {

	public static void main(String[] args) {
		
		Employee emp = new Employee(6,"sri",2);
		
		Set map= new HashSet();
		
		map.add(1);
		map.add(2);
		map.add(4);
		map.add(1);
		map.remove(2);
		map.add(3);
		map.add("ram");
		map.add(emp);
		System.out.println(map);
		
		 Iterator i = map.iterator();
		 
		 while(i.hasNext()) {
			 System.out.println(i.next());
			 System.out.println();
		 }
		 
		 
		

	}

}
