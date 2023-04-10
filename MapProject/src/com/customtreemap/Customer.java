package com.customtreemap;

public class Customer {

	private int cid;
	private String name;
	private long mobileno;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int cid, String name, long mobileno) {
		super();
		this.cid = cid;
		this.name = name;
		this.mobileno = mobileno;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobileno() {
		return mobileno;
	}

	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", mobileno=" + mobileno + "]";
	}

}
