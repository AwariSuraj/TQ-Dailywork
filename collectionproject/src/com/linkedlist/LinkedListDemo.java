package com.linkedlist;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list1 = new LinkedList<>();
		// System.out.println(list1.getFirst());// get exception
		System.out.println(list1.peekLast());// return integer
		list1.add(78);
		list1.add(78);
		list1.add(null);
		list1.add(null);
		list1.add(64);
		System.out.println(list1);

		list1.addFirst(80);
		list1.addLast(100);

		System.out.println(list1);

		list1.offer(85);// return type boolean; ,add at last
		list1.offerFirst(10);
		System.out.println(list1);
		System.out.println(list1.get(3));
		System.out.println(list1.getFirst());// if list is empty no such elementException

		System.out.println(list1.getLast());
	}

}
