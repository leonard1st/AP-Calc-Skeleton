
public class DoubleStackImpl implements DoubleStack{

	static final int INITIAL = 100;
	private Token[] doublesArray;
	int numberOfDoubles;

	DoubleStackImpl(){
		doublesArray = new Token[INITIAL];
		numberOfDoubles = 0;
	}
	
	
	public void push(Token element) {
		
		doublesArray[numberOfDoubles] = element;
		numberOfDoubles++;
		
	}

	public Token pop() {
		
		numberOfDoubles--;
		
		return doublesArray[numberOfDoubles];
	}

	
	public Token top() {
		
		return doublesArray[numberOfDoubles-1];
	}

	
	public int size() {
		
		return numberOfDoubles;
	}

}
