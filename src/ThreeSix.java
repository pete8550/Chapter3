import java.util.Scanner;

public class ThreeSix {

    public static void main(String[] args) {

        //Create scanner
        Scanner input = new Scanner(System.in);

        //Get info
        System.out.println("Enter weight in pounds: ");
        double weight = input.nextDouble();

        System.out.println("Enter feet: ");
        double feet = input.nextDouble();

        System.out.println("Enter inches: ");
        double inches = input.nextDouble();

        //Get total height
        double height = (feet * 12) + inches;

        //Create constants
        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;

        //Compute BMI
        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        double heightInMeters = height * METERS_PER_INCH;
        double BMI = weightInKilograms / (heightInMeters * heightInMeters);

        //Show result
        System.out.println("BMI is " + BMI);

        if (BMI < 18.5)
            System.out.println("Underweight");
        else if (BMI < 25)
            System.out.println("Normal");
        else if (BMI < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }
}
