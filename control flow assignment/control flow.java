/*Write a program to check if a number is divisible by 5
I/P => number
O/P => Is the number ___ divisible by 5? */
// import java.util.*;
// public class control {
    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

        
//         System.out.print("Enter a number: ");
//         int number = sc.nextInt();

        
//         boolean isDivisible = (number % 5 == 0);

        
//         System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);
//     }
// }


// Write a program to check if the first is the smallest of the 3 numbers.
// I/P => number1, number2, number3
// O/P => Is the first number the smallest? ____ 
// import java.util.*;

// public class control {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

        
//         System.out.print("Enter first number: ");
//         int number1 = sc.nextInt();

//         System.out.print("Enter second number: ");
//         int number2 = sc.nextInt();

//         System.out.print("Enter third number: ");
//         int number3 = sc.nextInt();

    
//         boolean isSmallest = (number1 < number2) && (number1 < number3);

        
//         System.out.println("Is the first number the smallest? " + isSmallest);
//     }
// }



// Write a program to check if the first, second, or third number is the largest of the three.
// I/P => number1, number2, number3
// O/P => 
// Is the first number the largest? ____
// Is the second number the largest? ___
// Is the third number the largest? ___
// import java.util.*;

// public class control {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

        
//         System.out.print("Enter first number: ");
//         int number1 = sc.nextInt();

//         System.out.print("Enter second number: ");
//         int number2 = sc.nextInt();

//         System.out.print("Enter third number: ");
//         int number3 = sc.nextInt();

        
//         boolean isFirstLargest = (number1 > number2) && (number1 > number3);
//         boolean isSecondLargest = (number2 > number1) && (number2 > number3);
//         boolean isThirdLargest = (number3 > number1) && (number3 > number2);

        
//         System.out.println("Is the first number the largest? " + isFirstLargest);
//         System.out.println("Is the second number the largest? " + isSecondLargest);
//         System.out.println("Is the third number the largest? " + isThirdLargest);
//     }
// }

// Write a program to check for the natural number and write the sum of n natural numbers 
// Hint => 
// A Natural Number is a positive integer (1,2,3, etc) sometimes with the inclusion of 0
// A sum of n natural numbers is n * (n+1) / 2 
// I/P => number
// O/P => If the number is a positive integer then the output is
// The sum of ___ natural numbers is ___
// Otherwise 
// The number ___ is not a natural number
// import java.util.*;

// public class control {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);


//         System.out.print("Enter a number: ");
//         int number = sc.nextInt();

        
//         if (number >= 0) {
//             int sum = number * (number + 1) / 2;
//             System.out.println("The sum of " + number + " natural numbers is " + sum);
//         } else {
//             System.out.println("The number " + number + " is not a natural number");
//         }
//     }
// }






// Write a program to check whether a person can vote, depending on whether his/her age is greater than or equal to 18.
// Hint => 
// Get integer input from the user and store it in the age variable.
// If the person is 18 or older, print "The person can vote." Otherwise, print "The person cannot vote." 
// I/P => age
// O/P => If the person's age is greater or equal to 18 then the output is 
// The person's age is ___ and can vote.
// Otherwise 
// The person's age is ___ and cannot vote.
// import java.util.*;

// public class control {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

        
//         System.out.print("Enter the person's age: ");
//         int age = sc.nextInt();

        
//         if (age >= 18) {
//             System.out.println("The person's age is " + age + " and can vote.");
//         } else {
//             System.out.println("The person's age is " + age + " and cannot vote.");
//         }
//     }
// }



// Write a program to check whether a number is positive, negative, or zero.
// Hint => 
// Get integer input from the user and store it in the number variable.
// If the number is positive, print positive.
// If the number is negative, print negative.
// If the number is zero, print zero. 
// import java.util.*;

// public class control {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

        
//         System.out.print("Enter a number: ");
//         int number = sc.nextInt();

        
//         if (number > 0) {
//             System.out.println("The number is positive.");
//         } else if (number < 0) {
//             System.out.println("The number is negative.");
//         } else {
//             System.out.println("The number is zero.");
//         }
//     }
// }



// Write a program SpringSeason that takes two int values month and day from the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”. 
// Hint => 
// Spring Season is from March 20 to June 20
// import java.util.*;

// public class control{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

        
//         System.out.print("Enter month (1 to 12): ");
//         int month = sc.nextInt();

//         System.out.print("Enter day (1 to 31): ");
//         int day = sc.nextInt();


//         boolean isSpring = 
//             (month == 3 && day >= 20) || 
//             (month == 4) || 
//             (month == 5) || 
//             (month == 6 && day <= 20);

//         // Output the result
//         if (isSpring) {
//             System.out.println("It's a Spring Season");
//         } else {
//             System.out.println("Not a Spring Season");
//         }
//     }
// }


// Write a program to count down the number from the user input value to 1 using a while loop for a rocket launch
// Hint => 
// Create a variable counter to take user inputted value for the countdown.
// Use the while loop to check if the counter is 1
// Inside a while loop, print the value of the counter and decrement the counter.
// Rewrite program 8 to do the countdown using the for-loop
// import java.util.*;

// public class control {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

        
//         System.out.print("Enter countdown start value: ");
//         int counter = sc.nextInt();

        
//         while (counter >= 1) {
//             System.out.println(counter);
//             counter--; 
//         }

//         System.out.println(" Launch!");
//     }
// }



// Write a program to find the sum of numbers until the user enters 0
// Hint => 
// Create a variable total of type double initialize to 0.0. Also, create a variable to store the double value the user enters
// Use the while loop to check if the user entered is 0
// If the user entered value is not 0 then inside the while block add user entered value to the total and ask the user to input again
// The loop will continue till the user enters zero and outside the loop display the total value
// import java.util.*;

// public class control {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         double total = 0.0; 
//         double number;      

        
//         System.out.print("Enter a number (0 to stop): ");
//         number = sc.nextDouble();

//         while (number != 0) {
//             total += number; 
//             System.out.print("Enter another number (0 to stop): ");
//             number = sc.nextDouble(); 
//         }

        
//         System.out.println("The total sum is: " + total);
//     }
// }


// Rewrite the program 10 to find the sum until the user enters 0 or a negative number using while loop and break statement
// Hint => 
// Use infinite while loop as in while (true)
// Take the user entry and check if the user entered 0 or a negative number to break the loop using break;
// import java.util.*;

// public class control {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         double total = 0.0; 

//         while (true) {
        
//             System.out.print("Enter a number (0 or negative to stop): ");
//             double number = sc.nextDouble();

        
//             if (number <= 0) {
//                 break;
//             }

            
//             total += number;
//         }

        
//         System.out.println("The total sum is: " + total);
//     }
// }






// Write a program to find the sum of n natural numbers using while loop compare the result with the formulae n*(n+1)/2 and show the result from both computations was correct. 
// Hint => 
// Take the user input number and check whether it's a Natural number
// If it's a natural number Compute using formulae as well as compute using while loop
// Compare the two results and print the result
// import java.util.*;;

// public class control{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

    
//         System.out.print("Enter a natural number: ");
//         int n = sc.nextInt();

        
//         if (n >= 0) {
//             int formulaSum = n * (n + 1) / 2;

            
//             int loopSum = 0;
//             int i = 1;
//             while (i <= n) {
//                 loopSum += i;
//                 i++;
//             }

    
//             System.out.println("Sum using formula: " + formulaSum);
//             System.out.println("Sum using while loop: " + loopSum);

            
//             if (formulaSum == loopSum) {
//                 System.out.println(" Both computations are correct and match.");
//             } else {
//                 System.out.println(" There is a mismatch in the results.");
//             }
//         } else {
//             System.out.println("The number " + n + " is not a natural number.");
//         }
//     }
// }



// Rewrite the program number 12 with the for loop instead of a while loop to find the sum of n Natural Numbers. 
// Hint => 
// Take the user input number and check whether it's a Natural number
// If it's a natural number Compute using formulae as well as compute using for loop
// Compare the two results and print the result
// import java.util.*;

// public class control{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a natural number: ");
//         int n = sc.nextInt();

        
//         if (n >= 0) {
        
//             int formulaSum = n * (n + 1) / 2;

        
//             int loopSum = 0;
//             for (int i = 1; i <= n; i++) {
//                 loopSum += i;
//             }

        
//             System.out.println("Sum using formula: " + formulaSum);
//             System.out.println("Sum using for loop: " + loopSum);

            
//             if (formulaSum == loopSum) {
//                 System.out.println(" Both computations are correct and match.");
//             } else {
//                 System.out.println(" There is a mismatch in the results.");
//             }
//         } else {
//             System.out.println("The number " + n + " is not a natural number.");
//         }
//     }
// }




// Write a Program to find the factorial of an integer entered by the user.
// Hint => 
// For example, the factorial of 4 is 1 * 2 * 3 * 4 which is 24.
// Take an integer input from the user and assign it to the variable. Check the user has entered a positive integer.
// Using a while loop, compute the factorial.
// Print the factorial at the end.
// import java.util.*;

// public class control {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);


//         System.out.print("Enter a positive integer: ");
//         int number = sc.nextInt();

        
//         if (number >= 0) {
//             long factorial = 1; 
//             int i = 1;

    
//             while (i <= number) {
//                 factorial *= i;
//                 i++;
//             }

        
//             System.out.println("The factorial of " + number + " is: " + factorial);
//         } else {
//             System.out.println(" Please enter a non-negative integer.");
//         }
//     }
// }



// Rewrite program 14 using for loop
// Hint => 
// Take the integer input, check for natural number and determine the factorial using for loop and finally print the result.
// import java.util.Scanner;

// public class FactorialUsingForLoop {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

    
//         System.out.print("Enter a natural number: ");
//         int number = sc.nextInt();

    
//         if (number >= 0) {
//             long factorial = 1; 

            
//             for (int i = 1; i <= number; i++) {
//                 factorial *= i;
//             }

        
//             System.out.println("The factorial of " + number + " is: " + factorial);
//         } else {
//             System.out.println(" The number " + number + " is not a natural number.");
//         }
//     }
// } 












 
    

