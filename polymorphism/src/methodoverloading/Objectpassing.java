package methodoverloading;

class Student {

	private int id;
	private String name;
	private int age;

	public void setId(int id) {
		this.id = id;

	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;

	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;

	}

	public int getAge() {
		return age;

	}

	public class Objectpassing {

		static void incrMarks(Student s) {
			if (s.getAge() < 16) {
				int a = s.getAge() + 5;

				s.setAge(a);
			}
		}

		public static void main(String[] args) {

			Student s1 = new Student();

			s1.setAge(15);
			incrMarks(s1);
			s1.getAge();

		}

	}
}
