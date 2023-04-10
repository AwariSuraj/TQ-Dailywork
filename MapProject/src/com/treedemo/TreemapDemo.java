package com.treedemo;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreemapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<String, Double> tmap = new TreeMap<>();
		tmap.put("Suraj", 89.05);
		tmap.put("sanket", 90.8);
		tmap.put("Sahil", 89.05);
		tmap.put("ganesh", 70.8);
		System.out.println("firstkey:-" + tmap.firstKey());
		System.out.println("lastkey:-" + tmap.lastKey());

		Set<String> keys = tmap.keySet();
		Iterator<String> itr = keys.iterator();
		while (itr.hasNext()) {
			String key = itr.next();
			System.out.println((key + " :" + tmap.get(key)));
		}

	}

}
