
public class TokenListImpl implements TokenList{

	static final int INITIAL = 100;
	Token[] tokensArray;
	int numberOfTokens;

	TokenListImpl(){
		tokensArray = new Token[INITIAL];
		numberOfTokens = 0;
	}

	TokenListImpl(TokenListImpl targetList){
		numberOfTokens = targetList.size();
		tokensArray = new Token[numberOfTokens];
		copyElements(tokensArray, targetList.tokensArray, numberOfTokens);
	}

	/**
	 *
	 * @pre - @param destinationArray must be empty
	 * @param destinationArray - Token[] type; the array in which the elements will be copied
	 * @param targetArray - Token[] type; the array from which the elements will be copied
	 * @param sizeToCopy - Int type; the number of elements to be copied from targetArray to destinationArray
	 */
	private void copyElements(Token[] destinationArray, Token[] targetArray, int sizeToCopy){
		if( (sizeToCopy + numberOfTokens) > destinationArray.length)
		{
			increaseListSize();
		}
		for(int i = 0; i<sizeToCopy; i++)
		{
			destinationArray[i] = targetArray[i];
			numberOfTokens++;
		}
	}


	private void increaseListSize(){
		int tokenArraySize = tokensArray.length * 2;
		Token[] newArray = new Token[tokenArraySize];
		copyElements(newArray, tokensArray, numberOfTokens);
		tokensArray = newArray;
	}

	private boolean isInRange(int index){

		if(index > size()){
			return false;
		}
		return true;
	}


	public void add(Token token) {
		tokensArray[numberOfTokens] = token;
		numberOfTokens++;

	}


	public void remove(int index) {

		if(isInRange(index) && index >= 0){

			for (int i = index; i < numberOfTokens ; i++) {

				tokensArray[i] = tokensArray[i + 1];
			}
			numberOfTokens--;
		}

	}


	public void set(int index, Token token) {

		if (isInRange(index)){
			tokensArray[index] = token;
		}

	}

	
	public Token get(int index) {

		if (isInRange(index)){

			return tokensArray[index];
		}
		
		return null;
	}

	
	public int size() {
		return numberOfTokens;
	}
}
