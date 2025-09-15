import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter coefficient a: ");
        double a = input.nextDouble();

        System.out.print("Enter coefficient b: ");
        double b = input.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = input.nextDouble();

        findRoots(a, b, c);

        input.close();
    }

    public static void findRoots(double a, double b, double c) {
        if (a == 0) {
            System.out.println("Invalid: 'a' cannot be zero for a quadratic equation.");
            return;
        }

        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Roots are real and distinct:");
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);
        } else if (delta == 0) {
            double root = -b / (2 * a);
            System.out.println("Root is real and equal:");
            System.out.println("Root = " + root);
        } else {
            System.out.println("No real roots exist.");
        }
    }
}