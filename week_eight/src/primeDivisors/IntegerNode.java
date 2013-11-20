package primeDivisors;

public class IntegerNode {
	
	private Integer element;
	private IntegerNode next;
	
	public IntegerNode(Integer someInt) {
		setElement(someInt);
		this.next = null;
	}
	
	public IntegerNode getNext() {
		return next;
	}

	public void setNext(IntegerNode next) {
		this.next = next;
	}
	

	public Integer getElement() {
		return element;
	}

	public void setElement(Integer someInt) {
		this.element = someInt;
	}

}
