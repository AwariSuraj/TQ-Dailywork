package com.dynamicmethoddispatch;

class Player {
	void display() {
		System.out.println("playing game");
	}

}

class Cricket extends Player {
	void display() {
		System.out.println("playing cricket ");
	}
}

class Football extends Player {
	void display() {
		System.out.println("playing football ");
	}
}

public class Dynamic {

	public static void main(String[] args) {

		Player p = new Cricket();
		p.display();

		Player p1 = new Football();
		p1.display();
	}

}
