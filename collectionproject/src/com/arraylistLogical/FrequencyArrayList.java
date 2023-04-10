package com.arraylistLogical;

import java.util.ArrayList;

public class FrequencyArrayList {

	public static void calFrequency(ArrayList<String> a1) {
		for (int i = 0; i < a1.size(); i++) {
			if (a1.get(i).equals("visited")) {
				continue;
			}
			int count = 1;
			for (int j = i + 1; j < a1.size(); j++) {
				if (a1.get(i).equals(a1.get(j))) {
					a1.set(j, "visited");
					count++;
				}
			}
			System.out.println(a1.get(i) + " " + count);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("c");
		list.add("A");
		calFrequency(list);

	}

}
