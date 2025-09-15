// public class constructor {
//     class Product {
//     // Instance variables
//     private String productName;
//     private double price;

//     // Class variable shared among all products
//     static int totalProducts = 0;

//     // Constructor using 'this' to initialize instance variables
//     public Product(String productName, double price) {
//         this.productName = productName;
//         this.price = price;
//         totalProducts++; // Increment total product count
//     }

//     // Instance method to display product details
//     public void displayProductDetails() {
//         System.out.println("Product Name: " + productName);
//         System.out.println("Price: ₹" + price);
//     }

//     // Class method to display total number of products
//     public static void displayTotalProducts() {
//         System.out.println("Total Products Created: " + totalProducts);
//     }
// }

// // Main class to test the Product system
// public class constructor {
//     public static void main(String[] args) {
//         Product p1 = new Product("Smartphone", 25000.0);
//         Product p2 = new Product("Bluetooth Speaker", 3500.0);

//         p1.displayProductDetails();
//         p2.displayProductDetails();

//         // Class method call
//         Product.displayTotalProducts();
//     }
// }
    
// }


//online course management
// class Course {
//     // Instance variables
//     private String courseName;
//     private int duration; // in months
//     private double fee;

//     // Class variable shared among all courses
//     static String instituteName = "SkillForge Academy";

//     // Constructor using 'this' to initialize instance variables
//     public Course(String courseName, int duration, double fee) {
//         this.courseName = courseName;
//         this.duration = duration;
//         this.fee = fee;
//     }

//     // Instance method to display course details
//     public void displayCourseDetails() {
//         System.out.println("Institute: " + instituteName);
//         System.out.println("Course Name: " + courseName);
//         System.out.println("Duration: " + duration + " months");
//         System.out.println("Fee: ₹" + fee);
//     }

//     // Class method to update institute name
//     public static void updateInstituteName(String newName) {
//         instituteName = newName;
//         System.out.println("Institute name updated to: " + instituteName);
//     }
// }

// // Main class to test the Course system
// public class constructor {
//     public static void main(String[] args) {
//         Course c1 = new Course("Java Programming", 3, 12000.0);
//         Course c2 = new Course("Web Security", 2, 10000.0);

//         // Display initial course details
//         c1.displayCourseDetails();
//         c2.displayCourseDetails();

//         // Update institute name using class method
//         Course.updateInstituteName("CodeVerse Institute");

//         // Display updated course details
//         c1.displayCourseDetails();
//         c2.displayCourseDetails();
//     }
// }


//Vehicle Registration
// class Vehicle {
//     // Instance variables
//     private String ownerName;
//     private String vehicleType;

//     // Class variable shared among all vehicles
//     static double registrationFee = 5000.0;

//     // Constructor using 'this' to initialize instance variables
//     public Vehicle(String ownerName, String vehicleType) {
//         this.ownerName = ownerName;
//         this.vehicleType = vehicleType;
//     }

//     // Instance method to display vehicle details
//     public void displayVehicleDetails() {
//         System.out.println("Owner Name: " + ownerName);
//         System.out.println("Vehicle Type: " + vehicleType);
//         System.out.println("Registration Fee: ₹" + registrationFee);
//     }

//     // Class method to update registration fee
//     public static void updateRegistrationFee(double newFee) {
//         registrationFee = newFee;
//         System.out.println("Registration fee updated to ₹" + registrationFee);
//     }
// }

// // Main class to test the Vehicle system
// public class constructor {
//     public static void main(String[] args) {
//         Vehicle v1 = new Vehicle("Ananya", "Car");
//         Vehicle v2 = new Vehicle("Ravi", "Bike");

//         // Display initial vehicle details
//         v1.displayVehicleDetails();
//         v2.displayVehicleDetails();

//         // Update registration fee using class method
//         Vehicle.updateRegistrationFee(6000.0);

//         // Display updated vehicle details
//         v1.displayVehicleDetails();
//         v2.displayVehicleDetails();
//     }
// }



//UNIVERSITY MANAGEMENT SYSTEM
// class Student {
//     // Access modifiers
//     public int rollNumber;         
//     protected String name;         
//     private double CGPA;          

//     // Constructor using 'this'
//     public Student(int rollNumber, String name, double CGPA) {
//         this.rollNumber = rollNumber;
//         this.name = name;
//         this.CGPA = CGPA;
//     }

//     // Public method to access CGPA
//     public double getCGPA() {
//         return CGPA;
//     }

//     // Public method to modify CGPA
//     public void setCGPA(double newCGPA) {
//         if (newCGPA >= 0.0 && newCGPA <= 10.0) {
//             this.CGPA = newCGPA;
//         } else {
//             System.out.println("Invalid CGPA. Must be between 0.0 and 10.0");
//         }
//     }

//     // Method to display student details
//     public void displayDetails() {
//         System.out.println("Roll Number: " + rollNumber);
//         System.out.println("Name: " + name);
//         System.out.println("CGPA: " + CGPA);
//     }
// }


//BOOK LIBRARY SYSTEM
// class Book {
//     // Access modifiers
//     public String ISBN;        
//     protected String title;    
//     private String author;     

//     // Constructor using 'this'
//     public Book(String ISBN, String title, String author) {
//         this.ISBN = ISBN;
//         this.title = title;
//         this.author = author;
//     }

//     // Public method to set author name
//     public void setAuthor(String author) {
//         this.author = author;
//     }

//     // Public method to get author name
//     public String getAuthor() {
//         return author;
//     }

//     // Method to display book details
//     public void displayBookDetails() {
//         System.out.println("ISBN: " + ISBN);
//         System.out.println("Title: " + title);
//         System.out.println("Author: " + author);
//     }
// }


//BOOK ACCOUNT MANAGEMENT
// class BankAccount {
//     // Access modifiers
//     public int accountNumber;        
//     protected String accountHolder;  
//     private double balance;          

//     // Constructor using 'this'
//     public BankAccount(int accountNumber, String accountHolder, double balance) {
//         this.accountNumber = accountNumber;
//         this.accountHolder = accountHolder;
//         this.balance = balance;
//     }

//     // Public method to get balance
//     public double getBalance() {
//         return balance;
//     }

//     // Public method to modify balance
//     public void deposit(double amount) {
//         if (amount > 0) {
//             balance += amount;
//             System.out.println("₹" + amount + " deposited. New balance: ₹" + balance);
//         } else {
//             System.out.println("Invalid deposit amount.");
//         }
//     }

//     public void withdraw(double amount) {
//         if (amount > 0 && amount <= balance) {
//             balance -= amount;
//             System.out.println("₹" + amount + " withdrawn. New balance: ₹" + balance);
//         } else {
//             System.out.println("Insufficient balance or invalid amount.");
//         }
//     }

//     // Method to display account details
//     public void displayAccountDetails() {
//         System.out.println("Account Number: " + accountNumber);
//         System.out.println("Account Holder: " + accountHolder);
//         System.out.println("Balance: ₹" + balance);
//     }
// }



