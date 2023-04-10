package com.LinkedHashMap;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo {

	public static void main(String[] args) {

		LinkedHashMap<String, Double> lmap = new LinkedHashMap<>();
		lmap.put("Rupali", 78.5);
		lmap.put("Priya", 73.5);
		lmap.put("Vivek", 85.4);
		lmap.put("Uday", 83.5);
		lmap.put(null, 0.0);

		for (Map.Entry<String, Double> en : lmap.entrySet()) {
			System.out.println(en.getKey() + "  " + en.getValue());
		}
		// maintains insertion order
		System.out.println("============================");
		// keys
		Set<String> names = lmap.keySet();
		Iterator<String> itr = names.iterator();
		while (itr.hasNext()) {
			String k = itr.next();
			System.out.println(k + "  " + lmap.get(k));
		}
		System.out.println("============================");
		// values
		Collection<Double> marks = lmap.values();
		Iterator<Double> itr1 = marks.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());

		}

		System.out.println("============================");

		System.out.println("Marks of Vivek:" + lmap.get("Vivek"));

		System.out.println("============================");

		for (Map.Entry<String, Double> en : lmap.entrySet()) {
			System.out.println(en.getKey() + "  " + en.getValue());
		}

	}
}
