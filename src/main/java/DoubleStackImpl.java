
public class DoubleStackImpl implements DoubleStack{

	static final int INITIAL = 100;
	private Double[] doublesArray;
	int numberOfDoubles;

	DoubleStackImpl(){
		doublesArray = new Double[INITIAL];
		numberOfDoubles = 0;
	}
	
	
	public void push(Double element) {
		
		doublesArray[numberOfDoubles] = element;
		numberOfDoubles++;
		
	}

	public Double pop() {
		
		numberOfDoubles--;
		
		return doublesArray[numberOfDoubles];
	}

	
	public Double top() {
		
		return doublesArray[numberOfDoubles-1];
	}

	
	public int size() {
		
		return numberOfDoubles;
	}

}
