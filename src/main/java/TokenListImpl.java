
public class TokenListImpl implements TokenList{

	static final int INITIAL = 100;
	Double[] tokensArray;
	int numberOfTokens;

	TokenListImpl(){
		tokensArray = new Double[INITIAL];
		numberOfTokens = 0;
	}

	TokenListImpl(TokenListImpl targetList){
		numberOfTokens = targetList.size();
		tokensArray = new Double[numberOfTokens];
		copyElements(tokensArray, targetList.tokensArray, numberOfTokens);
	}

	/**
	 *
	 * @pre - @param destinationArray must be empty
	 * @param destinationArray - Token[] type; the array in which the elements will be copied
	 * @param targetArray - Token[] type; the array from which the elements will be copied
	 * @param sizeToCopy - Int type; the number of elements to be copied from targetArray to destinationArray
	 */
	private void copyElements(Double[] destinationArray, Double[] targetArray, int sizeToCopy){
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
		Double[] newArray = new Double[tokenArraySize];
		copyElements(newArray, tokensArray, numberOfTokens);
		tokensArray = newArray;
	}

	private boolean isInRange(int index){

		if(index > size()){
			return false;
		}
		return true;
	}


	public void add(Double token) {
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


	public void set(int index, Double token) {

		if (isInRange(index)){
			tokensArray[index] = token;
		}

	}

	
	public Double get(int index) {

		if (isInRange(index)){

			return tokensArray[index];
		}
		
		return null;
	}

	
	public int size() {
		return numberOfTokens;
	}
}
