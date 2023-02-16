package com.SingleInheritance;

public class Manager extends Employee {

	int experience;

	Manager() {

	}

	public Manager(int id, String name, float salary, int experience) {
		super(id, name, salary);
		this.experience = experience;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String toString() {
		return id + "  " + name + "   " + salary + " " + experience;
	}
}
