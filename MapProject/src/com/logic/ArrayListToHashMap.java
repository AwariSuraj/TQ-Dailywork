package com.logic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArrayListToHashMap {
	public static void map(ArrayList<String> al) {
		HashMap<String, Integer> mp = new HashMap<>();
		for (String s : al) {
			if (mp.containsKey(s)) {
				mp.put(s, mp.get(s) + 1);

			} else {
				mp.put(s, 1);
			}
		}
		for (Map.Entry<String, Integer> en : mp.entrySet()) {
			System.out.println(en.getKey() + ":" + en.getValue());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList<>();
		list.add("A");
		list.add("b");
		list.add("c");
		list.add("A");
		list.add("b");
		list.add("A");
		map(list);

	}

}
