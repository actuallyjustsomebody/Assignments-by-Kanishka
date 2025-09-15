import java.util.Scanner;

public class NaturalNumSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        while (true) {
            System.out.print("Enter a natural number: ");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n > 0) {
                    break;
                } else {
                    System.out.println("Please enter a positive integer (natural number).");
                }
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next();
            }
        }


        long sumRecursive = sumUsingRecursion(n);


        long sumFormula = sumUsingFormula(n);


        System.out.println("\nSum using recursion: " + sumRecursive);
        System.out.println("Sum using formula: " + sumFormula);

        if (sumRecursive == sumFormula) {
            System.out.println("Both computations yield the same result. The result is correct.");
        } else {
            System.out.println("The results from both computations do not match.");
        }

        scanner.close();
    }


    public static long sumUsingRecursion(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + sumUsingRecursion(n - 1);
        }
    }


    public static long sumUsingFormula(int n) {
        return (long) n * (n + 1) / 2;
    }
}