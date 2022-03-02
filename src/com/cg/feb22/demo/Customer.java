package com.cg.feb22.demo;

public class Customer {
	
	String name;
	static int Id;
	int age;
	Customer(){
		System.out.println("Hey I called U");
	}
	Customer(String name,int id){
		this.name=name;
		Customer.Id=id;
	
	}
	Customer(int age){
		this.age=age;
		
	}
	public String toString() {
		
		return "[name-"+this.name+" ,Id-"+Customer.Id+" ,Age-"+this.age+"]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		

	}

}
