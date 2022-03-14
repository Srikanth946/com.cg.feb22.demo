package com.cg.feb22.collections;
import java.io.Serializable;
import java.util.Comparator;

 class Employee implements Comparable<Employee> {

	private static final long serialVersionUID = 1L;

	int eid;
	String firstName;
	double salary;

	public Employee() {
		super();
	}

	public Employee(int eid, String firstName, double salary) {
		super();
		this.eid = eid;
		this.firstName = firstName;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", firstName=" + firstName + ", salary=" + salary + "]";
	}



	@Override
	public int compareTo(Employee o) {
		//Employee e=(Employee)o;
//		if(this.salary>e.salary) {
//			return -1;
//		}
//		return 1;
		return Double.compare(this.salary, o.salary);
	}

	

}
 
