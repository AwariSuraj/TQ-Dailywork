package com.arraylist;

import java.util.ArrayList;

public class MethodsArrayList {

	public static void main(String[] args) {
		ArrayList<String> s = new ArrayList();
		s.add("java");
		s.add("suraj");
		s.add("awari");
		s.add("java");
		s.add(2, "html");
		System.out.println(s);

		ArrayList<String> s1 = new ArrayList();

		s1.add("vb.net");
		s1.add("asp.net");

		System.out.println(s1);

		s.addAll(s1);
		System.out.println(s);
		s.addAll(2, s1);
		System.out.println(s);

		s.remove("java");
		System.out.println(s);
		s.retainAll(s1);
		System.out.println(s);
		s.remove("java");

	}

}
