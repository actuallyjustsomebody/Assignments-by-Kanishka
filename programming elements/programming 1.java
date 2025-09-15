// Write a program to find the age of Harry if the birth year is 2000. Assume the Current Year is 2024
// public class programming {
//     public static void main(String[] args) {
        
//         int birthYear = 2000;
//         int currentYear = 2024;

        
//         int age = currentYear - birthYear;

        
//         System.out.println("Harry's age in 2024 is " + age);
//     }
// }



// Sam’s mark in Maths is 94, Physics is 95 and Chemistry is 96 out of 100. Find the average percent mark in PCM
// public class programming {
//     public static void main(String[] args) {
        
//         int maths = 94;
//         int physics = 95;
//         int chemistry = 96;

        
//         int totalSubjects = 3;

        
//         double average = (maths + physics + chemistry) / (double) totalSubjects;

        
//         System.out.println("Sam’s average mark in PCM is " + average + "%");
//     }
// }



// Create a program to convert the distance of 10.8 kilometers to miles.

// public class programming {
//     public static void main(String[] args) {
        
//         double kilometers = 10.8;

        
//         double conversionFactor = 1.6;

      
//         double miles = kilometers * conversionFactor;

       
//         System.out.println("The distance " + kilometers + " km in miles is " + miles);
//     }
// }


// Create a program to calculate the profit and loss in number and percentage based on the cost price of INR 129 and the selling price of INR 191. 
// public class programming {
//     public static void main(String[] args) {
        
//         int costPrice = 129;
//         int sellingPrice = 191;

      
//         int profit = sellingPrice - costPrice;
//         double profitPercent = (profit * 100.0) / costPrice;

        
//         System.out.println(
//             "The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\n" +
//             "The Profit is INR " + profit + " and the Profit Percentage is " + profitPercent + "%"
//         );
//     }
// }



// Suppose you have to divide 14 pens among 3 students equally. Write a program to find how many pens each student will get if the pens must be divided equally. Also, find the remaining non-distributed pens.
// public class programming {
//     public static void main(String[] args) {
        
//         int totalPens = 14;
//         int totalStudents = 3;

//         int pensPerStudent = totalPens / totalStudents;
//         int remainingPens = totalPens % totalStudents;

    
//         System.out.println("The Pen Per Student is " + pensPerStudent +  " and the remaining pen not distributed is " + remainingPens);
//     }
// }


// The University is charging the student a fee of INR 125000 for the course. The University is willing to offer a discount of 10%. Write a program to find the discounted amount and discounted price the student will pay for the course.

// public class programming{
//     public static void main(String[] args) {
        
//         int fee = 125000;

        
//         int discountPercent = 10;

        
//         int discount = (fee * discountPercent) / 100;

        
//         int finalFee = fee - discount;

        
//         System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
//     }
// }



// Write a Program to compute the volume of Earth in km^3 and miles^3
// public class programming {
//     public static void main(String[] args) {
        
//         double radiusKm = 6378.0;

       
//         double kmToMiles = 0.621371;

        
//         double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);

        
//         double radiusMiles = radiusKm * kmToMiles;
//         double volumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);

       
//         System.out.printf("The volume of Earth in cubic kilometers is %.2f km³%n", volumeKm3);
//         System.out.printf("The volume of Earth in cubic miles is %.2f mi³%n", volumeMiles3);
//     }
// }



// Create a program to convert distance in kilometers to miles.
// import java.util.Scanner;

// public class programming {
//     public static void main(String[] args) {
        
//         Scanner input = new Scanner(System.in);

        
//         double km;

        
//         System.out.print("Enter distance in kilometers: ");
//         km = input.nextDouble(); 

        
//         double miles = km / 1.6;

        
//         System.out.printf("The total miles is %.2f mile for the given %.2f km%n", miles, km);
//     }
// }


// Write a new program similar to the program # 6 but take user input for Student Fee and University Discount
// import java.util.Scanner;

// public class programming {
//     public static void main(String[] args) {
        
//         Scanner input = new Scanner(System.in);

        
//         double fee, discountPercent, discountAmount, finalFee;

        
//         System.out.print("Enter the original student fee (INR): ");
//         fee = input.nextDouble();

        
//         System.out.print("Enter the university discount percentage: ");
//         discountPercent = input.nextDouble();

        
//         discountAmount = (discountPercent / 100) * fee;

        
//         finalFee = fee - discountAmount;

        
//         System.out.printf("The discount amount is INR %.2f and final discounted fee is INR %.2f%n", discountAmount, finalFee);

        
//         input.close();
//     }
// }



// Write a program that takes your height in centimeters and converts it into feet and inches
// import java.util.Scanner;

// public class programming{
//     public static void main(String[] args) {
        
//         Scanner input = new Scanner(System.in);

        
//         double heightCm;

   
//         System.out.print("Enter your height in centimeters: ");
//         heightCm = input.nextDouble();

      
//         double totalInches = heightCm / 2.54;

        
//         int feet = (int)(totalInches / 12); 
//         double inches = totalInches % 12;   
        
//         System.out.printf("Your Height in cm is %.2f cm while in feet is %d ft and inches is %.2f in%n", heightCm, feet, inches);

        
//         input.close();
//     }
// }



