package com.cg.feb22.mics;

import java.util.regex.*;

public class Pancard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		String input="KAJPP4587D";
		String regex="[A-Z]{1,5}[0-9]{1,4}[A-Z]{1}$";
		Pattern pattern =Pattern.compile(regex);
		Matcher mat=pattern.matcher(input);
		System.out.println(mat.find());
		System.out.println(mat.matches());

	}

}
