package com.cg.feb22.demo;

public class demo3 {

//	static void m1() {
//		
//	}

	public static void main(String[] args) {

		

		demo3.addNums(10, 20);
//		Demo3.addNums(10); // CE
//		Demo3.addNums(10, 20, 30); // CE
//		Demo3.addNums(10.5, 20.5); // CE 
		int sum = demo3.addNumsAndReturnSum(50, 60);
		System.out.println(sum);
		System.out.println(MethodTriesToReturnAValue(4,6));

	}

	static void addNums(int i, int j) {
		System.out.println(i + j);
	}

	static int addNumsAndReturnSum(int i, int j) {
		return i + j;
	}

	static int MethodTriesToReturnAValue(int i, int j) {
	
		return(i+j);
	}

}