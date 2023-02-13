package com.bookAuthor;

import java.util.Scanner;

public class Library {

	public void studentDetails(Book b1) {
		Scanner sc = new Scanner(System.in);
		Author a1 = new Author();
		System.out.println("enter a book id");
		b1.setBid(sc.nextInt());
		System.out.println("enter a book name");
		b1.setBname(sc.next());
		System.out.println("enter a book price");
		b1.setBprice(sc.nextFloat());
		authorDetails(a1);
		b1.setAuthor(a1);
	}

	public void authorDetails(Author a2) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("enter a author id");
		a2.setAuthorId(sc1.nextInt());
		System.out.println("enter a author name");
		a2.setAname(sc1.next());
		System.out.println("enter  a authoerage");
		a2.setAge(sc1.nextInt());
	}

	public static void main(String[] args) {

		// Author a1 = new Author();
		Library l = new Library();
		Book s = new Book();
		l.studentDetails(s);
		System.out.println(s);

	}

}
