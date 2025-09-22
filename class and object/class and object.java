//DISPLAY EMPLOYEE DETAILS
// class Employee {
//     String name;
//     int id;
//     double salary;

//     public Employee(String name, int id, double salary) {
//         this.name = name;
//         this.id = id;
//         this.salary = salary;
//     }

//     public void displayDetails() {
//         System.out.println("Employee Name: " + name);
//         System.out.println("Employee ID: " + id);
//         System.out.println("Salary: ₹" + salary);
//     }
// }


//COMPUTE AREA OF CIRCLE
// class Circle {
//     double radius;

//     public Circle(double radius) {
//         this.radius = radius;
//     }

//     public double calculateArea() {
//         return Math.PI * radius * radius;
//     }

//     public double calculateCircumference() {
//         return 2 * Math.PI * radius;
//     }

//     public void displayDetails() {
//         System.out.println("Radius: " + radius);
//         System.out.println("Area: " + calculateArea());
//         System.out.println("Circumference: " + calculateCircumference());
//     }
// }

//HANDLE BOOK DETAILS
// class Book {
//     String title;
//     String author;
//     double price;

//     public Book(String title, String author, double price) {
//         this.title = title;
//         this.author = author;
//         this.price = price;
//     }

//     public void displayDetails() {
//         System.out.println("Book Title: " + title);
//         System.out.println("Author: " + author);
//         System.out.println("Price: ₹" + price);
//     }
// }


//TRACK INVENTORY ITEMS
// class Item {
//     int itemCode;
//     String itemName;
//     double price;

//     public Item(int itemCode, String itemName, double price) {
//         this.itemCode = itemCode;
//         this.itemName = itemName;
//         this.price = price;
//     }

//     public void displayDetails(int quantity) {
//         double totalCost = price * quantity;
//         System.out.println("Item Code: " + itemCode);
//         System.out.println("Item Name: " + itemName);
//         System.out.println("Unit Price: ₹" + price);
//         System.out.println("Quantity: " + quantity);
//         System.out.println("Total Cost: ₹" + totalCost);
//     }
// }


//HANDLE MOBILE PHONE DETAILS
// class MobilePhone {
//     String brand;
//     String model;
//     double price;

//     public MobilePhone(String brand, String model, double price) {
//         this.brand = brand;
//         this.model = model;
//         this.price = price;
//     }

//     public void displayDetails() {
//         System.out.println("Brand: " + brand);
//         System.out.println("Model: " + model);
//         System.out.println("Price: ₹" + price);
//     }
// }

//LEVEL -2 QUESTION

//STUDENT REPORT SYSTEM
// class Student {
//     String name;
//     int rollNumber;
//     int marks;

//     public Student(String name, int rollNumber, int marks) {
//         this.name = name;
//         this.rollNumber = rollNumber;
//         this.marks = marks;
//     }

//     public String calculateGrade() {
//         if (marks >= 90) return "A";
//         else if (marks >= 75) return "B";
//         else if (marks >= 60) return "C";
//         else if (marks >= 40) return "D";
//         else return "F";
//     }

//     public void displayDetails() {
//         System.out.println("Name: " + name);
//         System.out.println("Roll Number: " + rollNumber);
//         System.out.println("Marks: " + marks);
//         System.out.println("Grade: " + calculateGrade());
//     }
// }


//ATM SIMULATION
// class BankAccount {
//     String accountHolder;
//     int accountNumber;
//     double balance;

//     public BankAccount(String accountHolder, int accountNumber, double balance) {
//         this.accountHolder = accountHolder;
//         this.accountNumber = accountNumber;
//         this.balance = balance;
//     }

//     public void deposit(double amount) {
//         if (amount > 0) {
//             balance += amount;
//             System.out.println("₹" + amount + " deposited.");
//         }
//     }

//     public void withdraw(double amount) {
//         if (amount > 0 && amount <= balance) {
//             balance -= amount;
//             System.out.println("₹" + amount + " withdrawn.");
//         } else {
//             System.out.println("Insufficient balance.");
//         }
//     }

//     public void displayBalance() {
//         System.out.println("Account Holder: " + accountHolder);
//         System.out.println("Account Number: " + accountNumber);
//         System.out.println("Current Balance: ₹" + balance);
//     }
// }



//PALINDROME CHECKERclass PalindromeChecker {
    // String text;

    // public j(String text) {
    //     this.text = text;
    // }

    // public boolean isPalindrome() {
    //     String clean = text.replaceAll("\\s+", "").toLowerCase();
    //     String reversed = new StringBuilder(clean).reverse().toString();
    //     return clean.equals(reversed);
    // }

    // public void displayResult() {
    //     System.out.println("Text: " + text);
    //     if (isPalindrome()) {
    //         System.out.println("Result: It's a palindrome!");
    //     } else {
    //         System.out.println("Result: Not a palindrome.");
    //     }
    // }



    //MOVIE TICKET
//     class MovieTicket {
//     String movieName;
//     int seatNumber;
//     double price;

//     public void bookTicket(String movieName, int seatNumber, double price) {
//         this.movieName = movieName;
//         this.seatNumber = seatNumber;
//         this.price = price;
//         System.out.println("Ticket booked successfully!");
//     }

//     public void displayTicketDetails() {
//         System.out.println("Movie: " + movieName);
//         System.out.println("Seat Number: " + seatNumber);
//         System.out.println("Price: ₹" + price);
//     }
// }



//Shopping Cart
// class CartItem {
//     String itemName;
//     double price;
//     int quantity;

//     public CartItem(String itemName, double price, int quantity) {
//         this.itemName = itemName;
//         this.price = price;
//         this.quantity = quantity;
//     }

//     public void addItem(int qty) {
//         quantity += qty;
//         System.out.println(qty + " items added.");
//     }

//     public void removeItem(int qty) {
//         if (qty <= quantity) {
//             quantity -= qty;
//             System.out.println(qty + " items removed.");
//         } else {
//             System.out.println("Not enough items to remove.");
//         }
//     }

//     public void displayTotalCost() {
//         double total = price * quantity;
//         System.out.println("Item: " + itemName);
//         System.out.println("Unit Price: ₹" + price);
//         System.out.println("Quantity: " + quantity);
//         System.out.println("Total Cost: ₹" + total);
//     }
// }
