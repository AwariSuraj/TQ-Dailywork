package com.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionToArrayConversion {

	public static void main(String[] args) {
		String colors[] = { "red", "black", "white", "yellow" };
		List<String> sl = Arrays.asList(colors);
		System.out.println(sl);

		ArrayList<String> al = new ArrayList<>();
		Collections.addAll(al, colors);
		System.out.println(al);

		System.out.println("array list to Array");

		Object[] col = al.toArray();
		System.out.println(Arrays.toString(col));

		for (int i = 0; i < col.length; i++) {
			col[i] = ((String) col[i]).concat("colors");

		}
		System.out.println(Arrays.toString(col));

		// typesafe

		String cols[] = new String[sl.size()];
		sl.toArray(cols);
		for (int i = 0; i < cols.length; i++) {
			cols[i] = cols[i].concat("name");

		}
		System.out.println(Arrays.toString(cols));
	}

}
