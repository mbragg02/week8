package memoizedFibonacci;

public class MemoizedFibonacci {
	
	// arrays are 0-based, so F(1) is stored at position 0, etc 
	private static int[] precalculated = null;
	
	
	public static void main(String[] args) {
		// Test both the Memoized Fibonacci method and the standard recursive method.
		// See which one is faster... int the Memoized method.
		
		System.out.println("Memoized Fibonacci calculator: " + fib(40));
		System.out.println("Basic Fibonacci calculator: " + basicFib(40));
		
	}
	
	
	// Previous method without using memoization
	public static int basicFib(int n) {
		if ((n == 1) || (n == 2)) {
			return 1;
		} else {
			int result = basicFib(n-1) + basicFib(n-2);
			return result;
		}
	}
	

	
	
	public static int fib(int n) {
		if (precalculated == null) {
			initPrecalculatedArray(n); 
		}
		if (precalculated[n-1] != -1) { 
			return precalculated[n-1];
		} else {
		int result = fib(n-1) + fib(n-2); precalculated[n-1] = result; 
		return result;
		} 
	}
		
	private static void initPrecalculatedArray(int size) { 
		precalculated = new int[size];
		for (int i = 0; i < precalculated.length; i++) {
			precalculated[i] = -1; // to indicate "not calculated yet" 
			}
		precalculated[0] = 1; // F(1)
		precalculated[1] = 1; // F(2) 
	}
		
	
		
	


}


