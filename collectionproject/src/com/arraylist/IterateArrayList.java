package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterateArrayList {

	public static void main(String[] args) {
		List<String> s = new ArrayList();
		s.add("java");
		s.add("suraj");
		s.add("awari");
		s.add("java");
		// s.add(2, "html");

		for (int i = 0; i < s.size(); i++) {

			System.out.println(s.get(i));
		}
		System.out.println(".................................................");
		for (String s1 : s) {
			System.out.println(s1);
		}

		System.out.println("..............................................");

		Iterator<String> itr = s.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
