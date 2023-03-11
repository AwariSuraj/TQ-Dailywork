package com.supplieritem;

import java.util.Scanner;

public class SupplierConst {
	static Scanner sc = new Scanner(System.in);

	public static void enterSupplier(Supplier s1) {
		System.out.println("enter a supplier id");
		s1.setSid(sc.nextInt());
		System.out.println("enter a supplier name");
		s1.setSname(sc.next());
		System.out.println("enter a supplier phone number");
		s1.setPno(sc.next());
		// System.out.println("enter a supplier item");
		int n;
		System.out.println("enter number of items");
		n = sc.nextInt();
		Item i1[] = new Item[n];
		for (int i = 0; i < n; i++) {
			i1[i] = new Item();
			System.out.println("enter a item  id");
			i1[i].setId(sc.nextInt());
			System.out.println("enter a item name ");
			i1[i].setName(sc.next());
			System.out.println("enter a item quantity ");
			i1[i].setQuantity(sc.nextInt());
			System.out.println("enter a item price ");
			i1[i].setUnitprice(sc.nextFloat());

		}

		s1.setItem(i1);

	}

	public static void main(String[] args) {

		Supplier s[] = new Supplier[3];
		/*
		 * Item i1[] = new Item[2];
		 * 
		 * i1[0] = new Item(1, "Apple", 80, 2); i1[1] = new Item(1, "mango", 180, 6);
		 * s[0] = new Supplier(101, "Suraj", "9022118454", i1);
		 * 
		 * Item i2[] = new Item[2]; i2[0] = new Item(2, "mobile", 8000, 2); i2[1] = new
		 * Item(2, "laptop", 100080, 6); s[1] = new Supplier(102, "Abhi", "9022118454",
		 * i2);
		 * 
		 * Item i3[] = new Item[2]; i3[0] = new Item(3, "bike", 80080, 2); i3[1] = new
		 * Item(3, "car", 6000000, 6); s[2] = new Supplier(103, "Kshitij", "9022145614",
		 * i3);
		 */
		for (int i = 0; i < 3; i++) {

			s[i] = new Supplier();
			enterSupplier(s[i]);

		}

		for (Supplier st : s) {
			// System.out.println(s);

			System.out.println(st.getSid() + " " + st.getSname() + "  " + st.getPno());

			for (Item i : st.getItem()) {
				System.out.println(i);

			}
			System.out.println("===================================");
		}
	}
}
