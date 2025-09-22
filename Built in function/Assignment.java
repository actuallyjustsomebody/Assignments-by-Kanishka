/*import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

    public class Assignment {

        public static void main(String[] args) {
            ZonedDateTime now = ZonedDateTime.now();

            ZoneId gmtZone = ZoneId.of("GMT");
            ZoneId istZone = ZoneId.of("Asia/Kolkata"); // IST
            ZoneId pstZone = ZoneId.of("America/Los_Angeles"); // PST

            ZonedDateTime gmtTime = now.withZoneSameInstant(gmtZone);
            ZonedDateTime istTime = now.withZoneSameInstant(istZone);
            ZonedDateTime pstTime = now.withZoneSameInstant(pstZone);

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");

            System.out.println("Current Time for different Time Zones:");
            System.out.println("GMT (Greenwich Mean Time): " + gmtTime.format(formatter));
            System.out.println("IST (Indian Standard Time): " + istTime.format(formatter));
            System.out.println("PST (Pacific Standard Time): " + pstTime.format(formatter));
        }
    }

}

------------------------




import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Assignment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate initialDate = null;
        while (initialDate == null) {
            System.out.print("Enter a date YYYY-MM-DD: ");
            String dateInput = scanner.nextLine();
            try {
                initialDate = LocalDate.parse(dateInput);
            } catch (DateTimeParseException e) {
                System.out.println("Invalid format. Please use YYYY-MM-DD.");
            }
        }

        System.out.println("Initial Date: " + initialDate);

        LocalDate modifiedDate = initialDate.plusDays(7)
                .plusMonths(1)
                .plusYears(2);

        System.out.println("The Date after adding 7 days, 1 month, and 2 years: " + modifiedDate);

        LocalDate finalDate = modifiedDate.minusWeeks(3);

        System.out.println("The Date after subtracting 3 weeks: " + finalDate);

        scanner.close();
    }
}

------------------------

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Assignment {

    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();

        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        System.out.println("Current Date dd/MM/yyyy format: " + currentDate.format(format1));
        System.out.println("Current Date yyyy-MM-dd format: " + currentDate.format(format2));
        System.out.println("Current Date EEE, MMM dd, yyyy format: " + currentDate.format(format3));
    }
}

----------------------------------------


import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Assignment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LocalDate date1 = null;
        LocalDate date2 = null;

        while (date1 == null) {
            System.out.print("Enter the first date (YYYY-MM-DD): ");
            String dateString1 = scanner.nextLine();
            try {
                date1 = LocalDate.parse(dateString1);
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date format. Please use YYYY-MM-DD.");
            }
        }

        while (date2 == null) {
            System.out.print("Enter the second date (YYYY-MM-DD): ");
            String dateString2 = scanner.nextLine();
            try {
                date2 = LocalDate.parse(dateString2);
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date format. Please use YYYY-MM-DD.");
            }
        }

        if (date1.isBefore(date2)) {
            System.out.println("first date is before the second date.");
        } else if (date1.isAfter(date2)) {
            System.out.println("first date is after the second date.");
        } else if (date1.isEqual(date2)) {
            System.out.println("first date is the same as the second date.");
        }

        scanner.close();
    }
}


 */


