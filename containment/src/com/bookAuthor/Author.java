package com.bookAuthor;

public class Author {
	private int authorid;
	private String aname;
	private int age;

	Author() {

	}

	Author(int authorid, String aname, int age) {
		this.authorid = authorid;
		this.aname = aname;
		this.age = age;

	}

	public void setAuthorId(int autherid) {
		this.authorid = autherid;

	}

	public int getAuthorId() {
		return authorid;

	}

	public void setAname(String aname) {
		this.aname = aname;

	}

	public String getAname(String aname) {
		return aname;
	}

	public void setAge(int age) {
		this.age = age;

	}

	public int getAge() {
		return age;

	}

	public String toString() {
		return "authrid=" + authorid + " aname= " + aname + " age= " + age;
	}

}
