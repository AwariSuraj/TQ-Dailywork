package com.bookAuthor;

public class Book {

	private int bid;
	private String bname;
	private float bprice;
	private Author author;

	public Book() {

	}

	Book(int bid, String bname, float price, Author author) {
		this.bid = bid;
		this.bname = bname;
		this.bprice = bprice;
		this.author = author;

	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
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

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public String toString() {
		return "bid=" + bid + "bname= " + bname + " bprice=" + bprice + " author=" + author;
	}

}
