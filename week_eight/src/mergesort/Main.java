package mergesort;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> mylist = new ArrayList<Integer>();
		
		for (int i = 1; i < 11; i ++) {
			mylist.add(0,i);
		}		
		print(mylist);
		
		mylist = Mergesort.sort(mylist);
		
		print(mylist);
	}
	
	
	private static void print(List<Integer> list) {
		for (int i = 0; i < list.size(); i ++) {
			System.out.print(list.get(i));
			System.out.print(", ");
		}
		System.out.print("\n");
	}

}
