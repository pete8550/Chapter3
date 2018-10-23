import java.util.Scanner;

public class ThreeNineteen {

    public static void main(String[] args) {


        //Create scanner
        Scanner input = new Scanner(System.in);

        //Get 3 coordinates
        System.out.println("Enter coordinates for a triangle.");

        System.out.println("Enter first coordinate: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.println("Enter second coordinate: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        System.out.println("Enter third coordinate: ");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        //Check if input is valid
        boolean valid = (x1 + y1 > x3 + y3 && x2 + y2 > x3 + y3) ||
                (x1 + y1 > x2 + y2 && x3 + y3 > x2 + y2) ||
                (x3 + y3 > x1 + y1 && x2 + y2 > x1 + y1);

        if (!valid) {
            System.out.println("Input is invalid.");
        }

        //Compute the sides of the triangle
        double side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
        double side2 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
        double side3 = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);

        System.out.println("Perimeter of the triangle is " + (side1 + side2 + side3));
    }
}
