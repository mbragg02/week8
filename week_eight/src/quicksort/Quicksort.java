package quicksort;

import java.util.ArrayList;
import java.util.List;

public class Quicksort {
	
	private static List<Integer> copy(List<Integer> list, int from, int too) {
		List<Integer> subList = new ArrayList<Integer>();

		for (int i = from; i < too; i++) {
			subList.add(list.get(i));
		}
		return subList;
	}
	
	private static List<Integer> lowerSublist(List<Integer> list, int pivot) {
		List<Integer> subList = new ArrayList<Integer>();
		
		for (int i = 0; i < list.size(); i ++) {
			if (list.get(i) < pivot) {
				subList.add(list.get(i));
			} 
		}
		return subList;	
	}
	
	private static List<Integer> higherSublist(List<Integer> list, int pivot) {
		List<Integer> subList = new ArrayList<Integer>();
		
		for (int i = 0; i < list.size(); i ++) {
			if (list.get(i) > pivot) {
				subList.add(list.get(i));
			} 
		}
		return subList;	
	}
	

	
	public static List<Integer> sort (List<Integer> inputList) {		
		
		int size = inputList.size();
		List<Integer> list = copy(inputList, 0, size);
	
		if (list.size() < 2) {
			return list;
		}
		
		list = quickSort(list);
		
		return list;

	}
	
	
	private static List<Integer> quickSort (List<Integer> list) {
		
		if (list.size() < 2) {
			return list;
		}
		
		int pivot = list.get(0);
				
		// Divide Stage
		List<Integer> firstHalf = lowerSublist(list, pivot);
		List<Integer> secondHalf = higherSublist(list, pivot);
		
		List<Integer> sortedLeft = quickSort(firstHalf);
		List<Integer> sortedRight = quickSort(secondHalf);
		
		
		// Intergration stage
		List<Integer> result = new ArrayList<Integer>(); 
		
		result.addAll(sortedLeft);
		result.add(pivot);
		result.addAll(sortedRight);
		
		return result;
	}

}
