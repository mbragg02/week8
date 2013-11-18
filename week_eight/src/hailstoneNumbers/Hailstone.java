package hailstoneNumbers;

import java.util.ArrayList;

public class Hailstone {
	
	private static ArrayList<Integer> intArrayList;
	
	public static ArrayList<Integer> create(int n) {
		
		intArrayList = new ArrayList<Integer>();
		if (n == 1) {
			intArrayList.add(n);
			return intArrayList;
		}
		
		hailstone(n);
		return intArrayList;
	}
	
	private static void hailstone(int n) {
		if (n == 1) {
			return;
		}
		
		if (n % 2 == 0) {
			n = n / 2;
		} else {
			n = 3 * n + 1;
		}
		intArrayList.add(n);
		hailstone(n);
			
	}

}
