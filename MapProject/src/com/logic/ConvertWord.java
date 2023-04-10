package com.logic;

import java.util.ArrayList;
import java.util.HashMap;

public class ConvertWord {
	public static String convert(int n) {
		String word = null;
		switch (n) {
		case 1:
			word = "one";
			break;
		case 2:
			word = "two";
			break;
		case 3:
			word = "three";
			break;
		case 4:
			word = "four";
			break;
		default:
			System.out.println("error");
		}
		return word;
	}

	public static void createMap(ArrayList<Integer> list) {
		HashMap<String, Integer> map = new HashMap<>();
		for (Integer n : list) {
			String nword = convert(n);
			if (map.containsKey(nword)) {
				map.put(nword, map.get(nword) + 1);

			} else {
				map.put(nword, 1);
			}
		}
		System.out.println(map);
	}

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(2);
		al.add(3);

		al.add(4);

		al.add(2);

		al.add(1);
		createMap(al);
	}

}
