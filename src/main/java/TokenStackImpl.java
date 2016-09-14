
public class TokenStackImpl implements TokenStack {

	static final int INITIAL = 100;
	Double[] tokensArray;
	int numberOfTokens;

	TokenStackImpl(){
		tokensArray = new Double[INITIAL];
		numberOfTokens = 0;
	}


	public void push(Double token) {

		tokensArray[numberOfTokens] = token;
		numberOfTokens++;

	}


	public Double pop() {

		numberOfTokens--;

		return tokensArray[numberOfTokens];
	}


	public Double top() {

		return tokensArray[numberOfTokens-1];
	}


	public int size() {

		return numberOfTokens;
	}

}
