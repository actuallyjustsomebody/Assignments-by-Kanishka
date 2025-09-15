import java.util.Scanner;

public class FactorCalc {

    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];

        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }
        return factors;
    }


    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }


    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    public static double sumOfSquareOfFactors(int[] factors) {
        double sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2);
        }
        return sumOfSquares;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to find its factors: ");
        int number = scanner.nextInt();


        int[] factors = findFactors(number);


        System.out.print("Factors of " + number + " are: ");
        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i]);
            if (i < factors.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();


        System.out.println("factors sum: " + sumOfFactors(factors));
        System.out.println("factors products: " + productOfFactors(factors));
        System.out.println("sum of squares of factors: " + sumOfSquareOfFactors(factors));

        scanner.close();
    }

}
