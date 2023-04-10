package com.customtreemap;

import java.util.Comparator;

public class NameComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer b1, Customer b2) {
		// TODO Auto-generated method stub
		return b1.getName().compareTo(b2.getName());
	}

}
