package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveDuplicates {

	public static void removeDuplicates(ArrayList<String> l1) {
		Iterator<String> itr = l1.iterator();
		while (itr.hasNext()) {
			if (itr.next().equals("yellow")) {
				itr.remove();
			}
		}
		System.out.println(l1);
	}

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("red");
		list1.add("yellow");
		list1.add("green");
		list1.add("red");

		removeDuplicates(list1);
	}

}
