/* -----Smart device control interface-----

public class SmartDeviceDemo {


    interface SmartDevice {
        void turnOn();
        void turnOff();
    }

    static class Light implements SmartDevice {
        public void turnOn() {
            System.out.println("Light is ON");
        }

        public void turnOff() {
            System.out.println("Light is OFF");
        }
    }

    static class AC implements SmartDevice {
        public void turnOn() {
            System.out.println("AC is running");
        }

        public void turnOff() {
            System.out.println("AC is turned off");
        }
    }

    static class TV implements SmartDevice {
        public void turnOn() {
            System.out.println("TV is ON");
        }

        public void turnOff() {
            System.out.println("TV is OFF");
        }
    }

    public static void main(String[] args) {
        SmartDevice light = new Light();
        SmartDevice ac = new AC();
        SmartDevice tv = new TV();

        light.turnOn();
        ac.turnOn();
        tv.turnOn();

        light.turnOff();
        ac.turnOff();
        tv.turnOff();
    }
}



-------Multi-Vehicle Rental System-------



interface Vehicle {
    void rent();
    void returnVehicle();
}

class Car implements Vehicle {
    public void rent() {
        System.out.println("Car has been rented.");
    }

    public void returnVehicle() {
        System.out.println("Car has been returned.");
    }
}

class Bike implements Vehicle {
    public void rent() {
        System.out.println("Bike has been rented.");
    }

    public void returnVehicle() {
        System.out.println("Bike has been returned.");
    }
}

class Bus implements Vehicle {
    public void rent() {
        System.out.println("Bus has been rented.");
    }

    public void returnVehicle() {
        System.out.println("Bus has been returned.");
    }
}

public class VehicleRentalDemo {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        Vehicle bus = new Bus();

        car.rent();
        car.returnVehicle();

        bike.rent();
        bike.returnVehicle();

        bus.rent();
        bus.returnVehicle();
    }
}



-------Digital Payment Interface-------

interface Payment {
    void pay(double amount);
}

class UPI implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI.");
    }
}

class CreditCard implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card.");
    }
}

class Wallet implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Wallet.");
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        Payment upi = new UPI();
        Payment card = new CreditCard();
        Payment wallet = new Wallet();

        upi.pay(150.50);
        card.pay(750.00);
        wallet.pay(320.75);
    }
}

-------Temperature Alert System--------

import java.util.function.Predicate;

public class TemperatureAlertSystem {
    public static void main(String[] args) {
        double threshold = 37.5;

        Predicate<Double> isFever = temp -> temp > threshold;

        double[] temps = {36.8, 37.2, 38.1, 36.5};

        for (double temp : temps) {
            if (isFever.test(temp)) {
                System.out.println("Alert: High temperature detected - " + temp + "°C");
            } else {
                System.out.println("Temperature normal: " + temp + "°C");
            }
        }
    }
}




---------String Length Checker---------

import java.util.function.Function;

public class StringLengthChecker {
    public static void main(String[] args) {
        int charLimit = 100;

        Function<String, Integer> getLength = message -> message.length();

        String msg1 = "This is a short message.";
        String msg2 = "This message is a bit longer than usual. ";

        checkMessage(msg1, getLength, charLimit);
        checkMessage(msg2, getLength, charLimit);
    }

    private static void checkMessage(String message, Function<String, Integer> lengthFunction, int limit) {
        int len = lengthFunction.apply(message);
        if (len > limit) {
            System.out.println("Warning: Message exceeds character limit (" + len + "/" + limit + ")");
        } else {
            System.out.println("Message is within limit (" + len + "/" + limit + ")");
        }
    }
}




------Background Job Execution--------


public class BackgroundJobExecutor {
    public static void main(String[] args) {
        Runnable job = () -> {
            System.out.println("Background job started...");
            try {
                Thread.sleep(2000); // simulate some work
            } catch (InterruptedException e) {
                System.out.println("Job was interrupted.");
            }
            System.out.println("Background job completed.");
        };

        Thread jobThread = new Thread(job);
        jobThread.start();

        System.out.println("Main thread continues running...");
    }
}



------password strength validator------


interface SecurityUtils {
    static boolean isPasswordStrong(String password) {
        if (password == null || password.length() < 8) return false;

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) hasUpper = true;
            else if (Character.isLowerCase(c)) hasLower = true;
            else if (Character.isDigit(c)) hasDigit = true;
            else hasSpecial = true;
        }

        return hasUpper && hasLower && hasDigit && hasSpecial;
    }
}

public class PasswordValidatorDemo {
    public static void main(String[] args) {
        String[] passwords = {
            "hello123", "Secure@2023", "weakpass", "Str0ng#Pwd"
        };

        for (String pwd : passwords) {
            System.out.println(pwd + " -> " +
                (SecurityUtils.isPasswordStrong(pwd) ? "Strong" : "Weak"));
        }
    }
}



--------unit conversion tool--------


interface UnitConverter {
    static double kmToMiles(double km) {
        return km * 0.621371;
    }

    static double kgToPounds(double kg) {
        return kg * 2.20462;
    }
}

public class ConversionToolDemo {
    public static void main(String[] args) {
        double distanceKm = 10.0;
        double weightKg = 5.0;

        double miles = UnitConverter.kmToMiles(distanceKm);
        double pounds = UnitConverter.kgToPounds(weightKg);

        System.out.println(distanceKm + " km = " + miles + " miles");
        System.out.println(weightKg + " kg = " + pounds + " lbs");
    }
}


----------date format utility----------



import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

interface DateUtils {
    static String formatDate(LocalDate date, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return date.format(formatter);
    }
}

public class DateFormatterDemo {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        System.out.println("Default: " + today);
        System.out.println("DD-MM-YYYY: " + DateUtils.formatDate(today, "dd-MM-yyyy"));
        System.out.println("Full format: " + DateUtils.formatDate(today, "EEEE, MMM dd, yyyy"));
    }
}




-------Payment Gateway integration-------


interface PaymentProcessor {
    void processPayment(double amount);

    // Newly added default method
    default void refund(double amount) {
        System.out.println("Refund not supported by this provider.");
    }
}

class PayToProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processed Rs" + amount + " via Payto.");
    }
}

class GivePayProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processed Rs" + amount + " via GivePay.");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunded Rs" + amount + " via GivePay.");
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        PaymentProcessor payto = new PayToProcessor();
        PaymentProcessor givepay = new GivePayProcessor();

        PayTo.processPayment(100);
        PayTo.refund(50); // uses default

        GivePay.processPayment(200);
        GivePay.refund(75); // uses overridden
    }
}






--------Data export feature--------



interface DataExporter {
    void exportToCSV(String data);
    void exportToPDF(String data);

    default void exportToJSON(String data) {
        System.out.println("JSON export not supported.");
    }
}

class CSVExporter implements DataExporter {
    public void exportToCSV(String data) {
        System.out.println("Exported to CSV: " + data);
    }

    public void exportToPDF(String data) {
        System.out.println("Exported to PDF: " + data);
    }
}

class AdvancedExporter implements DataExporter {
    public void exportToCSV(String data) {
        System.out.println("CSV export done.");
    }

    public void exportToPDF(String data) {
        System.out.println("PDF export done.");
    }

    @Override
    public void exportToJSON(String data) {
        System.out.println("Exported to JSON: " + data);
    }
}

public class ExportDemo {
    public static void main(String[] args) {
        DataExporter basic = new CSVExporter();
        DataExporter advanced = new AdvancedExporter();

        basic.exportToCSV("Sales Report");
        basic.exportToJSON("Sales Report"); // default message

        advanced.exportToJSON("Employee Report"); // overridden
    }
}



-------Smart vehicle dashboard------


interface Vehicle {
    void displaySpeed(int speed);

    // New default method for EVs
    default void displayBatteryLevel(int percentage) {
        System.out.println("Battery display not available.");
    }
}

class GasCar implements Vehicle {
    public void displaySpeed(int speed) {
        System.out.println("Speed: " + speed + " km/h");
    }
}

class ElectricCar implements Vehicle {
    public void displaySpeed(int speed) {
        System.out.println("Speed: " + speed + " km/h");
    }

    @Override
    public void displayBatteryLevel(int percentage) {
        System.out.println("Battery: " + percentage + "%");
    }
}

public class VehicleDashboardDemo {
    public static void main(String[] args) {
        Vehicle honda = new GasCar();
        Vehicle tesla = new ElectricCar();

        honda.displaySpeed(80);
        honda.displayBatteryLevel(0); // default

        tesla.displaySpeed(100);
        tesla.displayBatteryLevel(85); // overridden
    }
}



-------Data Serialization for Backup------



import java.io.*;

// Marker Interface
interface BackupSerializable {
}

// Sample class that can be backed up
class UserData implements BackupSerializable, Serializable {
    private String username;
    private int score;

    public UserData(String username, int score) {
        this.username = username;
        this.score = score;
    }

    @Override
    public String toString() {
        return "UserData{username='" + username + "', score=" + score + "}";
    }
}

// Backup utility class
class BackupProcessor {
    public static void backup(Object obj, String fileName) {
        if (!(obj instanceof BackupSerializable)) {
            System.out.println("Object not marked for backup.");
            return;
        }

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
            out.writeObject(obj);
            System.out.println("Backup completed: " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Object restore(String fileName) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
            return in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        UserData user = new UserData("player1", 1500);
        backup(user, "user_backup.ser");

        Object restored = restore("user_backup.ser");
        System.out.println("Restored object: " + restored);
    }
}


---------Cloning Prototype for Backup---------


class GameSettings implements Cloneable {
    private int resolution;
    private boolean fullscreen;

    public GameSettings(int resolution, boolean fullscreen) {
        this.resolution = resolution;
        this.fullscreen = fullscreen;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "GameSettings{resolution=" + resolution + ", fullscreen=" + fullscreen + "}";
    }
}

// Cloning demo
public class PrototypeCloner {
    public static void main(String[] args) {
        GameSettings original = new GameSettings(1080, true);

        try {
            GameSettings copy = (GameSettings) original.clone();
            System.out.println("Original: " + original);
            System.out.println("Cloned:   " + copy);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}


---------Sensitive Data Tagging--------


interface SensitiveData {
}

// Sensitive class
class PaymentInfo implements SensitiveData {
    private String cardNumber;
    private String cvv;

    public PaymentInfo(String cardNumber, String cvv) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }

    public void encrypt() {
        System.out.println("Encrypting PaymentInfo: " + mask(cardNumber) + ", ***");
    }

    private String mask(String number) {
        if (number.length() < 4) return "";
        return "**** **** **** " + number.substring(number.length() - 4);
    }
}

// Generic processor
class SensitiveDataProcessor {
    public static void process(Object obj) {
        if (obj instanceof SensitiveData) {
            if (obj instanceof PaymentInfo) {
                ((PaymentInfo) obj).encrypt();
            } else {
                System.out.println("Sensitive object detected. Encryption required.");
            }
        } else {
            System.out.println("Object is not sensitive.");
        }
    }

    public static void main(String[] args) {
        PaymentInfo payment = new PaymentInfo("1234567890123456", "123");
        process(payment);

        String normalData = "Just a log message.";
        process(normalData);
    }
}

 */