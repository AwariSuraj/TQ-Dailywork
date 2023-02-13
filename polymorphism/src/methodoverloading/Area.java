package methodoverloading;

public class Area {

	int length;
	int breadth;
	float height;
	int square;
	int rectangle;
	float triangle;

	public void area1(int length) {
		this.length = length;
		square = this.length * this.length;
		System.out.println("area of Square=" + square);
	}

	void area1(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
		rectangle = 2 * (this.length * this.breadth);
		System.out.println("area of rectangle=" + rectangle);

	}

	void area1(int breadth, float height) {
		this.height = height;
		this.breadth = breadth;
		triangle = 0.5f * (breadth * height);
		System.out.println("area of triangle=" + triangle);
	}

	public static void main(String[] args) {
		Area a = new Area();
		a.area1(5, 53);
	}

}
