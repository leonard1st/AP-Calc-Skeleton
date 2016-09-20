/** 
 * @elements numbers of the type Token
 * @structure linear
 * @domain all rows of Doubles
 **/
public interface DoubleStack {

    /**
     * @pre -
     * @post Token element is now at the top of the stack.
     */
    void push(Token element);

    /**
     * @pre The stack is not empty
     * @post The element at the top of the stack is returned and deleted.
     */
    Token pop();

    /**
     * @pre The stack is not empty
     * @post The element at the top of the stack is returned.
     */
    Token top();

    /**
     * @post The number of elements on the stack is returned
     */
    int size();
}
