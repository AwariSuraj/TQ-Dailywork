package com.hierarchical;

class Landline extends Phone {

	int id1;
	String connection;

	public Landline() {

	}

	public Landline(String no, int id, float bill, int id1, String connection) {
		super(no, id, bill);
		this.id1 = id1;
		this.connection = connection;
	}

	public int getId1() {
		return id1;
	}

	public void setId1(int id1) {
		this.id1 = id1;
	}

	public String getConnection() {
		return connection;
	}

	public void setConnection(String connection) {
		this.connection = connection;
	}

	public String toString() {
		return super.toString() + " landline " + id1 + "  " + connection;
	}

}
