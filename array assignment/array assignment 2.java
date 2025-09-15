//level 2 ka question 3
//Create a program to store the digits of the number in an array and find the largest and second largest element of the array.

// import java.util.Scanner;

// public class DigitAnalyzer {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Step 1: Take user input
//         System.out.print("Enter a number (up to 10 digits): ");
//         int number = sc.nextInt();

//         // Step 2: Define array and variables
//         int maxDigit = 10;
//         int[] digits = new int[maxDigit];
//         int index = 0;

//         // Step 3: Extract digits and store in array
//         while (number != 0 && index < maxDigit) {
//             int digit = number % 10;
//             digits[index] = digit;
//             number /= 10;
//             index++;
//         }

//         // Step 4: Find largest and second largest
//         int largest = -1;
//         int secondLargest = -1;

//         for (int i = 0; i < index; i++) {
//             if (digits[i] > largest) {
//                 secondLargest = largest;
//                 largest = digits[i];
//             } else if (digits[i] > secondLargest && digits[i] != largest) {
//                 secondLargest = digits[i];
//             }
//         }

//         // Step 5: Display results
//         System.out.println("\nLargest digit: " + largest);
//         if (secondLargest != -1) {
//             System.out.println("Second largest digit: " + secondLargest);
//         } else {
//             System.out.println("Second largest digit not found (all digits may be same).");
//         }
//     }
// }







/*Create a program to take a number as input and reverse the number. To do this, store the digits of the number in an array and display the array in reverse order
Hint => 
Take user input for a number. 
Find the count of digits in the number. 
Find the digits in the number and save them in an array
Create an array to store the elements of the digits array in reverse order
Finally, display the elements of the array in reverse order */

//  import java.util.*;
// public class ar {

//     public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     int number=sc.nextInt();
//     //find the count of digits in the number
//     int count =0;
//     int temp=number;
//     while(count!=0){
//         count++;
//         temp /=10;
//     }
//     //find the digits in the number and save them in an array
//     int[] digits=new int[count];
//     temp=number;
//     for(int i=count-1;i>=0;i--){
//         digits[i]=temp%10;
//         temp /=10;
//     }
//     //create an array to store the elements of the digits array in reverse order
//     int[] reverse=new int[count];
//     for(int i=0;i<count;i++){
//         reverse[i]=digits[count-1-i];
//         }
//     //display the result
//     for(int digit:reverse){
//         System.out.println(digit);
//     }


    
//     }
// }




