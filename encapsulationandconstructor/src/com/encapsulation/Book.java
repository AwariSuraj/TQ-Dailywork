package com.encapsulation;

import java.util.Scanner;

public class Book {

	private int bookid;
	private String bookname;
	private String author;
	private float price;

	public void setBookId(int bookid) {
		this.bookid = bookid;

	}

	public int getBookId() {
		return bookid;
	}

	public void setBookName(String bookname) {
		this.bookname = bookname;

	}

	public String getBookName() {
		return bookname;
	}

	public void setAuthor(String author) {
		this.author = author;

	}

	public String getAuthor() {
		return author;
	}

	public void setPrice(float price) {
		this.price = price;

	}

	public float getPrice() {
		return price;
	}

	public String toString() {
		return "book id =" + bookid + " book name=" + bookname;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Book b1 = new Book();
		System.out.println("enter a book id");
		b1.setBookId(sc.nextInt());
		// System.out.println("Book id=" + b1.getBookId());

		System.out.println("enter a book name");
		b1.setBookName(sc.next());
		// System.out.println("Book name=" + b1.getBookName());

		System.out.println("enter a book author");
		b1.setAuthor(sc.next());
		// System.out.println("Book Author=" + b1.getAuthor());

		System.out.println("enter a book price");
		b1.setPrice(sc.nextFloat());

		System.out.println("Book id=" + b1.getBookId());
		System.out.println("Book name=" + b1.getBookName());
		System.out.println("Book Author=" + b1.getAuthor());
		System.out.println("Book price=" + b1.getPrice());

		System.out.println("-------------------------");
		System.out.println("Accessing / overriding toString method");
		System.out.println(b1);
	}

}
