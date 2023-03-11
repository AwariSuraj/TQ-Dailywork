package com.supplieritem;

import java.util.Arrays;

public class Supplier {

	private int sid;
	private String sname;
	private String pno;
	private Item items[];

	public Supplier() {
		super();

	}

	public Supplier(int sid, String sname, String pno, Item items[]) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.pno = pno;
		this.items = items;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getPno() {
		return pno;
	}

	public void setPno(String pno) {
		this.pno = pno;
	}

	public Item[] getItem() {
		return items;
	}

	public void setItem(Item[] items) {
		this.items = items;
	}

	public String toString() {
		return "Supplier [sid=" + sid + ", sname=" + sname + ", pno=" + pno + ", items=" + Arrays.toString(items);
	}

}
