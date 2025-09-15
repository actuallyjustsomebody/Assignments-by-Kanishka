//Write a program to compare two strings using the charAt() method and check the result with the built-in String equals() method




// import java.util.Scanner;

// public class string{

    
//     public static boolean compareUsingCharAt(String str1, String str2) {
        
//         if (str1.length() != str2.length()) {
//             return false;
//         }

        
//         for (int i = 0; i < str1.length(); i++) {
//             if (str1.charAt(i) != str2.charAt(i)) {
//                 return false;
//             }
//         }

//         return true;
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

        
//         System.out.print("Enter first string: ");
//         String string1 = scanner.next();

//         System.out.print("Enter second string: ");
//         String string2 = scanner.next();

//       
//         boolean charAtResult = compareUsingCharAt(string1, string2);

//         
//         boolean equalsResult = string1.equals(string2);

//        
//         System.out.println("\nComparison using charAt(): " + charAtResult);
//         System.out.println("Comparison using equals(): " + equalsResult);

//         
//         if (charAtResult == equalsResult) {
//             System.out.println(" Both methods returned the same result.");
//         } else {
//             System.out.println(" Methods returned different results.");
//         }

//         scanner.close();
//     }
// }





//Write a program to create a substring from a String using the charAt() method. Also, use the String built-in method substring() to find the substring of the text. Finally Compare the the two strings and display the results

// import java.util.Scanner;

// public class string{

//     
//     public static String manualSubstring(String text, int start, int end) {
//         String result = "";
//         for (int i = start; i < end; i++) {
//             result += text.charAt(i);
//         }
//         return result;
//     }

//     
//     public static boolean compareUsingCharAt(String str1, String str2) {
//         if (str1.length() != str2.length()) {
//             return false;
//         }

//         for (int i = 0; i < str1.length(); i++) {
//             if (str1.charAt(i) != str2.charAt(i)) {
//                 return false;
//             }
//         }

//         return true;
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         
//         System.out.print("Enter the original string: ");
//         String original = scanner.next();

//         System.out.print("Enter start index: ");
//         int start = scanner.nextInt();

//         System.out.print("Enter end index: ");
//         int end = scanner.nextInt();

//         
//         String manualSub = manualSubstring(original, start, end);

//         
//         String builtInSub = original.substring(start, end);

//         
//         boolean comparisonResult = compareUsingCharAt(manualSub, builtInSub);

//         // Display results
//         System.out.println("\nManual substring: " + manualSub);
//         System.out.println("Built-in substring: " + builtInSub);
//         System.out.println("Are both substrings equal? " + comparisonResult);

//         scanner.close();
//     }
// }




//Write a program to return all the characters in a string using the user-defined method,  compare the result with the String built-in toCharArray() method, and display the result

// import java.util.Scanner;

// public class string{
//     public static char[] getCharsManually(String text) {
//         char[] result = new char[text.length()];
//         for (int i = 0; i < text.length(); i++) {
//             result[i] = text.charAt(i);
//         }
//         return result;
//     }

    
//     public static boolean compareCharArrays(char[] arr1, char[] arr2) {
//         if (arr1.length != arr2.length) {
//             return false;
//         }

//         for (int i = 0; i < arr1.length; i++) {
//             if (arr1[i] != arr2[i]) {
//                 return false;
//             }
//         }

//         return true;
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

    
//         System.out.print("Enter a string: ");
//         String input = scanner.next();
//         char[] manualChars = getCharsManually(input);

        
//         char[] builtInChars = input.toCharArray();

        
//         boolean areEqual = compareCharArrays(manualChars, builtInChars);

        
//         System.out.println("\nCharacters using manual method:");
//         for (char c : manualChars) {
//             System.out.print(c + " ");
//         }

//         System.out.println("\n\nCharacters using toCharArray():");
//         for (char c : builtInChars) {
//             System.out.print(c + " ");
//         }

//         System.out.println("\n\nAre both character arrays equal? " + areEqual);

//         scanner.close();
//     }




//Write a program to demonstrate nullpointer exception 
// public class string {

    
//     public static void generateException() {
//         String text = null;
        
//         System.out.println("Length of text: " + text.length());
//     }

   
//     public static void handleException() {
//         String text = null;
//         try {
            
//             System.out.println("Length of text: " + text.length());
//         } catch (NullPointerException e) {
//             System.out.println("Caught NullPointerException: Cannot call methods on a null object.");
//         }
//     }

//     public static void main(String[] args) {
//         System.out.println("=== Generating Exception ===");
//         try {
//             generateException(); 
//         } catch (NullPointerException e) {
//             System.out.println("Exception caught in main: " + e.getMessage());
//         }

//         System.out.println("\n=== Handling Exception Gracefully ===");
//         handleException(); 
//     }
// }


//Write a program to demonstrate StringIndexOutOfBoundsException
// import java.util.Scanner;

// public class string{

//     
//     public static void generateException(String text) {
//         // Accessing index beyond the string length
//         System.out.println("Character at index " + text.length() + ": " + text.charAt(text.length()));
//     }

//    
//     public static void handleException(String text) {
//         try {
//            
//             System.out.println("Character at index " + text.length() + ": " + text.charAt(text.length()));
//         } catch (StringIndexOutOfBoundsException e) {
//             System.out.println("Caught StringIndexOutOfBoundsException: Index is out of bounds for the string.");
//         }
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//        
//         System.out.print("Enter a string: ");
//         String input = scanner.next();

//         System.out.println("\n=== Generating Exception ===");
//         try {
//             generateException(input); 
//         } catch (StringIndexOutOfBoundsException e) {
//             System.out.println("Exception caught in main: " + e.getMessage());
//         }

//         System.out.println("\n=== Handling Exception Gracefully ===");
//         handleException(input); // This handles the exception internally

//         scanner.close();
//     }
// }


//Write a program to demonstrate NumberFormatException
// import java.util.Scanner;

// public class string{

//     
//     public static void generateException(String text) {
//         // This will throw NumberFormatException if text is not a valid integer
//         int number = Integer.parseInt(text);
//         System.out.println("Parsed number: " + number);
//     }

//     
//     public static void handleException(String text) {
//         try {
//             int number = Integer.parseInt(text);
//             System.out.println("Parsed number: " + number);
//         } catch (NumberFormatException e) {
//             System.out.println("Caught NumberFormatException: '" + text + "' is not a valid integer.");
//         } catch (RuntimeException e) {
//             System.out.println("Caught RuntimeException: " + e.getMessage());
//         }
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//        
//         System.out.print("Enter a number (or text): ");
//         String input = scanner.next();

//         System.out.println("\n=== Generating Exception ===");
//         try {
//             generateException(input); 
//         } catch (NumberFormatException e) {
//             System.out.println("Exception caught in main: " + e.getMessage());
//         }

//         System.out.println("\n=== Handling Exception Gracefully ===");
//         handleException(input); 

//         scanner.close();
//     }
// }















    
    

