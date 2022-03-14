package com.cg.feb22.collections;

import java.util.Collections;
import java.util.*;

public class Demo_Compa {

	public static void main(String[] args)
	{
		Set<String> ts1 = new TreeSet<String>(new Compa());
		ts1.add("A");
		ts1.add("B");
		ts1.add("C");
		ts1.add("C");
		ts1.add("Srikanth");
		ts1.add("Ram");
		System.out.println(ts1);
		
	}
}

class Compa implements Comparator<String>{
	
	@Override
	public int compare(String o1, String o2) {
		return - o1.compareTo(o2);
	}
}
