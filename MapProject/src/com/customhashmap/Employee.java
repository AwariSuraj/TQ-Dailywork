package com.customhashmap;

public class Employee {

	private int eid;
	private String name;
	private float Salary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int eid, String name, float salary) {
		super();
		this.eid = eid;
		this.name = name;
		Salary = salary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return Salary;
	}

	public void setSalary(float salary) {
		Salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", Salary=" + Salary + "]";
	}

	@Override
	public int hashCode() {
		return eid + name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == null) {
			return true;

		}
		if (obj == null) {
			return false;

		}
		if (this.getClass() != obj.getClass()) {
			return false;

		}
		Employee e = (Employee) obj;
		return (eid == e.eid) && (name.equals(e.name));

	}
}
