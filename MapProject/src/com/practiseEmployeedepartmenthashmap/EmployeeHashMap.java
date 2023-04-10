package com.practiseEmployeedepartmenthashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import com.custommaplogic.Department;
import com.custommaplogic.Employee;

public class EmployeeHashMap {
	public static void countDepartment(ArrayList<Employee> li) {
		HashMap<Department, Integer> map = new HashMap<>();

		for (Employee e : li) {
			Department d = e.getDepartment();
			if (map.containsKey(d)) {
				map.put(d, map.get(d) + 1);

			} else {
				map.put(d, 1);
			}
		}
		for (Entry<Department, Integer> en : map.entrySet()) {
			System.out.println(en.getKey().getDname() + " ->" + en.getValue());
		}
	}

	public static void sameDepartmentNames(ArrayList<Employee> li) {
		HashMap<Department, ArrayList<String>> map = new HashMap<>();
		for (Employee e : li) {
			Department d = e.getDepartment();
			ArrayList<String> name;

			if (map.containsKey(d)) {
				name = map.get(d);

			} else {
				name = new ArrayList<>();

			}
			name.add(e.getName());
			map.put(d, name);
		}

		for (Entry<Department, ArrayList<String>> en : map.entrySet()) {
			System.out.println(en.getKey().getDname() + " >" + en.getValue());
		}
	}

	public static void main(String[] args) {

		ArrayList<Employee> list1 = new ArrayList<>();
		Department d1 = new Department(1, "hr");
		Department d2 = new Department(2, "tech");
		Department d3 = new Department(3, "manager");
		list1.add(new Employee(100, "suraj", d1));
		list1.add(new Employee(101, "rushi", d2));
		list1.add(new Employee(102, "sanket", d3));
		list1.add(new Employee(100, "abhi", d1));
		countDepartment(list1);
		sameDepartmentNames(list1);
	}

}
