package com.arraylistLogical;

import java.util.ArrayList;
import java.util.Collections;

public class SortIntValues {

	public static void sortArrayList(ArrayList<Integer> list)

	{
		int temp;
		for (int i = 0; i < list.size(); i++) {

			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i) < list.get(j)) {
					temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);

				}
			}
		}
		System.out.println(list);
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(34);
		a1.add(45);
		a1.add(49);
		a1.add(65);
		System.out.println(a1);
		sortArrayList(a1);

		System.out.println("---------------------------------");
		Collections.sort(a1, Collections.reverseOrder());
		System.out.println(a1);

	}

}
