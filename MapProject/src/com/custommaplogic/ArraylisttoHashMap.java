package com.custommaplogic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class ArraylisttoHashMap {

	public static void countMap(ArrayList<Employee> al) {
		HashMap<Department, Integer> dmap = new HashMap<>();
		for (Employee emp : al) {
			Department d = emp.getDepartment();
			if (dmap.containsKey(d)) {
				dmap.put(d, dmap.get(d) + 1);

			} else {
				dmap.put(d, 1);

			}
		}
		for (Entry<Department, Integer> en : dmap.entrySet()) {
			System.out.println(en.getKey().getDname() + " ->" + en.getValue());
		}
	}

	public static void names(ArrayList<Employee> al) {
		HashMap<Department, ArrayList<String>> dmap = new HashMap<>();
		ArrayList<String> names;
		for (Employee emp : al) {
			Department d = emp.getDepartment();
			if (dmap.containsKey(d)) {
				names = dmap.get(d);

			} else {
				names = new ArrayList<>();
			}
			names.add(emp.getName());
			dmap.put(d, names);
		}

		for (Entry<Department, ArrayList<String>> en : dmap.entrySet()) {
			System.out.println(en.getKey().getDname() + " " + en.getValue());
		}
		// System.out.println(dmap);
	}

	public static void main(String[] args) {
		Department d1 = new Department(1, "hr");
		Department d2 = new Department(2, "tech");
		Department d3 = new Department(3, "manager");

		ArrayList<Employee> list1 = new ArrayList<>();
		list1.add(new Employee(100, "suraj", d1));
		list1.add(new Employee(101, "rushi", d2));
		list1.add(new Employee(102, "sanket", d3));
		list1.add(new Employee(100, "abhi", d1));
		countMap(list1);
		names(list1);
	}

}
