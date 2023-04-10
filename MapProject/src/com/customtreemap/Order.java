package com.customtreemap;

public class Order {

	private int orderid;
	private String oname;
	private float oprice;

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(int orderid, String oname, float oprice) {
		super();
		this.orderid = orderid;
		this.oname = oname;
		this.oprice = oprice;
	}

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public String getOname() {
		return oname;
	}

	public void setOname(String oname) {
		this.oname = oname;
	}

	public float getOprice() {
		return oprice;
	}

	public void setOprice(float oprice) {
		this.oprice = oprice;
	}

	@Override
	public String toString() {
		return "Order [orderid=" + orderid + ", oname=" + oname + ", oprice=" + oprice + "]";
	}

}
