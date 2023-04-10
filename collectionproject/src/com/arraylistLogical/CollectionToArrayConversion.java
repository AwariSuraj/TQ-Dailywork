package com.arraylistLogical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionToArrayConversion {

	public static void main(String[] args) {
		String colours[] = { "red", "blue", "black", "green" };

		List<String> a1 = Arrays.asList(colours);

		ArrayList<String> s1 = new ArrayList<>(Arrays.asList(colours));

		ArrayList<String> s2 = new ArrayList<>();
		Collections.addAll(s2, colours);

		System.out.println(s2);
		// Arraylist to array

		Object[] col = s2.toArray();
		System.out.println(Arrays.toString(col));
		for (int i = 0; i < col.length; i++) {
			col[i] = ((String) col[i]).concat(" Colour");

		}
		System.out.println(Arrays.toString(col));

	}
}
