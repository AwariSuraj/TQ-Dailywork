package com.arraylistLogical;

import java.util.ArrayList;

public class RemoveDuplicates {

	public static void remove(ArrayList<String> s1) {
		ArrayList<String> s2 = new ArrayList<>();
		for (String l1 : s1) {
			if (!s2.contains(l1)) {
				s2.add(l1);
			}
		}
		System.out.println(s2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al1 = new ArrayList<>();
		al1.add("Java");
		al1.add("Python");
		al1.add("Angular");
		al1.add("Spring");
		al1.add("Html");
		al1.add("Java");
		al1.add("Spring");
		remove(al1);

	}

}
