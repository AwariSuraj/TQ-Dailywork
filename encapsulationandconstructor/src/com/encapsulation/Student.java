package com.encapsulation;

import java.util.Scanner;

public class Student {

	private int id;
	private String name;
	private int age;

	public void setId(int id) {
		this.id = id;

	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;

	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;

	}

	public int getAge() {
		return age;
	}

	public static void main(String[] args) {
		Student a1 = new Student();
		Scanner sc = new Scanner(System.in);

		System.out.println("enter your id");
		a1.setId(sc.nextInt());
		System.out.println("id=" + a1.getId());

		System.out.println("enter your name");
		a1.setName(sc.next());
		System.out.println("Name=" + a1.getName());

		System.out.println("enter your Age");
		a1.setAge(sc.nextInt());
		System.out.println("Age=" + a1.getAge());

	}

}
