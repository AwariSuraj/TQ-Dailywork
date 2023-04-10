package com.customtreemap;

import java.util.Map;
import java.util.NavigableSet;
import java.util.TreeMap;

public class CustomOrderTreeMap {

	public static void main(String[] args) {
		TreeMap<Customer, Order> tmap = new TreeMap<>(new NameComparator());
		tmap.put(new Customer(1, "prashant", 902211845), new Order(101, "laptop", 95102f));
		tmap.put(new Customer(4, "onkar", 802211845), new Order(102, "mobile", 9512f));
		tmap.put(new Customer(3, "ganesh", 962211845), new Order(106, "ipad", 5102f));

		for (Map.Entry<Customer, Order> en : tmap.entrySet()) {
			System.out.println(en.getKey() + " " + en.getValue());
		}

		System.out.println("==================");
		NavigableSet<Customer> ns = tmap.navigableKeySet();
		for (Customer c1 : ns) {
			System.out.println(c1 + " " + tmap.get(c1));
		}
	}

}
