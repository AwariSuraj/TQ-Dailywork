package comparator1;

import java.util.ArrayList;
import java.util.Collections;

public class BookArrayList {

	public static void main(String[] args) {
		ArrayList<Book> blist = new ArrayList<>();
		blist.add(new Book(101, "Hamlet", 780f));
		blist.add(new Book(107, "Ramayan", 800f));
		blist.add(new Book(107, "Geeta", 760f));
		blist.add(new Book(108, "HarryPotter", 1050f));
		blist.add(new Book(105, "The Secret", 960f));

		for (Book b : blist) {
			System.out.println(b);
		}

		Collections.sort(blist, new NameComparator());

		System.out.println("............................");
		for (Book b : blist) {
			System.out.println(b);
		}
	}

}
