package com.git.demo;

public class App {
	String name;
	int age;
	App(String name,int age){
		this.name=name;
		this.age=age;
	}
	public static void main(String[] args) {
	
		App s=new App("Srikanth",20);
		App s1=s;
		System.out.println(s.equals(s1));
		char s3='a';
		s3++;
		System.out.println(s3);
		
		
		
		
		
	}

}
