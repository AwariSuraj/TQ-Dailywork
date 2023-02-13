package com.studentcourse;

public class Course {

	private int cid;
	private String name;
	private float fees;

	Course() {

	}

	Course(int cid, String name, float fees) {

		this();
		this.cid = cid;
		this.name = name;
		this.fees = fees;

	}

	public void setCid(int cid) {
		this.cid = cid;

	}

	public int getCid() {
		return cid;

	}

	public void setName(String name) {
		this.name = name;

	}

	public String getName() {
		return name;

	}

	public void setFees(float fees) {
		this.fees = fees;

	}

	public float getFees() {
		return fees;

	}

	public String toString() {
		return cid + " " + name + " " + fees;

	}

}
