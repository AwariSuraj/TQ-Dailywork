package com.studentcourse;

public class Student {

	private int sid;
	private String sname;
	private int age;
	private Course course;

	Student() {

	}

	Student(int sid, String sname, int age, Course course) {
		this.sid = sid;
		this.sname = sname;
		this.age = age;
		this.course = course;

	}

	public void setSid(int sid) {
		this.sid = sid;

	}

	public int getSid() {
		return sid;

	}

	public void setSname(String name) {
		this.sname = sname;

	}

	public String getSname() {
		return sname;

	}

	public void setAge(int age) {
		this.age = age;

	}

	public int getAge() {
		return age;

	}

	public void setCourse(Course course) {
		this.course = course;

	}

	public Course getCourse() {
		return course;

	}

	public String toString() {
		return "sid=" + sid + " sname=" + sname + " age=" + age + " course   id=" + course;
	}

}
