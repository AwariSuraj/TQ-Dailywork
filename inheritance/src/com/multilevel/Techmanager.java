package com.multilevel;

public class Techmanager extends Manager {

	private int tid;
	private String tname;

	public Techmanager() {
		super();
	}

	public Techmanager(int id, String name, float salary, int experience, int tid, String tname) {
		super(id, name, salary, experience);
		this.tid = tid;
		this.tname = tname;
	}

	public String toString() {
		return super.toString() + "Techmanager [tid=" + tid + ", tname=" + tname + "]";
	}

}
