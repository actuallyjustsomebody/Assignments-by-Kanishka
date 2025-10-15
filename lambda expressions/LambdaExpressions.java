/*

----- Smart Home Lighting Automation ------


public class SmartHomeLighting {
    public static void main(String[] args) {

        String room = "Living Room";
        Runnable motionDetected = () -> System.out.println("Turning on lights in " + room + " due to motion detection.");
        motionDetected.run();

        room = "Bedroom";
        Runnable morningLighting = () -> System.out.println("Setting morning light mode in " + room + " with warm colors.");
        morningLighting.run();

        room = "Kitchen";
        Runnable nightMode = () -> System.out.println("Switching to night mode in " + room + " with dim lights.");
        nightMode.run();
    }
}



------Custom Sorting in E-Commerce------

import java.util.*;

class Product {
    String name;
    double price;
    double rating;
    double discount;

    Product(String name, double price, double rating, double discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return name + " - Price: $" + price + ", Rating: " + rating + ", Discount: " + discount + "%";
    }
}

public class ProductSorter {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1200, 4.5, 15));
        products.add(new Product("Smartphone", 800, 4.7, 10));
        products.add(new Product("Headphones", 150, 4.0, 5));

        products.sort((p1, p2) -> Double.compare(p1.price, p2.price));
        System.out.println("Sorted by price: " + products);

        products.sort((p1, p2) -> Double.compare(p2.rating, p1.rating)); // Higher rating first
        System.out.println("Sorted by rating: " + products);

        products.sort((p1, p2) -> Double.compare(p2.discount, p1.discount)); // Higher discount first
        System.out.println("Sorted by discount: " + products);
    }
}



 ------Notification Filtering------


import java.util.*;
        import java.util.function.Predicate;

class Alert {
    String message;
    String type;

    Alert(String message, String type) {
        this.message = message;
        this.type = type;
    }

    @Override
    public String toString() {
        return type + " Alert: " + message;
    }
}

public class NotificationFiltering {
    public static void main(String[] args) {
        List<Alert> alerts = new ArrayList<>();
        alerts.add(new Alert("Patient John has low blood pressure", "Critical"));
        alerts.add(new Alert("Scheduled checkup reminder for Patient Lisa", "Reminder"));
        alerts.add(new Alert("Patient Bob's medication is due", "Reminder"));
        alerts.add(new Alert("Patient Sarah has recovered", "Update"));

        Predicate<Alert> criticalFilter = alert -> alert.type.equals("Critical");

        alerts.stream()
                .filter(criticalFilter)
                .forEach(System.out::println);
    }
}




--------Hospital Patient ID Printing-------

import java.util.*;

class Patient {
    String id;

    Patient(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}

public class HospitalPatientIDPrinting {
    public static void main(String[] args) {
        List<Patient> patients = Arrays.asList(
                new Patient("P001"),
                new Patient("P002"),
                new Patient("P003")
        );

        patients.stream()
                .map(Patient::getId)  // Using method reference
                .forEach(System.out::println);  // Print each ID
    }
}



------Name Uppercasing-------


import java.util.*;

public class NameUppercasing {
    public static void main(String[] args) {
        List<String> employees = Arrays.asList("Shreya", "Naina", "Diya");

        employees.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}




-------Invoice Object Creation------

import java.util.*;

class Invoice {
    String transactionId;

    Invoice(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    @Override
    public String toString() {
        return "Invoice for Transaction ID: " + transactionId;
    }
}

public class InvoiceObjectCreation {
    public static void main(String[] args) {
        List<String> transactionIds = Arrays.asList("TXN001", "TXN002", "TXN003");

        List<Invoice> invoices = new ArrayList<>();
        transactionIds.forEach(id -> invoices.add(new Invoice(id))); // Without method reference

        List<Invoice> invoicesWithReference =
                transactionIds.stream()
                        .map(Invoice::new)  // Using constructor reference
                        .toList();

        invoicesWithReference.forEach(System.out::println);
    }
}


