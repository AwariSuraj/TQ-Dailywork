package com.arraylistLogical;

import java.util.ArrayList;

public class reverseArrayList {

	public static void reverse(ArrayList<String> l1) {
		String temp;
		for (int i = 0, j = l1.size() - 1; i < l1.size() / 2; i++, j--) {
			temp = l1.get(i);
			l1.set(i, l1.get(j));
			l1.set(j, temp);

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al1 = new ArrayList<>();
		al1.add("Java");
		al1.add("Python");
		al1.add("Angular");
		al1.add("Spring");
		al1.add("Html");
		reverse(al1);
		System.out.println(al1);
	}

}
