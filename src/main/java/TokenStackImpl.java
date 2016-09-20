
public class TokenStackImpl implements TokenStack {

	static final int INITIAL = 100;
	Token[] tokensArray;
	int numberOfTokens;

	TokenStackImpl(){
		tokensArray = new Token[INITIAL];
		numberOfTokens = 0;
	}


	public void push(Token token) {

		tokensArray[numberOfTokens] = token;
		numberOfTokens++;

	}


	public Token pop() {

		numberOfTokens--;

		return tokensArray[numberOfTokens];
	}


	public Token top() {

		return tokensArray[numberOfTokens-1];
	}


	public int size() {

		return numberOfTokens;
	}

}
