// Superclass: Book
// class Book {
//     String title;
//     int publicationYear;

//     public Book(String title, int publicationYear) {
//         this.title = title;
//         this.publicationYear = publicationYear;
//     }
// }

// // Subclass: Author extends Book
// class Author extends Book {
//     String name;
//     String bio;

//     public Author(String title, int publicationYear, String name, String bio) {
//         super(title, publicationYear); // Call superclass constructor
//         this.name = name;
//         this.bio = bio;
//     }

//     public void displayInfo() {
//         System.out.println("Book Title: " + title);
//         System.out.println("Publication Year: " + publicationYear);
//         System.out.println("Author Name: " + name);
//         System.out.println("Author Bio: " + bio);
//     }
// }




// Superclass: Device
// class Device {
//     String deviceId;
//     String status;

//     public Device(String deviceId, String status) {
//         this.deviceId = deviceId;
//         this.status = status;
//     }
// }

// // Subclass: Thermostat extends Device
// class Thermostat extends Device {
//     double temperatureSetting;

//     public Thermostat(String deviceId, String status, double temperatureSetting) {
//         super(deviceId, status); // Call superclass constructor
//         this.temperatureSetting = temperatureSetting;
//     }

//     public void displayStatus() {
//         System.out.println("Device ID: " + deviceId);
//         System.out.println("Status: " + status);
//         System.out.println("Temperature Setting: " + temperatureSetting + "°C");
//     }
// }




// Base class: Order
// class Order {
//     int orderId;
//     String orderDate;

//     public Order(int orderId, String orderDate) {
//         this.orderId = orderId;
//         this.orderDate = orderDate;
//     }

//     public String getOrderStatus() {
//         return "Order placed";
//     }
// }

// // Subclass: ShippedOrder extends Order
// class ShippedOrder extends Order {
//     String trackingNumber;

//     public ShippedOrder(int orderId, String orderDate, String trackingNumber) {
//         super(orderId, orderDate);
//         this.trackingNumber = trackingNumber;
//     }

//     @Override
//     public String getOrderStatus() {
//         return "Order shipped with tracking number: " + trackingNumber;
//     }
// }

// // Subclass: DeliveredOrder extends ShippedOrder
// class DeliveredOrder extends ShippedOrder {
//     String deliveryDate;

//     public DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
//         super(orderId, orderDate, trackingNumber);
//         this.deliveryDate = deliveryDate;
//     }

//     @Override
//     public String getOrderStatus() {
//         return "Order delivered on: " + deliveryDate;
//     }
// }




// Base class: Course
// class Course {
//     String courseName;
//     int duration; // in weeks

//     public Course(String courseName, int duration) {
//         this.courseName = courseName;
//         this.duration = duration;
//     }
// }

// // Subclass: OnlineCourse extends Course
// class OnlineCourse extends Course {
//     String platform;
//     boolean isRecorded;

//     public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
//         super(courseName, duration);
//         this.platform = platform;
//         this.isRecorded = isRecorded;
//     }
// }

// // Subclass: PaidOnlineCourse extends OnlineCourse
// class PaidOnlineCourse extends OnlineCourse {
//     double fee;
//     double discount;

//     public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
//         super(courseName, duration, platform, isRecorded);
//         this.fee = fee;
//         this.discount = discount;
//     }

//     public void displayCourseDetails() {
//         System.out.println("Course Name: " + courseName);
//         System.out.println("Duration: " + duration + " weeks");
//         System.out.println("Platform: " + platform);
//         System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
//         System.out.println("Fee: ₹" + fee);
//         System.out.println("Discount: " + discount + "%");
//         System.out.println("Final Price: ₹" + (fee - (fee * discount / 100)));
//     }
// }




// Superclass: BankAccount
// class BankAccount {
//     int accountNumber;
//     double balance;

//     public BankAccount(int accountNumber, double balance) {
//         this.accountNumber = accountNumber;
//         this.balance = balance;
//     }

//     public void displayBasicInfo() {
//         System.out.println("Account Number: " + accountNumber);
//         System.out.println("Balance: ₹" + balance);
//     }
// }

// // Subclass: SavingsAccount
// class SavingsAccount extends BankAccount {
//     double interestRate;

//     public SavingsAccount(int accountNumber, double balance, double interestRate) {
//         super(accountNumber, balance);
//         this.interestRate = interestRate;
//     }

//     public void displayAccountType() {
//         System.out.println("Account Type: Savings Account");
//         System.out.println("Interest Rate: " + interestRate + "%");
//     }
// }

// // Subclass: CheckingAccount
// class CheckingAccount extends BankAccount {
//     double withdrawalLimit;

//     public CheckingAccount(int accountNumber, double balance, double withdrawalLimit) {
//         super(accountNumber, balance);
//         this.withdrawalLimit = withdrawalLimit;
//     }

//     public void displayAccountType() {
//         System.out.println("Account Type: Checking Account");
//         System.out.println("Withdrawal Limit: ₹" + withdrawalLimit);
//     }
// }

// // Subclass: FixedDepositAccount
// class FixedDepositAccount extends BankAccount {
//     int maturityPeriod; // in months

//     public FixedDepositAccount(int accountNumber, double balance, int maturityPeriod) {
//         super(accountNumber, balance);
//         this.maturityPeriod = maturityPeriod;
//     }

//     public void displayAccountType() {
//         System.out.println("Account Type: Fixed Deposit Account");
//         System.out.println("Maturity Period: " + maturityPeriod + " months");
//     }
// }



// Superclass: Person
// class Person {
//     String name;
//     int age;

//     public Person(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }

//     public void displayBasicInfo() {
//         System.out.println("Name: " + name);
//         System.out.println("Age: " + age);
//     }
// }

// // Subclass: Teacher
// class Teacher extends Person {
//     String subject;

//     public Teacher(String name, int age, String subject) {
//         super(name, age);
//         this.subject = subject;
//     }

//     public void displayRole() {
//         System.out.println("Role: Teacher");
//         System.out.println("Subject: " + subject);
//     }
// }

// // Subclass: Student
// class Student extends Person {
//     String grade;

//     public Student(String name, int age, String grade) {
//         super(name, age);
//         this.grade = grade;
//     }

//     public void displayRole() {
//         System.out.println("Role: Student");
//         System.out.println("Grade: " + grade);
//     }
// }

// // Subclass: Staff
// class Staff extends Person {
//     String department;

//     public Staff(String name, int age, String department) {
//         super(name, age);
//         this.department = department;
//     }

//     public void displayRole() {
//         System.out.println("Role: Staff");
//         System.out.println("Department: " + department);
//     }
// }




// Superclass: Person
// class Person {
//     String name;
//     int id;

//     public Person(String name, int id) {
//         this.name = name;
//         this.id = id;
//     }

//     public void displayInfo() {
//         System.out.println("Name: " + name);
//         System.out.println("ID: " + id);
//     }
// }

// // Interface: Worker
// interface Worker {
//     void performDuties();
// }

// // Subclass: Chef
// class Chef extends Person implements Worker {
//     String specialty;

//     public Chef(String name, int id, String specialty) {
//         super(name, id);
//         this.specialty = specialty;
//     }

//     @Override
//     public void performDuties() {
//         System.out.println("Chef " + name + " is preparing " + specialty + " dishes.");
//     }
// }

// // Subclass: Waiter
// class Waiter extends Person implements Worker {
//     int tableCount;

//     public Waiter(String name, int id, int tableCount) {
//         super(name, id);
//         this.tableCount = tableCount;
//     }

//     @Override
//     public void performDuties() {
//         System.out.println("Waiter " + name + " is serving " + tableCount + " tables.");
//     }
// }




// Superclass: Vehicle
// class Vehicle {
//     int maxSpeed;
//     String model;

//     public Vehicle(int maxSpeed, String model) {
//         this.maxSpeed = maxSpeed;
//         this.model = model;
//     }

//     public void displaySpecs() {
//         System.out.println("Model: " + model);
//         System.out.println("Max Speed: " + maxSpeed + " km/h");
//     }
// }

// // Interface: Refuelable
// interface Refuelable {
//     void refuel();
// }

// // Subclass: ElectricVehicle
// class ElectricVehicle extends Vehicle {
//     int batteryLevel;

//     public ElectricVehicle(int maxSpeed, String model, int batteryLevel) {
//         super(maxSpeed, model);
//         this.batteryLevel = batteryLevel;
//     }

//     public void charge() {
//         System.out.println("Charging " + model + " to 100%. Current battery: " + batteryLevel + "%");
//     }
// }

// // Subclass: PetrolVehicle implements Refuelable
// class PetrolVehicle extends Vehicle implements Refuelable {
//     double fuelLevel;

//     public PetrolVehicle(int maxSpeed, String model, double fuelLevel) {
//         super(maxSpeed, model);
//         this.fuelLevel = fuelLevel;
//     }

//     @Override
//     public void refuel() {
//         System.out.println("Refueling " + model + ". Current fuel level: " + fuelLevel + " liters.");
//     }
// }

//question 1
// class Engine {
//     void start() { System.out.println("Engine started"); }
// }

// class Car {
//     private Engine engine = new Engine(); // Composition

//     void drive() {
//         engine.start();
//         System.out.println("Car is driving");
//     }
// }


//question 2
// class BankAccount {
//     public final void calculateInterest() {
//         // critical logic
//     }
// }


