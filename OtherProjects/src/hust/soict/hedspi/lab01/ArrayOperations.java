import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {

    public static void main(String[] args) {
        Scanner scannerHoangPhuc5903 = new Scanner(System.in);
        int[] numbersHoangPhuc5903;

        // Ask the user whether they want to input their own array or use a constant array
        System.out.println("HoangPhuc5903. Do you want to enter your own array?"
        		+ " (HoangPhuc5903yes/HoangPhuc5903no)");
        String choiceHoangPhuc5903 = scannerHoangPhuc5903.nextLine().trim().toLowerCase();

        if (choiceHoangPhuc5903.equals("hoangphuc5903yes")) {
            // Ask the user to input the size of the array
            System.out.print("HoangPhuc5903. Enter the size of the array: ");
            int sizeHoangPhuc5903 = scannerHoangPhuc5903.nextInt();
            numbersHoangPhuc5903 = new int[sizeHoangPhuc5903];

            // Ask the user to input the array elements
            System.out.println("HoangPhuc5903. Enter " + sizeHoangPhuc5903 + " elements:");
            for (int iHoangPhuc5903 = 0; iHoangPhuc5903 < sizeHoangPhuc5903; iHoangPhuc5903++) {
                numbersHoangPhuc5903[iHoangPhuc5903] = scannerHoangPhuc5903.nextInt();
            }
        } else {
            // Use a constant array if the user chooses not to input their own
            numbersHoangPhuc5903 = new int[]{3, 5, 7, 2, 8, 10, 6, 1, 4, 9};
            System.out.println("HoangPhuc5903. Using constant array: " 
            + Arrays.toString(numbersHoangPhuc5903));
        }

        // Sort the array
        Arrays.sort(numbersHoangPhuc5903);

        // Calculate the sum of the array elements
        int sumHoangPhuc5903 = 0;
        for (int numberHoangPhuc5903 : numbersHoangPhuc5903) {
            sumHoangPhuc5903 += numberHoangPhuc5903;
        }

        // Calculate the average value
        double averageHoangPhuc5903 = (double) sumHoangPhuc5903 / numbersHoangPhuc5903.length;

        // Display the sorted array, sum, and average
        System.out.println("HoangPhuc5903. Sorted Array: " + Arrays.toString(numbersHoangPhuc5903));
        System.out.println("HoangPhuc5903. Sum of elements: " + sumHoangPhuc5903);
        System.out.println("HoangPhuc5903. Average value: " + averageHoangPhuc5903);

        scannerHoangPhuc5903.close();
    }
}