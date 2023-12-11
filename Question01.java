import java.util.*;
public class Question01 {

    public static double calculate(String operation, double num1, double num2){
        switch (operation) {
            case "1":
                return num1 + num2;
            case "2":
                return num1 - num2;
            case "3":
                return num1 * num2;
            case "4":
                if (num2 == 0) {
                    System.out.println("Error: Division by zero");
                } else {
                    return num1 / num2;
                }
            default:
                return Double.NaN;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            String choice = sc.nextLine();
            if (choice.equals("5")) {
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }
            if (choice.matches("[1-4]")) {
                System.out.print("Enter first number: ");
                double num1 = Double.parseDouble(sc.nextLine());

                System.out.print("Enter second number: ");
                double num2 = Double.parseDouble(sc.nextLine());

                double result = calculate(choice, num1, num2);
                if (!Double.isInfinite(result)) {
                    System.out.println("Result: " + result);
                }
            } else {
                System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}