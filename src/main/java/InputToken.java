class InputToken implements Token {

    private String value;
    private int type;
    private int precedence;
    private static final String OPERATOR_TOKENS = "+-*/^";
    private static final String PARENTHESIS_TOKENS = "()";

    /**
     * Constructor
     * @param value - Type double; The value that
     *              the new token will be assigned with
     * @pre -
     * @post - A new Object of type InputToken has been created with its specific attributes;
     */
    InputToken(double value )
    {
        this.value = String.valueOf(value);
        this.type = Token.NUMBER_TYPE;
        this.precedence = -1;
    }

    /**
     *
     * @param value - Type string, inherited from the interface; The value that
     *              the new token will be assigned with
     * @pre -
     * @post - A new Object of type InputToken has been created with its specific attributes;
     */
    InputToken(String value )
    {
        this.value = value;
        this.type = parseType();
        this.precedence = parsePrecedence();
    }

    /**
     * Constructor
     * @pre - the value, type and precedence is known
     * @post - A new Object of type InputToken has been created with its specific attributes
     * @param value
     * @param type
     * @param precedence
     */
    InputToken(String value, int type, int precedence )
    {
        this.value = value;
        this.type = type;
        this.precedence = precedence;
    }

    /**
     * The copy constructor
     * @param targetToken - Type Token; The target token to be copied;
     * @pre - targetToken has to be of type Token
     * @post - the value of the targetToken has been attributed to the fields of the current object
     */
    InputToken(Token targetToken)
    {
        this.value = targetToken.getValue();
        this.type = targetToken.getType();
        this.precedence = targetToken.getPrecedence();
    }

    /**
     * (Re)initialize the attributes of the object
     * @pre -
     * @post - The value of the attributes were (re)initialized
     */
    public void init()
    {
        this.value = null;
        this.type = 0;
        this.precedence = -1;
    }

    /**
     * Interface implement
     * @return - String type;
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Change the value of the attribute @value
     * @param newValue - The new value to be assigned to the attribute @value
     * @pre -
     * @post - The value of attribute @value has been changed
     */
    public void setValue(String newValue) {
        this.value = newValue;
    }

    /**
     * Interface implement
     * @return - int type;
     */
    public int getType(){
        return this.type;
    }

    /**
     * Change the value of attribute @type
     * @param newType - The new value to be assigned to the attribute @type
     * @pre -
     * @post - The value of attribute @type was changed
     */
    public void setType(int newType){
        this.type = newType;
    }

    /**
     * Interface implement
     * @return - Type int;
     */
    public int getPrecedence(){
        return this.precedence;
    }

    /**
     * Change the value of attribute @precedence
     * @param newPrecedence - The new value to be assigned to the attribute @precedence
     * @pre -
     * @post - The value of the attribute @precedence was changed
     */
    public void setPrecedence(int newPrecedence){
        this.precedence = newPrecedence;
    }

    /**
     * Parses the type of the attribute @value as required in the exercises
     * @return - type int. Return the parsed type
     */
    private int parseType(){
        if(OPERATOR_TOKENS.contains(this.value))
            return Token.OPERATOR_TYPE;
        else
            if(PARENTHESIS_TOKENS.contains(this.value))
                return Token.PARENTHESIS_TYPE;
        return Token.NUMBER_TYPE;
    }

    /**
     * Parses the precedence if it's the case
     * @return - Returns the precedence if applicable, otherwise it returns -1;
     */
    private int parsePrecedence(){
        if( (this.getType() == Token.NUMBER_TYPE) || (this.getType() == Token.PARENTHESIS_TYPE) )
            return -1;
        String value = this.getValue();
        if(value.equals("+") || value.equals("-"))
            return 0;
        else
            if(value.equals("*") || value.equals("/"))
                return 1;
        else if(value.equals("^"))
            return 2;
        return -1;
    }
}
