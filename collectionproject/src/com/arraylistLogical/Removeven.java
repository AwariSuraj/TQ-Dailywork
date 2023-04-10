package com.arraylistLogical;

import java.util.ArrayList;

public class Removeven {
	public static void removeEven(ArrayList<Integer> list) {
		ArrayList<Integer> li1 = new ArrayList<>();
		for (Integer in : list) {
			if (in % 2 != 0) {
				li1.add(in);
			}
		}
		System.out.println(li1);
	}

	public static void main(String[] args) {
		ArrayList<Integer> li = new ArrayList<>();
		li.add(10);
		li.add(13);
		li.add(12);
		li.add(5);
		li.add(6);
		li.add(7);
		li.add(9);
		removeEven(li);

	}

}
