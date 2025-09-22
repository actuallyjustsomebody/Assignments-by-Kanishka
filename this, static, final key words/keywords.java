// public class f {
    
    
//     static String bankName = "CodeBank";
//     static int totalAccounts = 0;

    
//     private final int accountNumber;
//     private String accountHolderName;
//     private double balance;

    
//     public f(String accountHolderName, int accountNumber, double balance) {
//         this.accountHolderName = accountHolderName;
//         this.accountNumber = accountNumber;
//         this.balance = balance;
//         totalAccounts++; // Increment total accounts
//     }

   
//     public static void getTotalAccounts() {
//         System.out.println("Total accounts created: " + totalAccounts);
//     }

//     public void displayDetails() {
//         System.out.println("Bank Name: " + bankName);
//         System.out.println("Account Holder: " + accountHolderName);
//         System.out.println("Account Number: " + accountNumber);
//         System.out.println("Balance: ₹" + balance);
//     }
// }


// public class f {
//     public static void main(String[] args) {
//         f acc1 = new f("Ananya", 1001, 5000.0);
//         f acc2 = new f("Ravi", 1002, 7500.0);

       
//         if (acc1 instanceof f) {
//             acc1.displayDetails();
//         }

//         if (acc2 instanceof f) {
//             acc2.displayDetails();
//         }

       
//         f.getTotalAccounts();
//     }
// }
    

//question 2 library management system
// class Book {
   
//     static String libraryName = "Knowledge Hub";

   
//     private final String isbn;
//     private String title;
//     private String author;

   
//     public Book(String title, String author, String isbn) {
//         this.title = title;
//         this.author = author;
//         this.isbn = isbn;
//     }


//     public static void displayLibraryName() {
//         System.out.println("Library Name: " + libraryName);
//     }

    
//     public void displayDetails() {
//         System.out.println("Title: " + title);
//         System.out.println("Author: " + author);
//         System.out.println("ISBN: " + isbn);
//     }
// }

// public class f {
//     public static void main(String[] args) {
//         Book b1 = new Book("Java Basics", "Ananya Sharma", "ISBN001");
//         Book b2 = new Book("Ethical Hacking", "Ravi Kumar", "ISBN002");

        
//         Book.displayLibraryName();

//         if (b1 instanceof Book) {
//             b1.displayDetails();
//         }

//         if (b2 instanceof Book) {
//             b2.displayDetails();
//         }
//     }
// }




//employee management system
// class Employee {
   
//     static String companyName = "TechVerse Pvt Ltd";
//     static int totalEmployees = 0;

//     private final int id;
//     private String name;
//     private String designation;

    
//     public Employee(String name, int id, String designation) {
//         this.name = name;
//         this.id = id;
//         this.designation = designation;
//         totalEmployees++; 
//     }

    
//     public static void displayTotalEmployees() {
//         System.out.println("Total Employees: " + totalEmployees);
//     }

//     public void displayDetails() {
//         System.out.println("Company: " + companyName);
//         System.out.println("Name: " + name);
//         System.out.println("ID: " + id);
//         System.out.println("Designation: " + designation);
//     }
// }


// public class f{
//     public static void main(String[] args) {
//         Employee e1 = new Employee("Ananya", 101, "Software Engineer");
//         Employee e2 = new Employee("Ravi", 102, "Security Analyst");

        
//         if (e1 instanceof Employee) {
//             e1.displayDetails();
//         }

//         if (e2 instanceof Employee) {
//             e2.displayDetails();
//         }

        
//         Employee.displayTotalEmployees();
//     }
// }




//Shopping Cart System
// class Product {
    
//     static double discount = 10.0; 

    
//     private final int productID;
//     private String productName;
//     private double price;
//     private int quantity;

   
//     public Product(int productID, String productName, double price, int quantity) {
//         this.productID = productID;
//         this.productName = productName;
//         this.price = price;
//         this.quantity = quantity;
//     }

   
//     public static void updateDiscount(double newDiscount) {
//         discount = newDiscount;
//         System.out.println("Discount updated to: " + discount + "%");
//     }

    
//     public void displayDetails() {
//         System.out.println("Product ID: " + productID);
//         System.out.println("Name: " + productName);
//         System.out.println("Price: ₹" + price);
//         System.out.println("Quantity: " + quantity);
//         System.out.println("Discount: " + discount + "%");
//         double discountedPrice = price - (price * discount / 100);
//         System.out.println("Price after discount: ₹" + discountedPrice);
//     }
// }


// public class f {
//     public static void main(String[] args) {
//         Product p1 = new Product(101, "Laptop", 75000.0, 1);
//         Product p2 = new Product(102, "Headphones", 1500.0, 2);

        
//         Product.updateDiscount(15.0);

        
//         if (p1 instanceof Product) {
//             p1.displayDetails();
//         }

//         if (p2 instanceof Product) {
//             p2.displayDetails();
//         }
//     }
// }


//University system Management
// class Student {
   
//     static String universityName = "Global Tech University";
//     static int totalStudents = 0;

    
//     private final int rollNumber;
//     private String name;
//     private char grade;

    
//     public Student(String name, int rollNumber, char grade) {
//         this.name = name;
//         this.rollNumber = rollNumber;
//         this.grade = grade;
//         totalStudents++; 
//     }

    
//     public static void displayTotalStudents() {
//         System.out.println("Total Students Enrolled: " + totalStudents);
//     }

    
//     public void displayDetails() {
//         System.out.println("University: " + universityName);
//         System.out.println("Name: " + name);
//         System.out.println("Roll Number: " + rollNumber);
//         System.out.println("Grade: " + grade);
//     }

    
//     public void updateGrade(char newGrade) {
//         this.grade = newGrade;
//         System.out.println("Grade updated to: " + grade);
//     }
// }


// public class f {
//     public static void main(String[] args) {
//         Student s1 = new Student("Ananya", 101, 'A');
//         Student s2 = new Student("Ravi", 102, 'B');

       
//         if (s1 instanceof Student) {
//             s1.displayDetails();
//             s1.updateGrade('A');
//         }

//         if (s2 instanceof Student) {
//             s2.displayDetails();
//         }

        
//         Student.displayTotalStudents();
//     }
// }


//Vehicle registration System
// class Student {

//     static String universityName = "Global Tech University";
//     static int totalStudents = 0;

    
//     private final int rollNumber;
//     private String name;
//     private char grade;

    
//     public Student(String name, int rollNumber, char grade) {
//         this.name = name;
//         this.rollNumber = rollNumber;
//         this.grade = grade;
//         totalStudents++; 
//     }

   
//     public static void displayTotalStudents() {
//         System.out.println("Total Students Enrolled: " + totalStudents);
//     }

    
//     public void displayDetails() {
//         System.out.println("University: " + universityName);
//         System.out.println("Name: " + name);
//         System.out.println("Roll Number: " + rollNumber);
//         System.out.println("Grade: " + grade);
//     }

    
//     public void updateGrade(char newGrade) {
//         this.grade = newGrade;
//         System.out.println("Grade updated to: " + grade);
//     }
// }

// public class f{
//     public static void main(String[] args) {
//         Student s1 = new Student("Ananya", 101, 'A');
//         Student s2 = new Student("Ravi", 102, 'B');

        
//         if (s1 instanceof Student) {
//             s1.displayDetails();
//             s1.updateGrade('A');
//         }

//         if (s2 instanceof Student) {
//             s2.displayDetails();
//         }

       
//         Student.displayTotalStudents();
//     }
// }



//Hospital Manangement System
// class Patient {
    
//     static String hospitalName = "CareWell Hospital";
//     static int totalPatients = 0;

    
//     private final int patientID;
//     private String name;
//     private int age;
//     private String ailment;

    
//     public Patient(int patientID, String name, int age, String ailment) {
//         this.patientID = patientID;
//         this.name = name;
//         this.age = age;
//         this.ailment = ailment;
//         totalPatients++; 
//     }

    
//     public static void getTotalPatients() {
//         System.out.println("Total Patients Admitted: " + totalPatients);
//     }

//     public void displayDetails() {
//         System.out.println("Hospital: " + hospitalName);
//         System.out.println("Patient ID: " + patientID);
//         System.out.println("Name: " + name);
//         System.out.println("Age: " + age);
//         System.out.println("Ailment: " + ailment);
//     }
// }


// public class f {
//     public static void main(String[] args) {
//         Patient p1 = new Patient(201, "Ananya", 22, "Migraine");
//         Patient p2 = new Patient(202, "Ravi", 30, "Fracture");

        
//         if (p1 instanceof Patient) {
//             p1.displayDetails();
//         }

//         if (p2 instanceof Patient) {
//             p2.displayDetails();
//         }

        
//         Patient.getTotalPatients();
//     }
// }

