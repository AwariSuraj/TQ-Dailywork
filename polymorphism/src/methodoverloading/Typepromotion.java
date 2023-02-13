package methodoverloading;

public class Typepromotion {

	static void dispaly(float i) {
		System.out.println("float");
		System.out.println(i);
	}

	static void display(int a) {
		System.out.println("int");
		System.out.println(a);
	}

	static void dispaly(long l) {
		System.out.println("long");
		System.out.println(l);
	}

	public static void main(String[] args) {

		display('f');
	}

}
