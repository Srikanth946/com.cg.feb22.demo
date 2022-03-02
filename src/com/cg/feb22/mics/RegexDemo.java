package com.cg.feb22.mics;

import java.util.regex.*;

public class RegexDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="abcd";
		String regex="ab";
		Pattern pat=Pattern.compile(regex);
		Matcher mat=pat.matcher(input);
		System.out.println(mat.matches());// true if strings equal
		System.out.println(mat.find());// true if regex pattern in input
		System.out.println(mat.lookingAt());// true if regex pattern follows from begining
		

	}

}
