public class UnitConvert2 {


    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }


    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }


    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }


    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }


    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    public static void main(String[] args) {

        double yards = 10;
        double feet = UnitConvert2.convertYardsToFeet(yards);
        System.out.println(yards + " yards is equal to " + feet + " feet.");

        double feetToConvert = 15;
        double yardsConverted = UnitConvert2.convertFeetToYards(feetToConvert);
        System.out.println(feetToConvert + " feet is equal to " + yardsConverted + " yards.");

        double meters = 5;
        double inches = UnitConvert2.convertMetersToInches(meters);
        System.out.println(meters + " meters is equal to " + inches + " inches.");

        double inchesToConvert = 20;
        double metersConverted = UnitConvert2.convertInchesToMeters(inchesToConvert);
        System.out.println(inchesToConvert + " inches is equal to " + metersConverted + " meters.");

        double inchesToCm = 10;
        double cmConverted = UnitConvert2.convertInchesToCentimeters(inchesToCm);
        System.out.println(inchesToCm + " inches is equal to " + cmConverted + " centimeters.");
    }
}