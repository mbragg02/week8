package anagrams;

import java.util.ArrayList;

public class AnagramsMain {

	public static void main(String[] args) {
		
		ArrayList<String> wordsArray = Anagrams.create("abc");
		print(wordsArray);

	}
	
	private static void print(ArrayList<String> wordsArray) {
		
		int size = wordsArray.size();
		
		for (int i = 0; i < size; i++) {
			System.out.println(wordsArray.get(i));
		}
		
	}

}
