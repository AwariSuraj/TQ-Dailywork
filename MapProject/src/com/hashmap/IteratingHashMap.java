package com.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class IteratingHashMap {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<>(15, 0.90f);
		map.put("suraj", 89);
		map.put("rushi", 90);
		map.put("Awari", 88);
		map.put("shubham", 89);

		System.out.println(map);
		System.out.println("===================");

		// all keys

		Set<String> keyset = map.keySet();
		for (String s : keyset) {
			System.out.println(s);
		}

		// all values
		System.out.println("================");
		Collection<Integer> marks = map.values();
		for (Integer i1 : marks) {
			System.out.println(i1);
			/*
			 * Iterator<String> itr = keyset.iterator(); while (itr.hasNext()) { String k =
			 * itr.next(); System.out.println(k + " " + map.get(keyset));
			 * System.out.println(itr.next()); }
			 */
			// key value pair
			for (Entry<String, Integer> en : map.entrySet())

			{
				System.out.println(en.getKey() + " : " + en.getValue());
			}
		}

	}
}