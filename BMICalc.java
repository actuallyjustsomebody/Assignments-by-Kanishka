import java.util.Scanner;

public class BMICalc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] personData = new double[10][3];
        String[] bmiStatus = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            System.out.print("Enter weight in kg: ");
            personData[i][0] = scanner.nextDouble();
            System.out.print("Enter height in cm: ");
            personData[i][1] = scanner.nextDouble();
        }

        calculateBMI(personData);
        determineBMIStatus(personData, bmiStatus);

        System.out.println("\n--- BMI Report ---");
        System.out.printf("%-10s %-10s %-10s %-10s %-15s\n", "Person", "Weight", "Height", "BMI", "Status");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10d %-10.2f %-10.2f %-10.2f %-15s\n", (i + 1), personData[i][0], personData[i][1], personData[i][2], bmiStatus[i]);
        }

        scanner.close();
    }

    public static void calculateBMI(double[][] personData) {
        for (int i = 0; i < personData.length; i++) {
            double weight = personData[i][0];
            double heightCm = personData[i][1];
            double heightM = heightCm / 100.0;
            double bmi = weight / (heightM * heightM);
            personData[i][2] = bmi;
        }
    }

    public static void determineBMIStatus(double[][] personData, String[] bmiStatus) {
        for (int i = 0; i < personData.length; i++) {
            double bmi = personData[i][2];
            if (bmi <= 18.4) {
                bmiStatus[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                bmiStatus[i] = "Normal";
            } else if (bmi >= 25.0 && bmi <= 39.9) {
                bmiStatus[i] = "Overweight";
            } else {
                bmiStatus[i] = "Obese";
            }
        }
    }
}