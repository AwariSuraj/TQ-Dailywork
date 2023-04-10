package com.LinkedHashMap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

import com.custommaplogic.Department;

public class EmployeeLinkedHashMAp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Department d1 = new Department(1, "hr");
		Department d2 = new Department(2, "tech");
		Department d3 = new Department(3, "manager");

		LinkedHashMap<Employee, Department> lmap = new LinkedHashMap<>();
		lmap.put(new Employee(101, "suraj", 30000), d3);
		lmap.put(new Employee(102, "Awari", 20000), d2);
		lmap.put(new Employee(101, "sanket", 45000), d1);
		for (Entry<Employee, Department> en : lmap.entrySet()) {
			System.out.println(en.getKey() + " " + en.getValue());
		}
		System.out.println("==========================");
		Set<Employee> keyset = lmap.keySet();
		Iterator<Employee> itr = keyset.iterator();
		while (itr.hasNext()) {
			Employee e = itr.next();
			System.out.println(e + " " + lmap.get(e));
		}

	}

}
