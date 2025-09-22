import java.util.Scanner;

public class problems {

    public static void main(String[] args) {
        // 1. Welcome to Bridgelabz
        System.out.println("Welcome to Bridgelabz!");

        // 2. Add Two Numbers
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);

        // 3. Celsius to Fahrenheit Conversion
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        // 4. Area of a Circle
        System.out.print("Enter radius of the circle: ");
        double radiusCircle = scanner.nextDouble();
        double areaCircle = Math.PI * Math.pow(radiusCircle, 2);
        System.out.println("Area of the circle: " + areaCircle);

        // 5. Volume of a Cylinder
        System.out.print("Enter radius of the cylinder: ");
        double radiusCylinder = scanner.nextDouble();
        System.out.print("Enter height of the cylinder: ");
        double heightCylinder = scanner.nextDouble();
        double volumeCylinder = Math.PI * Math.pow(radiusCylinder, 2) * heightCylinder;
        System.out.println("Volume of the cylinder: " + volumeCylinder);

        scanner.close();
    }
}