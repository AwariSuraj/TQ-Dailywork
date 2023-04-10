package com.bookhashmap;

import java.util.Objects;

public class Book {

	private int bookid;
	private String bookname;
	private int price;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int bookid, String bookname, int price) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.price = price;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookname=" + bookname + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(bookid, bookname, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return bookid == other.bookid && Objects.equals(bookname, other.bookname) && price == other.price;
	}

}