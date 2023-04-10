package com.prorityqueue;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

class Book {
	private int id;
	private String bname;
	private float bprice;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int id, String bname, float bprice) {
		super();
		this.id = id;
		this.bname = bname;
		this.bprice = bprice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public float getBprice() {
		return bprice;
	}

	public void setBprice(float bprice) {
		this.bprice = bprice;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", bname=" + bname + ", bprice=" + bprice + "]";
	}

}

class PriceComparator implements Comparator<Book> {
	@Override
	public int compare(Book b1, Book b2) {

		if (b1.getBprice() == b2.getBprice())
			return 0;
		else if (b1.getBprice() < b2.getBprice())
			return 1;
		else
			return -1;

	}
}

public class PriorityQueueBook {

	public static void main(String[] args) {

		PriorityQueue<Book> pqb = new PriorityQueue<>(new PriceComparator());

		pqb.add(new Book(101, "Harry Potter", 764f));
		pqb.add(new Book(100, "Ramayan", 764f));
		pqb.add(new Book(105, "Hamlet", 764f));
		pqb.add(new Book(104, "The Secret", 900f));
		pqb.add(new Book(103, "Life", 890f));

		Iterator<Book> itr = pqb.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
