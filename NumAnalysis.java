import java.util.Scanner;

public class NumAnalysis {

    public static boolean isPositive(int number) {
        return number >= 0;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 == number2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int number : numbers) {
            if (isPositive(number)) {
                if (isEven(number)) {
                    System.out.println(number + " is positive and even");
                } else {
                    System.out.println(number + " is positive and odd");
                }
            } else {
                System.out.println(number + " is negative");
            }
        }

        int result = compare(numbers[0], numbers[4]);
        if (result == 0) {
            System.out.println("First and last numbers are equal");
        } else if (result == 1) {
            System.out.println("First number is greater than the last number");
        } else {
            System.out.println("First number is less than the last number");
        }
    }
}