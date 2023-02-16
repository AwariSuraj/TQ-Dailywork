package com.SingleInheritance;

public class Student extends Person {

	private int rollno;
	private String sname;

	public Student() {

	}

	public Student(String name, int age, int rollno, String sname) {

		super(name, age);
		this.rollno = rollno;
		this.sname = sname;
	}

	public String toString() {
		return name + " " + age + "  " + rollno + "  " + sname;
	}

}
