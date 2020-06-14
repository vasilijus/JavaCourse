package com.firstprogram.Company;

public class Manager {

	protected int salary;
	
	public void display(Integer dummyDataToDisplay) {
		System.out.println(dummyDataToDisplay);
	}
	public void display(String dummyDataToDisplay) {
		System.out.println(dummyDataToDisplay);
	}
	public static void main(String[] args) {
		Manager managerDummy = new Manager();
		String a = "String";
		String b = "Integer";
		managerDummy.display(a);
		managerDummy.display(b);
	}
}
