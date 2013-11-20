package mergesort;

import java.util.ArrayList;
import java.util.List;

public class Mergesort {

	
	public static List<Integer> sort (List<Integer> inputList) {		
		
		int size = inputList.size();
		List<Integer> list = copy(inputList, 0, size);
	
		if (list.size() < 2) {
			return list;
		}
		list = mergeSort(list);
		
		return list;

	}
	
	private static List<Integer> copy(List<Integer> list, int from, int too) {
		List<Integer> subList = new ArrayList<Integer>();

		for (int i = from; i < too; i++) {
			subList.add(list.get(i));
		}
		return subList;
	}
	
	
	private static List<Integer> mergeSort (List<Integer> list) {
		
		if (list.size() < 2) {
			return list;
		}
		
		int middleIdx = list.size() / 2;
		
		// Divide stage
		List<Integer> firstHalf = copy(list, 0, middleIdx);
		List<Integer> secondHalf = copy(list, middleIdx, list.size());
	
		List<Integer> sortedLeft = mergeSort(firstHalf);
		List<Integer> sortedRight = mergeSort(secondHalf);		
		
		
		// Intergration stage
		
		List<Integer> result = new ArrayList<Integer>(); 

		
		while(sortedLeft.size() != 0 && sortedRight.size() != 0) {
			if (sortedLeft.get(0) < sortedRight.get(0)) {
				result.add(sortedLeft.get(0));
				sortedLeft.remove(0);
			} else {
				result.add(sortedRight.get(0));
				sortedRight.remove(0);
				
			}
		}
		
		if (sortedLeft.size() != 0) {
			result.addAll(sortedLeft);
		}
		if(sortedRight.size() != 0) {
			result.addAll(sortedRight);
		}
		
		return result;
		
	}
	
}
