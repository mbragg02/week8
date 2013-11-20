package errorHandlingOnUserInput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInput {
	
	
	public static int input(Scanner in) {
		int input = 0;
		while (!in.hasNextInt()) {
			System.out.println("That is not a nunber!");
			System.out.println("Please enter a numer: ");
			in.next();
		}
		input = in.nextInt();
		return input;
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		List<Integer> intList = new ArrayList<Integer>();
		int total = 0;
		
		
		System.out.println("How many numbers would you like to enter?:");
		int numberOFInputs = input(in);

		do {
			System.out.println("Please enter a numer: ");
			int input = input(in);
			intList.add(input);
			
		} while (intList.size() < numberOFInputs);


		
		for (int i = 0; i < intList.size(); i ++) {
			total += intList.get(i);
		}

		double mean = 1d * total / intList.size();
		System.out.println("Total: " + total);
		System.out.println("number: " + intList.size());
		System.out.println("Mean: " + mean);



	}

}
