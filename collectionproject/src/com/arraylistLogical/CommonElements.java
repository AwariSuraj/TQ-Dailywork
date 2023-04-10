package com.arraylistLogical;

import java.util.ArrayList;

public class CommonElements {
	public static void commonElements(ArrayList<String> list1, ArrayList<String> list2) {
		System.out.println(list1);
		System.out.println(list2);

		for (String s : list1) {
			if (list2.contains(s)) {
				System.out.println(s);
			}
		}

	}

	public static void main(String[] args) {

		ArrayList<String> al1 = new ArrayList<>();
		al1.add("Java");
		al1.add("Python");
		al1.add("Angular");
		al1.add("Spring");
		al1.add("Html");

		ArrayList<String> al2 = new ArrayList<>();
		al2.add("Java");
		al2.add("Html");
		al2.add("Angular");
		al2.add("C");
		al2.add("C++");

		commonElements(al1, al2);

	}

}
