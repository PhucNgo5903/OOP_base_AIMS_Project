import java.util.Scanner;

public class Equation3types {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ngo Hoang Phuc - 5903.Choose an equation type to solve:");
        System.out.println("Ngo Hoang Phuc - 5903.1. First-degree equation (ax + b = 0)");
        System.out.println("Ngo Hoang Phuc - 5903.2. System of two first-degree equations (a11*x1 + a12*x2 = b1, a21*x1 + a22*x2 = b2)");
        System.out.println("Ngo Hoang Phuc - 5903.3. Second-degree equation (ax^2 + bx + c = 0)");

        int choiceHoangPhuc5903 = scanner.nextInt();

        switch (choiceHoangPhuc5903) {
            case 1:
                solveFirstDegreeEquationHoangPhuc5903(scanner);
                break;
            case 2:
                solveSystemOfFirstDegreeEquationsHoangPhuc5903(scanner);
                break;
            case 3:
                solveSecondDegreeEquationHoangPhuc5903(scanner);
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }

    // Solves the first-degree equation ax + b = 0
    private static void solveFirstDegreeEquationHoangPhuc5903(Scanner scanner) {
        System.out.println("Ngo Hoang Phuc - 5903.Enter the coefficients a and b for the equation ax + b = 0:");
        double aHoangPhuc5903 = scanner.nextDouble();
        double bHoangPhuc5903 = scanner.nextDouble();

        if (aHoangPhuc5903 == 0) {
            if (bHoangPhuc5903 == 0) {
                System.out.println("Ngo Hoang Phuc - 5903.The equation has infinitely many solutions.");
            } else {
                System.out.println("Ngo Hoang Phuc - 5903.The equation has no solution.");
            }
        } else {
            double xHoangPhuc5903 = -bHoangPhuc5903 / aHoangPhuc5903;
            System.out.println("Ngo Hoang Phuc - 5903.The solution is x = " + xHoangPhuc5903);
        }
    }

    // Solves the system of two first-degree equations
    private static void solveSystemOfFirstDegreeEquationsHoangPhuc5903(Scanner scanner) {
        System.out.println("Ngo Hoang Phuc - 5903.Enter the coefficients a11, a12, b1, a21, a22, b2 for the system of equations:");
        // Coefficients of the system: a11*x1 + a12*x2 = b1, a21*x1 + a22*x2 = b2
        double a11HoangPhuc5903 = scanner.nextDouble();
        double a12HoangPhuc5903 = scanner.nextDouble();
        double b1HoangPhuc5903 = scanner.nextDouble();
        double a21HoangPhuc5903 = scanner.nextDouble();
        double a22HoangPhuc5903 = scanner.nextDouble();
        double b2HoangPhuc5903 = scanner.nextDouble();

        // Determinants
        double DHoangPhuc5903 = a11HoangPhuc5903 * a22HoangPhuc5903 - a21HoangPhuc5903 * a12HoangPhuc5903;
        double D1HoangPhuc5903 = b1HoangPhuc5903 * a22HoangPhuc5903 - b2HoangPhuc5903 * a12HoangPhuc5903;
        double D2HoangPhuc5903 = a11HoangPhuc5903 * b2HoangPhuc5903 - a21HoangPhuc5903 * b1HoangPhuc5903;

        if (DHoangPhuc5903 == 0) {
            if (D1HoangPhuc5903 == 0 && D2HoangPhuc5903 == 0) {
                System.out.println("Ngo Hoang Phuc - 5903.The system has infinitely many solutions.");
            } else {
                System.out.println("Ngo Hoang Phuc - 5903.The system has no solution.");
            }
        } else {
            double x1HoangPhuc5903 = D1HoangPhuc5903 / DHoangPhuc5903;
            double x2HoangPhuc5903 = D2HoangPhuc5903 / DHoangPhuc5903;
            System.out.println("Ngo Hoang Phuc - 5903.The solution is x1 = " + x1HoangPhuc5903 + ", x2 = " + x2HoangPhuc5903);
        }
    }

    // Solves the second-degree equation ax^2 + bx + c = 0
    private static void solveSecondDegreeEquationHoangPhuc5903(Scanner scanner) {
        System.out.println("Ngo Hoang Phuc - 5903.Enter the coefficients a, b, and c for the equation ax^2 + bx + c = 0:");
        double aHoangPhuc5903 = scanner.nextDouble();
        double bHoangPhuc5903 = scanner.nextDouble();
        double cHoangPhuc5903 = scanner.nextDouble();

        if (aHoangPhuc5903 == 0) {
            System.out.println("Ngo Hoang Phuc - 5903.This is not a second-degree equation. It becomes a first-degree equation.");
            solveFirstDegreeEquationHoangPhuc5903(scanner);
            return;
        }

        // Calculate the discriminant
        double discriminantHoangPhuc5903 = bHoangPhuc5903 * bHoangPhuc5903 - 4 * aHoangPhuc5903 * cHoangPhuc5903;

        if (discriminantHoangPhuc5903 > 0) {
            double root1HoangPhuc5903 = (-bHoangPhuc5903 + Math.sqrt(discriminantHoangPhuc5903)) / (2 * aHoangPhuc5903);
            double root2HoangPhuc5903 = (-bHoangPhuc5903 - Math.sqrt(discriminantHoangPhuc5903)) / (2 * aHoangPhuc5903);
            System.out.println("Ngo Hoang Phuc - 5903.The equation has two distinct real roots: x1 = " + root1HoangPhuc5903 + ", x2 = " + root2HoangPhuc5903);
        } else if (discriminantHoangPhuc5903 == 0) {
            double rootHoangPhuc5903 = -bHoangPhuc5903 / (2 * aHoangPhuc5903);
            System.out.println("Ngo Hoang Phuc - 5903.The equation has one double root: x = " + rootHoangPhuc5903);
        } else {
            System.out.println("Ngo Hoang Phuc - 5903.The equation has no real roots.");
        }
    }
}
