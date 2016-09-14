import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main implements CalculatorInterface {

//asdasdasdasdasd
    public TokenList readTokens(String input) {
        // TODO: Implement this
        Scanner scanner = new Scanner(input);

        while( scanner.hasNext() )
        {
            Double token;
            String value = scanner.next();
            token = getParsedToken(value);

            System.out.println(token.getValue());
        }

        return null;
    }

    private Double getParsedToken(String tokenString)
    {
        Double token;
        Scanner doubleCheck = new Scanner(tokenString);
        if( doubleCheck.hasNextDouble() )
            token = new InputToken(Double.valueOf(tokenString));
        else
            token = new InputToken(tokenString);
        return token;
    }

    public Double rpn(TokenList tokens) {
        // TODO: Implement this
        return null;
    }

    public TokenList shuntingYard(TokenList tokens) {
        // TODO: Implement this
        return null;
    }

    private void start() {
        // Create a scanner on System.in
        Scanner scanner = new Scanner(System.in);
        
        // While there is input, read line and parse it.
        String input = scanner.nextLine();
        TokenList parsedTokens = readTokens(input);
    }

    public static void main(String[] argv) {
        new Main().start();
    }
}
