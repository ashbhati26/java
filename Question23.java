import java.util.Scanner;
public class Question23 {

    public static boolean hasSubstringBeforePeriod(String input) {
        int periodIndex = input.indexOf('.');
        // Check if a period is present and if the substring before it is not empty
        return periodIndex != -1 && periodIndex > 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input string from the user
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Check if a substring appears before a period
        boolean result = hasSubstringBeforePeriod(userInput);

        // Display the result
        if (result) {
            System.out.println("Yes, there is a substring before a period.");
        } else {
            System.out.println("No substring appears before a period or the period is at the beginning.");
        }
    }
}