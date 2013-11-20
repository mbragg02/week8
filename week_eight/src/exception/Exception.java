package exception;

import java.util.ArrayList;
import java.util.List;

public class Exception {

	public static void main(String[] args) {
		int userInput = 0;
		launch(userInput);

	}

	public static void launch(int userInput) {
		List<Integer> intList = new ArrayList<Integer>();


		try {
			intList.add(1);
			intList.add(2);
			intList.add(3);
			intList.add(4);
			intList.add(5);
			intList.add(6);

		} catch (IndexOutOfBoundsException ex){
			ex.printStackTrace();
		} catch (NullPointerException ex) { 
			ex.printStackTrace();
		}



	}


}
