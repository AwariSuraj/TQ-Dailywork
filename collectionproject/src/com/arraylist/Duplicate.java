package com.arraylist;

import java.util.ArrayList;

public class Duplicate {

	public static void main(String[] args) {
		ArrayList<String> s = new ArrayList();
		s.add("java");
		s.add("suraj");
		s.add("awari");
		s.add("java");
		for (int i = 0; i < s.size(); i++) {
			if (s.get(i).equals("java")) {
				s.set(i, "core java");
			}
		}
		System.out.println(s);
	}

}
