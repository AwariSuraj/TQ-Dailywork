package com.arraylist;

import java.util.ArrayList;

public class SortArrayList {

	public static void sort(ArrayList<Integer> list) {
		int temp;
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i) > list.get(j)) {
					temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}

		}
		System.out.println(list);
	}

	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<>();
		l1.add(45);
		l1.add(89);
		l1.add(80);
		l1.add(96);
		sort(l1);
	}

}
