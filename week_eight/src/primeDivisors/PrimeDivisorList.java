package primeDivisors;


public class PrimeDivisorList implements PrimeDivisor{

	private IntegerNode first;

	public PrimeDivisorList () {
		first = null;
	}
	
	
	//checks whether an int is prime or not.
	boolean isPrime(Integer n) {
		System.out.println(n);
	    for(int i = 2; 2 * i < n; i++) {
	        if( n%i == 0) {
	        	 return false;
	        }  
	    }
	    return true;
	}


	@Override
	public void add(Integer integerToAdd) {
		
		if (integerToAdd == null) {
			throw new NullPointerException("can't add a null Integer");
		}
		if (isPrime(integerToAdd)) {
			throw new IllegalArgumentException("Must be a prime");
		}

		IntegerNode newNode = new IntegerNode(integerToAdd);

		if (first == null) {
			first = newNode;
			return;
		}

		IntegerNode aux = first;

		while(aux.getNext() != null) {
			aux = aux.getNext();
		}
		aux.setNext(newNode);

	}

	@Override
	public void remove(Integer x) {

		if(first == null) {
			return;
		}

		IntegerNode aux = first;

		while(aux.getNext() != null) {
			
			// Case for removing first element.
			if(aux.getElement() == x) {
				first = aux.getNext();
				return;
			}
			
			//case for removing last element.
			if(aux.getNext().getNext() == null) {
				aux.setNext(null);
				return;
			}
			
			// case for the other elements in the list
			if (aux.getNext().getElement().equals(x)) {
				aux.setNext(aux.getNext().getNext());
			}
			
			aux = aux.getNext();
		}



	}

	public void print() {
		IntegerNode current = first;
		System.out.println(">>>>");
		while(current != null) {
			System.out.println(" " + current.getElement());
			current = current.getNext();
		}
	}








}
