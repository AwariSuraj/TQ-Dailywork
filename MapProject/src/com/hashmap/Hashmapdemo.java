package com.hashmap;

import java.util.HashMap;

public class Hashmapdemo {

	public static void main(String[] args) {
		// one null key
		// duplicate keys not allowed
		// duplicate and multiple null values added

		HashMap<String, Integer> map = new HashMap<>(15, 0.90f);
		map.put("suraj", 89);
		map.put("rushi", 90);
		map.put("Awari", 88);
		map.put("shubham", 89);
		map.put(null, 00);
		map.put(null, 01);

		System.out.println(map);
	}

}
