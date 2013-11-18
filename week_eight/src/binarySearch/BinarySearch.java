package binarySearch;

import java.util.List;

public class BinarySearch {
	
	private static boolean status = false;
	
	
	public static boolean search(List<Integer> list, int n) {
		
		System.out.println(">>>");
		System.out.println("Size: " + list.size());

		if (list.size() == 0) {
			return true;
		}
		
		
		System.out.println("First num: " + list.get(0));
		
		if (list.size() == 1) {
			if(list.get(0) == n) {
				System.out.println("debug 1");
				return true;
			}
			else {
				System.out.println("debug 2");
				return false;
			}
		}
		
		int middle = list.get(list.size() / 2);
		System.out.println("Middle: " + middle);
		
		
		
		
		if (middle == n) {
			System.out.println("debug 3");
			status =  true;
			
		} else if (n < middle) {
			list = list.subList(0, list.indexOf(middle));
			System.out.println("New size: " + list.size());
			search(list, n);
			
		} else {
			list = list.subList(list.indexOf(middle), list.size());
			System.out.println("New size: " + list.size());
			search(list, n);
		} 
		


		
		
		return status;


		

		
		

		
		
		
		
	}
 	
	
}
