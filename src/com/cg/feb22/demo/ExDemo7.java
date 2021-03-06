package com.cg.feb22.demo;
public class ExDemo7 {

	static void checkEligibility(int age) throws VoterNotEligibleException, ArithmeticException {
		System.out.println(10/0);
		if (age >= 18)
			System.out.println("You may vote");
		else
			throw new VoterNotEligibleException("You may not vote!");
	}

	public static void main(String[] args) {
		System.out.println("Start");

		try {
			ExDemo7.checkEligibility(17);
		} catch (VoterNotEligibleException e) {
			System.out.println(e.getMessage());
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
			
		}
		System.out.println("End");
	}
}

