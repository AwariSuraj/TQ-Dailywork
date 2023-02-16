package com.wrapperclass;

public class Wrapperclassdemo {

	public static void main(String[] args) {

		// primitive data convert into its corresponding wrapper class is known as
		// autoboxing
		// automatic conversion of wrapper class into its corresponding primitive data
		// type is known as unboxing

		int a = 3;
		System.out.println(a);

		Integer n = a; // autoboxing
		System.out.println(n);

		int n1 = n; // unboxing
		System.out.println(n1);

	}

}
