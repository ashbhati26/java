import java.util.*;
public class Question04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature in Celsius: ");
        float celsius = sc.nextFloat();
        float fahrenheit = (celsius * 9/5) + 32;
            System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.");
    }
}