
import java.util.Scanner;

public class Subtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Input the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Perform subtraction
        double result = num1 - num2;

        // Display the result
        System.out.println("Result of subtraction: " + result);

        // Close the scanner
        scanner.close();
    }
}