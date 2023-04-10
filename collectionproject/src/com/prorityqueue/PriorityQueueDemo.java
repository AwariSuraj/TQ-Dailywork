package com.prorityqueue;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

class MyComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {

		return o2.compareTo(o1);
	}

}

public class PriorityQueueDemo {

	public static void main(String[] args) {

		PriorityQueue<String> pq = new PriorityQueue<>(Collections.reverseOrder());
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq.offer(null));
		pq.add("Pratik");
		pq.add("Suraj");
		pq.add("Milind");
		pq.add("Omkar");

		System.out.println(pq);

		// pq.add(null); // throws null pointer exception

		System.out.println(pq);

		System.out.println(pq.poll());
		System.out.println(pq.peek());

		System.out.println(pq.offer("Prasanna"));

		System.out.println(pq.remove("Omkar"));
	}

}
