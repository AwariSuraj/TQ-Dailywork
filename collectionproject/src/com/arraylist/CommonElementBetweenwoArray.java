package com.arraylist;

import java.util.ArrayList;

public class CommonElementBetweenwoArray {

	public static void common(ArrayList<String> l1, ArrayList<String> l2) {
		int l = l1.size();
		int k = 0;
		int m = 0;
		for (int i = 0; i < l; i++) {
			if (l1.get(k).equals(l2.get(m))) {
				System.out.println(l1.get(i));
			}
			k++;
			m++;
		}
	}

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("red");
		list1.add("yellow");
		list1.add("green");

		ArrayList<String> list2 = new ArrayList<>();
		list2.add("red");
		list2.add("yellow");
		list2.add("pink");

		common(list1, list2);
	}

}
