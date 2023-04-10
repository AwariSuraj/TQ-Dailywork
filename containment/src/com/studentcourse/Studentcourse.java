package com.studentcourse;

import java.util.Scanner;

public class Studentcourse {

	static Scanner sc = new Scanner(System.in);

	public static void studentDetails(Student s) {
		Course c = new Course();
		System.out.println("enter student id");
		s.setSid(sc.nextInt());
		System.out.println("enter a student name");
		s.setSname(sc.next());
		System.out.println("enter a student age");
		s.setAge(sc.nextInt());

		courseDetails(c);
		s.setCourse(c);

	}

	public static void courseDetails(Course c1) {
		System.out.println("enter a course id");
		c1.setCid(sc.nextInt());
		System.out.println("enter a course  name");
		c1.setName(sc.next());
		System.out.println("enter a course fees");
		c1.setFees(sc.nextFloat());
	}

	public static void main(String[] args) {

		Student s1 = new Student();
		studentDetails(s1);
		System.out.println(s1);
	}

}
