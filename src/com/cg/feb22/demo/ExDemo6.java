package com.cg.feb22.demo;

import org.junit.jupiter.api.Test;

public class ExDemo6 {
@Test
	static void checkEligibility(int age) throws VoterNotEligibleException {
		if (age >= 18)
			System.out.println("You may vote");
		else
			throw new VoterNotEligibleException("You may not vote!");
	}
@Test
	public void num() {
	
		
	}

	public static void main(String[] args) {
		System.out.println("Start");

//		try {
//			ExDemo6.checkEligibility(17);
//		} catch (RuntimeException e) {
//			System.out.println(e.getMessage());
//		}
		System.out.println("End");
	}
}

