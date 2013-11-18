package binarySearch;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}		
		int x = 3;
		System.out.println("Searching for: " + x);
		
		boolean status = BinarySearch.search(list, x);
		System.out.println(status);

	}

}
