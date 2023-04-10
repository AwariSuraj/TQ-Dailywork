package com.arraylist;

import java.util.ArrayList;
import java.util.ListIterator;

public class Reverse {

	public static void reverse(ArrayList<String> list) {
		// Iterator<String> itr = list.iterator();
		ListIterator<String> litr = list.listIterator(list.size());
		String temp;
		for (int i = 0, j = list.size() - 1; i < list.size() / 2; i++, j--) {
			temp = list.get(i);
			list.set(i, list.get(j));
			list.set(j, temp);
		}
		System.out.println(list);

	}

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("red");
		list1.add("yellow");
		list1.add("green");
		list1.add("red");
		reverse(list1);
	}

}
