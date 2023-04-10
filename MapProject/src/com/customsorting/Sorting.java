package com.customsorting;

import java.util.HashMap;

import com.custommaplogic.Department;

public class Sorting {
	public static void main(String args[]) {
		Department d1 = new Department(1, "hr");
		Department d2 = new Department(2, "tech");
		Department d3 = new Department(3, "manager");
		HashMap<Employee, Department> lmap = new HashMap<>();
		lmap.put(new Employee(101, "suraj", 200), d3);
	}
}
