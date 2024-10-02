import java.util.Scanner;

public class BuildingTriangle {
    public static void main(String[] args) {
        Scanner scannerHoangPhuc5903 = new Scanner(System.in);
        System.out.print("HoangPhuc5903 Enter the height of the triangle (n): ");
        int nHoangPhuc5903 = scannerHoangPhuc5903.nextInt();

        for (int iHoangPhuc5903 = 1; iHoangPhuc5903 <= nHoangPhuc5903; iHoangPhuc5903++) {
            // Print spaces for left side alignment
            for (int jHoangPhuc5903 = iHoangPhuc5903; jHoangPhuc5903 < nHoangPhuc5903; jHoangPhuc5903++) {
                System.out.print(" ");
            }

            // Print stars for the triangle
            for (int kHoangPhuc5903 = 1; kHoangPhuc5903 <= (2 * iHoangPhuc5903 - 1); kHoangPhuc5903++) {
                System.out.print("*");
            }

            // Move to the next line after printing each row
            System.out.println();
        }
        scannerHoangPhuc5903.close();
    }
}
    