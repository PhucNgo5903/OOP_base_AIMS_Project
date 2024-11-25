import java.util.Scanner;

public class DaysOfMonth {
    public static void main(String[] args) {
        Scanner scannerHoangPhuc5903 = new Scanner(System.in);
        int monthHoangPhuc5903 = 0;
        int yearHoangPhuc5903 = 0;

        // Loop until a valid month and year are entered
        while (true) {
            System.out.print("HoangPhuc5903 Enter a valid month (1-12): ");
            if (scannerHoangPhuc5903.hasNextInt()) {
                monthHoangPhuc5903 = scannerHoangPhuc5903.nextInt();
            } else {
                scannerHoangPhuc5903.next(); // Consume invalid input
                System.out.println("Invalid input! Please enter a valid month.");
                continue;
            }

            System.out.print("HoangPhuc5903 Enter a valid year (positive, 4 digits): ");
            if (scannerHoangPhuc5903.hasNextInt()) {
                yearHoangPhuc5903 = scannerHoangPhuc5903.nextInt();
            } else {
                scannerHoangPhuc5903.next(); // Consume invalid input
                System.out.println("HoangPhuc5903 Invalid input! Please enter a valid year.");
                continue;
            }

            // Validate month and year
            if (monthHoangPhuc5903 < 1 || monthHoangPhuc5903 > 12 || yearHoangPhuc5903 <= 0 || String.valueOf(yearHoangPhuc5903).length() != 4) {
                System.out.println("HoangPhuc5903 Invalid month or year! Please enter again.");
            } else {
                break;
            }
        }

        // Determine the number of days in the entered month and year
        int daysHoangPhuc5903 = getDaysInMonth(monthHoangPhuc5903, yearHoangPhuc5903);
        System.out.println("HoangPhuc5903 Number of days in " + monthHoangPhuc5903 + "/" + yearHoangPhuc5903 + ": " + daysHoangPhuc5903);
        scannerHoangPhuc5903.close();
    }

    // Method to return the number of days in the given month and year
    public static int getDaysInMonth(int monthHoangPhuc5903, int yearHoangPhuc5903) {
        switch (monthHoangPhuc5903) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                // Check for leap year
                if (isLeapYearHoangPhuc5903(yearHoangPhuc5903)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return 0; // Should not reach here
        }
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYearHoangPhuc5903(int yearHoangPhuc5903) {
        // A leap year is divisible by 4, but not by 100 unless also divisible by 400
        return (yearHoangPhuc5903 % 4 == 0 && yearHoangPhuc5903 % 100 != 0) || (yearHoangPhuc5903 % 400 == 0);
    }
}