package com.cg.feb22.collections;

import java.util.Set;
import java.util.TreeSet;
import java.util.*;

public class Compare_Employee {
	
	public static void main(String[] args) {
		Employee e= new Employee(1,"s",200.00);
		Employee e1= new Employee(2,"a",2000.50);
		Employee e2= new Employee(3,"b",2000.30);
		Employee e3= new Employee(4,"k",600);
		
		ArrayList<Employee> tree = new ArrayList();
		tree.add(e);
		tree.add(e1);
		tree.add(e2);
		tree.add(e3);
		System.out.println(tree);
		
		Collections.sort(tree);
		System.out.println(tree);

	}
	
	

}
