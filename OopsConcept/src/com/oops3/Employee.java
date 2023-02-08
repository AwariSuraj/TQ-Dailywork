package com.oops3;

public class Employee {

	int id;
	String name;
	int experience;
	float salary;

	void enterEmployeeDetails(int i, String n, int ex, float sal) {
		id = i;
		name = n;
		experience = ex;
		salary = sal;

	}

	void showDetails() {
		System.out.println("employee id=" + id);
		System.out.println("employee name=" + name);
		System.out.println("employee experience=" + experience);
		System.out.println("employee salary=" + salary);
	}

	void incrementSalary() {
		float isalary = (salary * 20) / 100;
		System.out.println("increment salary=" + isalary);
	}

	public static void main(String[] args) {
		Employee em = new Employee();
		em.enterEmployeeDetails(12, "suraj", 10, 35000);
		em.showDetails();
		em.incrementSalary();
	}

}
