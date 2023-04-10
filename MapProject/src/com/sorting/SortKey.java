package com.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class SortKey {

	public static void keySort(HashMap<String, Double> map) {
		ArrayList<String> list = new ArrayList<>(map.keySet());
		Collections.sort(list);
		LinkedHashMap<String, Double> lmap = new LinkedHashMap<>();
		for (String s : list) {
			lmap.put(s, map.get(s));

		}
		for (Entry<String, Double> en : lmap.entrySet()) {
			System.out.println(en.getKey() + " " + en.getValue());
		}
	}

	public static void main(String[] args) {

		HashMap<String, Double> map1 = new HashMap<>();
		map1.put("suraj", 12.5);
		map1.put("awari", 22.5);
		map1.put("sanket", 2.5);
		keySort(map1);

	}

}
