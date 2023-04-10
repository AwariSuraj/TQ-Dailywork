package com.linkedlist;

import java.util.LinkedList;

public class LinkedListDemo2 {

	public static void main(String[] args) {

		LinkedList<String> list1 = new LinkedList<>();
		// while String is empty

//		list1.getFirst(); // exception;
//		list1.remove();// exception
		// System.out.println(list1);
		list1.poll();// null
		list1.peek();// null
		System.out.println(list1);

		// ...............................................................//

		// insertion
		list1.add("red");
		list1.add("yellow");
		list1.add("green");
		System.out.println(list1);
		// insertion at head
		list1.addFirst("pink");
		System.out.println(list1);
		// insertion at mid
		list1.add(3, " null");
		System.out.println(list1);
		// insertion at last
		list1.addLast("black");
		list1.offerLast("blue");
		System.out.println(list1);

		// ...............................................................//

		// deletion
		// deletion at head
		list1.remove();
		list1.pollFirst();
		System.out.println(list1);
		// deletion at mid
		list1.remove(2);
		System.out.println(list1);
		// deletion at last
		list1.removeLast();
		list1.pollLast();

		// .....................................................................//
		// retrieve

		// at head

		list1.getFirst();
		list1.peekFirst();
		list1.element();
		System.out.println(list1);
		// mid
		list1.get(1);
		// last
		list1.peekLast();
		list1.getLast();

	}

}
