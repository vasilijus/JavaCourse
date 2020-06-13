package com.firstprogram.Company;

public class Employee extends Manager {


	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.salary = 20000;
		System.out.println("Employee's sal: " + emp.salary);
		
		Manager manager = new Manager();
		manager.salary = 50000;
		System.out.println("Manager's sal: " + manager.salary);
		
	}
}