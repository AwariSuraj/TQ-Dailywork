package com.oops;

public class Student {

	// instance variable
	int sid;
	String name;
	int age;
	double marks;
	char grade;

//method 
	void enterDetails(int id, String n, int a, double m) {
		sid = id;
		name = n;
		age = a;
		marks = m;

	}

	void displaydetails() {
		System.out.println("student id=" + sid);
		System.out.println("name=" + name);
		System.out.println("age=" + age);
		System.out.println("marks=" + marks);

		if (marks > 90) {
			grade = 'A';

		} else if (marks > 60) {
			grade = 'b';

		} else {
			grade = 'f';
		}
		System.out.println("grade=" + grade);

	}

	public static void main(String args[]) {
		Student s1 = new Student();
		s1.displaydetails();
		System.out.println("------------------------");
		Student s2 = new Student();
		s2.enterDetails(1, "suraj", 32, 250.0);
		s2.displaydetails();
	}

}
