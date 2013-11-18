package hailstoneNumbers;

import java.util.ArrayList;

public class HailstoneMain {

	public static void main(String[] args) {
		ArrayList<Integer> list = Hailstone.create(104897653);
		print(list);
	}
	
	private static void print(ArrayList<Integer> list) {
		int size = list.size();
		for (int i = 0; i < size; i ++ ){
			System.out.println(list.get(i));
		}
		
	}

}
