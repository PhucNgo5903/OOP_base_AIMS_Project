import java.util.Scanner;

public class MatrixAddition {

    public static void main(String[] args) {
        Scanner scannerHoangPhuc5903 = new Scanner(System.in);
        int rowsHoangPhuc5903, colsHoangPhuc5903;
        int[][] matrix1HoangPhuc5903, matrix2HoangPhuc5903, resultHoangPhuc5903;

        // Ask the user whether they want to input their own matrices or use constants
        System.out.println("HoangPhuc5903. Do you want to enter your own matrices? (HoangPhuc5903yes/HoangPhuc5903no)");
        String choiceHoangPhuc5903 = scannerHoangPhuc5903.nextLine().trim().toLowerCase();

        if (choiceHoangPhuc5903.equals("hoangphuc5903yes")) {
            // Ask for the size of the matrices
            System.out.print("HoangPhuc5903. Enter the number of rows: ");
            rowsHoangPhuc5903 = scannerHoangPhuc5903.nextInt();
            System.out.print("HoangPhuc5903. Enter the number of columns: ");
            colsHoangPhuc5903 = scannerHoangPhuc5903.nextInt();

            // Initialize the matrices
            matrix1HoangPhuc5903 = new int[rowsHoangPhuc5903][colsHoangPhuc5903];
            matrix2HoangPhuc5903 = new int[rowsHoangPhuc5903][colsHoangPhuc5903];
            resultHoangPhuc5903 = new int[rowsHoangPhuc5903][colsHoangPhuc5903];

            // Input elements for matrix1
            System.out.println("HoangPhuc5903. Enter elements of the first matrix:");
            for (int iHoangPhuc5903 = 0; iHoangPhuc5903 < rowsHoangPhuc5903; iHoangPhuc5903++) {
                for (int jHoangPhuc5903 = 0; jHoangPhuc5903 < colsHoangPhuc5903; jHoangPhuc5903++) {
                    matrix1HoangPhuc5903[iHoangPhuc5903][jHoangPhuc5903] = scannerHoangPhuc5903.nextInt();
                }
            }

            // Input elements for matrix2
            System.out.println("HoangPhuc5903. Enter elements of the second matrix:");
            for (int iHoangPhuc5903 = 0; iHoangPhuc5903 < rowsHoangPhuc5903; iHoangPhuc5903++) {
                for (int jHoangPhuc5903 = 0; jHoangPhuc5903 < colsHoangPhuc5903; jHoangPhuc5903++) {
                    matrix2HoangPhuc5903[iHoangPhuc5903][jHoangPhuc5903] = scannerHoangPhuc5903.nextInt();
                }
            }

        } else {
            // Use constant matrices if the user chooses not to input their own
            matrix1HoangPhuc5903 = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };

            matrix2HoangPhuc5903 = new int[][]{
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
            };

            rowsHoangPhuc5903 = matrix1HoangPhuc5903.length;
            colsHoangPhuc5903 = matrix1HoangPhuc5903[0].length;
            resultHoangPhuc5903 = new int[rowsHoangPhuc5903][colsHoangPhuc5903];

            System.out.println("HoangPhuc5903. Using constant matrices:");
            rowsHoangPhuc5903 = matrix1HoangPhuc5903.length;
            colsHoangPhuc5903 = matrix1HoangPhuc5903[0].length;
            resultHoangPhuc5903 = new int[rowsHoangPhuc5903][colsHoangPhuc5903];

            // Print matrix1HoangPhuc5903
            System.out.println("HoangPhuc5903. Matrix 1:");
            for (int i = 0; i < rowsHoangPhuc5903; i++) {
                for (int j = 0; j < colsHoangPhuc5903; j++) {
                    System.out.print(matrix1HoangPhuc5903[i][j] + " ");
                }
                System.out.println();
            }

            // Print matrix2HoangPhuc5903
            System.out.println("HoangPhuc5903. Matrix 2:");
            for (int i = 0; i < rowsHoangPhuc5903; i++) {
                for (int j = 0; j < colsHoangPhuc5903; j++) {
                    System.out.print(matrix2HoangPhuc5903[i][j] + " ");
                }
                System.out.println();
            }
        }

        // Add the two matrices
        for (int iHoangPhuc5903 = 0; iHoangPhuc5903 < rowsHoangPhuc5903; iHoangPhuc5903++) {
            for (int jHoangPhuc5903 = 0; jHoangPhuc5903 < colsHoangPhuc5903; jHoangPhuc5903++) {
                resultHoangPhuc5903[iHoangPhuc5903][jHoangPhuc5903] = matrix1HoangPhuc5903[iHoangPhuc5903][jHoangPhuc5903] + matrix2HoangPhuc5903[iHoangPhuc5903][jHoangPhuc5903];
            }
        }

        // Display the result
        System.out.println("HoangPhuc5903. Resultant Matrix after Addition:");
        for (int iHoangPhuc5903 = 0; iHoangPhuc5903 < rowsHoangPhuc5903; iHoangPhuc5903++) {
            for (int jHoangPhuc5903 = 0; jHoangPhuc5903 < colsHoangPhuc5903; jHoangPhuc5903++) {
                System.out.print(resultHoangPhuc5903[iHoangPhuc5903][jHoangPhuc5903] + " ");
            }
            System.out.println();
        }

        scannerHoangPhuc5903.close();
    }
}