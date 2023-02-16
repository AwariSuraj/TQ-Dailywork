package functionoverriding;

class Person {
	void display() {
		System.out.println(" i am a  person");
	}
}

class Celebrity extends Person {
	void display() {
		System.out.println("i am celebrity");
	}
}

class Employee extends Person {
	void display() {
		System.out.println("i am a empolyee");
	}
}

public class Simple {

	public static void main(String[] args) {
		Person p = new Person();
		p.display();

		Celebrity c = new Celebrity();
		c.display();

		Employee e = new Employee();
		e.display();
	}

}
