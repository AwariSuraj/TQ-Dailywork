package com.Arr1;

import java.util.Scanner;

public class Test {
	static Scanner sc = new Scanner(System.in);

	public static void enterDetails(Student stu) {

		System.out.println("enter a student id");
		stu.setId(sc.nextInt());
		System.out.println("enter a student name");
		stu.setName(sc.next());

	}

	public static void printDetails(Student s[]) {
		for (Student s1 : s) {
			System.out.println(s1);
		}
	}

	public static void main(String[] args) {
		Student st = new Student();
		System.out.println(st);

		Student st1[] = new Student[5];
		for (int i = 0; i < 5; i++) {
			st1[i] = new Student();
			enterDetails(st1[i]);

		}
		printDetails(st1);

		/*
		 * st[0]=new Student(); st[0].setName("Suraj");
		 */

		/*
		 * st[0] = new Student(1, "Suraj");
		 * 
		 * st[1] = new Student(2, "Awari"); st[2] = new Student(3, "akash"); st[3] = new
		 * Student(4, "Sahil"); st[4] = new Student(5, "abhi");
		 * 
		 * for (Student s : st) { System.out.println(s); }
		 */

	}

}
