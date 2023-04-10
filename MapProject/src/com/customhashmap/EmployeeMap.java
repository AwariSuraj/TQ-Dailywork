package com.customhashmap;

import java.util.HashMap;
import java.util.Map.Entry;

public class EmployeeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Employee, String> emp = new HashMap<>();
		emp.put(new Employee(101, "suraj", 2000), "testing");
		emp.put(new Employee(101, "suraj", 2200), "developer");

		for (Entry<Employee, String> en : emp.entrySet()) {

		}
		System.out.println(emp);
	}

}
