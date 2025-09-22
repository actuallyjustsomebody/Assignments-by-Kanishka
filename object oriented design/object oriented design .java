//question 1
// import java.util.ArrayList;

// class Book {
//     String title;
//     String author;

//     public Book(String title, String author) {
//         this.title = title;
//         this.author = author;
//     }

//     public void displayBook() {
//         System.out.println("Title: " + title + ", Author: " + author);
//     }
// }

// class Library {
//     String name;
//     ArrayList<Book> books = new ArrayList<>();

//     public Library(String name) {
//         this.name = name;
//     }

//     public void addBook(Book book) {
//         books.add(book); // Aggregation: Book exists outside Library
//     }

//     public void displayLibrary() {
//         System.out.println("Library: " + name);
//         for (Book b : books) {
//             b.displayBook();
//         }
//     }
// }



//question 2
// import java.util.ArrayList;

// class Bank {
//     String bankName;
//     ArrayList<Customer> customers = new ArrayList<>();

//     public Bank(String bankName) {
//         this.bankName = bankName;
//     }

//     public void openAccount(Customer customer) {
//         customers.add(customer); // Association: Bank knows its customers
//         customer.setBank(this);  // Customer knows its bank
//         System.out.println("Account opened for " + customer.name + " at " + bankName);
//     }
// }

// class Customer {
//     String name;
//     double balance;
//     Bank bank; // Associated bank

//     public Customer(String name, double balance) {
//         this.name = name;
//         this.balance = balance;
//     }

//     public void setBank(Bank bank) {
//         this.bank = bank;
//     }

//     public void viewBalance() {
//         System.out.println("Customer: " + name + ", Balance: ₹" + balance + ", Bank: " + bank.bankName);
//     }
// }



//question 3
// import java.util.ArrayList;

// class Employee {
//     String name;

//     public Employee(String name) {
//         this.name = name;
//     }

//     public void displayEmployee() {
//         System.out.println("Employee: " + name);
//     }
// }

// class Department {
//     String deptName;
//     ArrayList<Employee> employees = new ArrayList<>();

//     public Department(String deptName) {
//         this.deptName = deptName;
//     }

//     public void addEmployee(String name) {
//         employees.add(new Employee(name)); // Composition: Employees tied to Department
//     }

//     public void displayDepartment() {
//         System.out.println("Department: " + deptName);
//         for (Employee e : employees) {
//             e.displayEmployee();
//         }
//     }
// }

// class Company {
//     String companyName;
//     ArrayList<Department> departments = new ArrayList<>();

//     public Company(String companyName) {
//         this.companyName = companyName;
//     }

//     public void addDepartment(Department dept) {
//         departments.add(dept); // Composition: Departments tied to Company
//     }

//     public void displayCompany() {
//         System.out.println("Company: " + companyName);
//         for (Department d : departments) {
//             d.displayDepartment();
//         }
//     }
// }



//question 4
// import java.util.*;

// class Course {
//     String courseName;
//     List<Student> enrolledStudents = new ArrayList<>();

//     public Course(String courseName) {
//         this.courseName = courseName;
//     }

//     public void enrollStudent(Student student) {
//         enrolledStudents.add(student);
//     }

//     public void showEnrolledStudents() {
//         System.out.println("Course: " + courseName);
//         for (Student s : enrolledStudents) {
//             System.out.println(" - " + s.name);
//         }
//     }
// }

// class Student {
//     String name;
//     List<Course> courses = new ArrayList<>();

//     public Student(String name) {
//         this.name = name;
//     }

//     public void enrollInCourse(Course course) {
//         courses.add(course);
//         course.enrollStudent(this); // Association: many-to-many
//     }

//     public void showCourses() {
//         System.out.println("Student: " + name);
//         for (Course c : courses) {
//             System.out.println(" - " + c.courseName);
//         }
//     }
// }

// class School {
//     String schoolName;
//     List<Student> students = new ArrayList<>();

//     public School(String schoolName) {
//         this.schoolName = schoolName;
//     }

//     public void addStudent(Student student) {
//         students.add(student); // Aggregation: School has students
//     }

//     public void showStudents() {
//         System.out.println("School: " + schoolName);
//         for (Student s : students) {
//             System.out.println(" - " + s.name);
//         }
//     }
// }


//question 5
// class Faculty {
//     String name;

//     public Faculty(String name) {
//         this.name = name;
//     }

//     public void showInfo() {
//         System.out.println("Faculty: " + name);
//     }
// }

// class Department {
//     String deptName;

//     public Department(String deptName) {
//         this.deptName = deptName;
//     }

//     public void showInfo() {
//         System.out.println("Department: " + deptName);
//     }
// }

// class University {
//     String uniName;
//     List<Department> departments = new ArrayList<>();

//     public University(String uniName) {
//         this.uniName = uniName;
//     }

//     public void addDepartment(Department dept) {
//         departments.add(dept); // Composition: tightly owned
//     }

//     public void deleteUniversity() {
//         departments.clear(); // Composition: delete departments with university
//         System.out.println("University '" + uniName + "' deleted. All departments removed.");
//     }

//     public void showDepartments() {
//         System.out.println("University: " + uniName);
//         for (Department d : departments) {
//             d.showInfo();
//         }
//     }
// }


//question 6
// class Patient {
//     String name;

//     public Patient(String name) {
//         this.name = name;
//     }
// }

// class Doctor {
//     String name;
//     List<Patient> patients = new ArrayList<>();

//     public Doctor(String name) {
//         this.name = name;
//     }

//     public void consult(Patient patient) {
//         patients.add(patient); // Association
//         System.out.println("Dr. " + name + " consulted patient " + patient.name);
//     }

//     public void showPatients() {
//         System.out.println("Dr. " + name + "'s Patients:");
//         for (Patient p : patients) {
//             System.out.println(" - " + p.name);
//         }
//     }
// }
