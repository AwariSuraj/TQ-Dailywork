package com.vector;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class IterateVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v1 = new Vector<>();
		v1.add("red ");
		v1.add("black");
		v1.add("White");

		Iterator<String> itr = v1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("----------------------------");
		for (int i = 0; i < v1.size(); i++) {
			System.out.println(v1.get(i));
		}
		System.out.println("----------------------------");
		for (String s : v1) {
			System.out.println(s);
		}

		ListIterator<String> litr1 = v1.listIterator(v1.size());

		while (litr1.hasPrevious()) {
			System.out.println(litr1.previous());
		}
		System.out.println("----------------------------");

	}

}
