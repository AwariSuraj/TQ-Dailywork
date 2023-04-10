package com.bookhashmap;

import java.util.HashMap;

public class BookHashMap {

	public static void main(String[] args) {
		HashMap<Book, String> bmap = new HashMap<>();

		bmap.put(new Book(101, "ramayan", 800), "riligious");
		bmap.put(new Book(102, "harrypotter", 800), "fantacy");
		bmap.put(new Book(102, "harrypotter", 800), "fiction");
		bmap.put(new Book(101, "ramayan", 800), "fiction");

		System.out.println(bmap);

	}

}
