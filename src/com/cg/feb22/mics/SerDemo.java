package com.cg.feb22.mics;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SerDemo {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter eid:");
		int eid = sc.nextInt();
		System.out.println("Please enter firstName:");
		String firstName = sc.next();
		System.out.println("Please enter salary:");
		double salary = sc.nextDouble();

		Employee emp = new Employee(eid, firstName, salary); // Employee [eid=101, firstName=Sonu, salary=50000.0]
		System.out.println(emp.toString());

		String file = "emp.ser";
		FileOutputStream out = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(out);

		oos.writeObject(emp);

		oos.close(); 
		out.close();
		sc.close();

	}

}