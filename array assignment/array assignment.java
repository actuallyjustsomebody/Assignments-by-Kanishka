//Write a program to take user input for the age of all 10 students in a class and check whether the student can vote depending on his/her age is greater or equal to 18.

// import java.util.*;
// public class arr {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
        
//         int numbers[]=new int[10];
//        for(int i=0;i<numbers.length;i++){
//             numbers[i]=sc.nextInt();
//        }

        
//         for(int i=0;i<numbers.length;i++){
//             int age=numbers[i];
//             if(age<0){
//                 System.out.println("Student"+(i+1)+"Invalid age");

//             }
//             else if(age>=18){
//                 System.out.println("Student"+(i+1)+"Student can vote");
//             }
//             else{
//                 System.out.println("Student"+(i+1)+"Student cannot vote");
//             }
//         }
//         sc.close();
     

//     }
    
// }




//Write a program to take user input for 5 numbers and check whether a number is positive,  negative, or zero. Further for positive numbers check if the number is even or odd. Finally compare the first and last elements of the array and display if they equal, greater or less
// import java.util.*;
// public class arr {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int numbers[]=new int[5];
//         for(int i=0;i<numbers.length;i++){
//             numbers[i]=sc.nextInt();

//         }
//         for(int i=0;i<numbers.length;i++){
//             int n=numbers[i];
//             if(n>0){
//                 if(n%2==0){
//                     System.out.println("it is positive and even");
//                 }
//                 else{
//                     System.out.println("it is positive and odd");
//                 }
                
//             }
//             else if(n<0){
//                 System.out.println("Negative");
//             }
//             else{
//                 System.out.println("zero");
//             }
//             int first=numbers[0];
//             int last=numbers[numbers.length-1];
//             if(first==last){
//                 System.out.println("Equal");
//             }
//             else if(first>last){
//                 System.out.println("it is greater than the last");
//             }
//             else{
//                 System.out.println("it is less than the last");
//             }
//         }

        
//     }
// }




//Create a program to print a multiplication table of a number
// import java.util.*;
// public class arr {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int number=sc.nextInt();
//         int table[]=new int[10];
//         for(int i=1;i<10;i++){
//             table[i-1]=number*i;
//         }
//         for(int i=1;i<10;i++){
//             System.out.println(number+"*"+i+"="+table[i-1]);
//         }
//     }
// }




//Write a program to store multiple values in an array up to a maximum of 10 or until the user enters a 0 or a negative number. Show all the numbers as well as the sum of all numbers 
// import java.util.*;
// public class arr {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         double numbers[]=new double[10];
//         double total=0.0;
//         int index=0;
//         while(true){
//             System.out.print(index+1);
//             double input=sc.nextDouble();
//             if(input<0){
//                 break;
//             }
//             if(index==10){
//                 break;
//             }
//             numbers[index]=input;
//             index++;
//         }
//         for(int i=0;i<index;i++){
//             System.out.println("Number"+(i+1)+" "+numbers[i]);
//             total += numbers[i];
//         }
//         System.out.println(total);
//         }

//     }


//Create a program to find the multiplication table of a number entered by the user from 6 to 9 and display the result

// import java.util.*;
// public class arr {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//             int number=sc.nextInt();
//             int table[]=new int[4];
//             for(int i=6;i<9;i++){
//                 table[i-6]=number*i;
//             }
//             for(int i=6;i<table.length;i++){
//                 int multiplier=i+6;
//                 System.out.println(number+"*"+multiplier+"="+table[i]);
//             }

        
//     }
// }

//Create a program to find the mean height of players present in a football team.
// import java.util.*;
// public class arr {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         double height[]=new double[11];
//         int number=sc.nextInt();
//          double sum=0;
//          for(int i=0;i<height.length;i++){
//             System.out.print("Player"+(i+1)+": ");
//             height[i]=sc.nextDouble();
//             sum+=height[i];

//          }
//          double mean=sum/height.length;
//          System.out.println(mean);


//     }
// }


//Create a program to save odd and even numbers into odd and even arrays between 1 to the number entered by the user. Finally, print the odd and even numbers array
// import java.util.*;
// public class arr {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int number=sc.nextInt();
        
//             if(number<0){
//                 System.out.print("error");
//                 return;
//             }
//             else{
//                 System.out.print("error");
//             }
//             int n=sc.nextInt();
//             if(n%2==0){
//                 System.out.print("even");
//             }
//             else{
//                 System.out.println("odd");
//             }
//         }
//     }
// }


//Create a program to find the factors of a number taken as user input, store the factors in an array, and display the factors
// import java.util.*;
// public class arr {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int number=sc.nextInt();
//         int maxfactor=10;
//         int factors[]=new int[maxfactor];
//         int index=0;
//         for(int i=1;i<number;i++){
//             if(number%i==0){
//                 if(index==maxfactor){
//                     maxfactor=maxfactor*2;
//                     int temp[]=new int[maxfactor];
//                     for(int j=0;j<factors.length;j++){
//                         temp[j]=factors[j];
//                     }
//                     factors=temp;
//                 }
//                 factors[index++]=i;
//             }
            
//         }
//         System.out.println("Factors of "+number+"are:");
//         for(int i=0;i<index;i++){
//             System.out.println(factors[i]+" ");
//         }
//     }
// }

//Working with Multi-Dimensional Arrays. Write a Java program to create a 2D Array and Copy the 2D Array into a single dimension array
// import java.util.*;
// public class arr {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int rows=sc.nextInt();
//         int columns=sc.nextInt();
//         //create 2d array matrix
//         int[][] matrix=new int[rows][columns];
//         for(int i=0;i<rows;i++){
//             for(int j=0;j<columns;j++){
//                 System.out.println("element["+i+"]["+j+"]:");
//                 matrix[i][j]=sc.nextInt();
//             }
//         }
//         //create 1d array
//         int[] arr=new int[rows*columns];
//         int index=0;
//         for(int i=0;i<rows;i++){
//             for(int j=0;j<columns;j++){
//                 arr[index]=matrix[i][j];
//                 index++;
//             }
//         }
//         //display the 1d array
//         for(int i=0;i<arr.length;i++){
//             System.out.println(arr[i]+" ");
//         }

//     }
// }


//Write a program FizzBuzz, take a number as user input and if it is a positive integer loop from 0 to the number and save the number, but for multiples of 3 save "Fizz" instead of the number, for multiples of 5 save "Buzz", and for multiples of both save "FizzBuzz". Finally, print the array results for each index position in the format Position 1 = 1, …, Position 3 = Fizz,...
// import java.util.Scanner;

// public class FizzBuzzArray {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Step 1: Take user input
//         System.out.print("Enter a positive number: ");
//         int num = sc.nextInt();

//         // Step 2: Validate input
//         if (num <= 0) {
//             System.out.println("Please enter a positive integer.");
//             return;
//         }

//         // Step 3: Create String array to store results
//         String[] result = new String[num + 1]; // +1 because we include 0

//         // Step 4: Loop from 0 to num and apply FizzBuzz logic
//         for (int i = 0; i <= num; i++) {
//             if (i % 3 == 0 && i % 5 == 0 && i != 0) {
//                 result[i] = "FizzBuzz";
//             } else if (i % 3 == 0 && i != 0) {
//                 result[i] = "Fizz";
//             } else if (i % 5 == 0 && i != 0) {
//                 result[i] = "Buzz";
//             } else {
//                 result[i] = String.valueOf(i);
//             }
//         }

//         // Step 5: Display results with position format
//         System.out.println("\nFizzBuzz Results:");
//         for (int i = 0; i <= num; i++) {
//             System.out.println("Position " + i + " = " + result[i]);
//         }

//         sc.close();
//     }
// }



//LEVEL 2 QUESTION 
//Create a program to find the bonus of 10 employees based on their years of service and the total bonus amount the company Zara has to pay, along with the old and new salary.
// import java.util.*;
// public class arr {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         //arrays to store data for 10 employees
//         double[] salary=new double[10];
//         double[] yearsOfService=new double[10];
//         double[] newSalary=new double[10];
//         double[] bonus=new double[10];
//         //variables to store totals
//         double totalBonus=0;
//         double totalOldSalary=0;
//         double totalNewSalary=0;
//         //taking loop input
//         for(int i=0;i<10;i++){
//             System.out.println("Emoloyee "+(i+1)+":");
//             //salary input
//             double sal=sc.nextDouble();
//             if(sal<=0){
//                 i--;
//                 continue;
//             }
//             double yrs=sc.nextDouble();
//             if(yrs<=0){
//               i--;
//             continue;  
//             }
//             salary[i]=sal;
//             yearsOfService[i]=yrs;
//             }
//             //calculation of bonus
//             for(int i=0;i<10;i++){
//                 double rate=(yearsOfService[i]>5)? 0.05 : 0.02; // 5% or 2%
//                 bonus[i]=salary[i]*rate;
//                 newSalary[i]=salary[i]+bonus[i];

//             totalBonus += bonus[i];
//             totalOldSalary += salary[i];
//             totalNewSalary += newSalary[i];
//         }
//         System.out.println(totalOldSalary);
//         System.out.println(totalBonus);
//         System.out.println(totalNewSalary);
//      } 

//         }


//Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights
// import java.util.*;
// public class arr {

//     public static void main(String[] args) {Create a program to store the digits of the number in an array and find the largest and second largest element of the array.


// Scanner sc=new Scanner(System.in);
//         String[] names={"Amar","Akbar","Anthony"};
//         int[] age=new int[3];
//         double[] height=new double[3];
//         for(int i=0;i<3;i++){
//             System.out.print("Enter age of "+names[i]+": ");
//              age[i] = sc.nextInt();
//             System.out.print("Enter height of " + names[i] + " (in cm): ");
//             height[i] = sc.nextDouble();

//         }
//         int youngestIndex = 0;
//         for (int i = 1; i < 3; i++) {
//             if (age[i] < age[youngestIndex]) {
//                 youngestIndex = i;
//             }
//         }
//         int tallestIndex = 0;
//         for (int i = 1; i < 3; i++) {
//             if (height[i] > height[tallestIndex]) {
//                 tallestIndex = i;
//             }
//         }
//         System.out.println("\nYoungest friend is: " + names[youngestIndex] + " (Age: " + age[youngestIndex] + ")");
//         System.out.println("Tallest friend is: " + names[tallestIndex] + " (Height: " + height[tallestIndex] + " cm)");
//     }
// }





