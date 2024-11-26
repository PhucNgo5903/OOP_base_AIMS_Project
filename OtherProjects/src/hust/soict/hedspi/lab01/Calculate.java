import java.util.Scanner;
public class Calculate {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Ngo Hoang Phuc - 5903. Enter the first number: ");
        String strNum1HoangPhuc5903 = scanner.nextLine();  // Read input as String

        // Convert the input to double
        double num1HoangPhuc5903 = Double.parseDouble(strNum1HoangPhuc5903);

        // Prompt the user to enter the second number
        System.out.print("Ngo Hoang Phuc - 5903.Enter the second number: ");
        String strNum2HoangPhuc5903 = scanner.nextLine();  // Read input as String

        // Convert the input to double
        double num2HoangPhuc5903 = Double.parseDouble(strNum2HoangPhuc5903);

        // Calculate sum, difference, and product
        double sumHoangPhuc5903 = num1HoangPhuc5903 + num2HoangPhuc5903;
        double differenceHoangPhuc5903 = num1HoangPhuc5903 - num2HoangPhuc5903;
        double productHoangPhuc5903 = num1HoangPhuc5903 * num2HoangPhuc5903;

        // Display the results
        System.out.println("Ngo Hoang Phuc - 5903.Sum: " + sumHoangPhuc5903);
        System.out.println("Ngo Hoang Phuc - 5903.Difference: " + differenceHoangPhuc5903);
        System.out.println("Ngo Hoang Phuc - 5903.Product: " + productHoangPhuc5903);

        // Check if the second number is not zero to avoid division by zero
        if (num2HoangPhuc5903 != 0) {
            double quotientHoangPhuc5903 = num1HoangPhuc5903 / num2HoangPhuc5903;
            System.out.println("Ngo Hoang Phuc - 5903.Quotient: " + quotientHoangPhuc5903);
        } else {
            System.out.println("Ngo Hoang Phuc - 5903. Cannot divide by zero.");
        }
        scanner.close();
    }
}