package com.oops1;

import java.util.Scanner;

public class Clg {

	private int instituteno;
	public String cname;
	String address;

	public void enterclgdetails(int in, String n, String addr) {
		instituteno = in;
		cname = n;
		address = addr;
	}

	private void showDetails() {
		System.out.println("institute number=" + instituteno);
		System.out.println("name =" + cname);
		System.out.println("Address=" + address);
	}

	void test() {
		System.out.println("test");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Clg c1 = new Clg();
		c1.enterclgdetails(4042, "Sinhgad", "lonavala");
		c1.showDetails();
		System.out.println("enter a institute number");
		int n = sc.nextInt();
		System.out.println("enter a institute name");
		String name = sc.next();
		System.out.println("enter a institute Address");
		String adrr = sc.next();
		Clg c4 = new Clg();
		c4.enterclgdetails(n, name, adrr);
		c4.showDetails();
		// c4.cname="suraj";

	}

}
