package com.hierarchical;

class Phone {
	protected String no;
	protected int id;
	protected float bill;

	public Phone() {

	}

	public Phone(String no, int id, float bill) {

		this.no = no;
		this.id = id;
		this.bill = bill;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getBill() {
		return bill;
	}

	public void setBill(float bill) {
		this.bill = bill;
	}

	public String toString() {
		return "Phone [no=" + no + ", id=" + id + ", bill=" + bill + "]";
	}

}
