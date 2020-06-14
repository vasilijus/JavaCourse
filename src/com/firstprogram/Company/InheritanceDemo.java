package com.firstprogram.Company;

public class InheritanceDemo {

	public static void main(String [] args ) {
		Employee emp1 = new Employee();
		emp1.salary = 1400;
		System.out.println(emp1.salary);
		Manager emp2 = new Manager();
		System.out.println(emp2.salary);
		
	}
}
