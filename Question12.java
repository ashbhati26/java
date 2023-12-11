import java.util.*;
public class Question12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String userInput = input.nextLine();
        
        StringTokenizer tokenizer = new StringTokenizer(userInput, " ");
        boolean isIndiaPresent = false;

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            if (token.equals("India")) {
                isIndiaPresent = true;
                break;
            }
        }

        System.out.println("Is the word 'India' present in the given string? " + isIndiaPresent);
    }
}