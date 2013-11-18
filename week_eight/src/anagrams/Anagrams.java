package anagrams;

import java.util.ArrayList;

public class Anagrams {
	
	private static ArrayList<String> wordsArray;
	
	public static ArrayList<String> create(String str) { 
		wordsArray = new ArrayList<String>();
	    if (str.length() == 1) {
	        wordsArray.add(str);
	        return wordsArray;
	    }

	    create("", str);
		return wordsArray; 
	}

	private static void create(String prefix, String str) {
	    int n = str.length();
	    if (n == 1)  {
	    	wordsArray.add(prefix + str);
//	    	System.out.println(prefix + str);
	    }
	    else {
	        for (int i = 0; i < n; i++)
	        	create(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	    }
	}

}
