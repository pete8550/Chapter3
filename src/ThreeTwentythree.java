import java.util.Scanner;

public class ThreeTwentythree {

    public static void main(String[] args) {

        //Create scanner
        Scanner input = new Scanner(System.in);

        //Enter a point with two coordinates
        System.out.println("Enter a point with two coordinates: ");

        double x = input.nextDouble();
        double y = input.nextDouble();

        //Check if coordinates is within rectangle
        boolean withinRectangle =
                (Math.pow(Math.pow(x, 2), 0.5) <= 10 / 2) ||
                (Math.pow(Math.pow(y, 2), 0.5) <= 5.0 / 2);

        //Show result
        System.out.println("Point (" + x + ", " + y + ") " +
                ((withinRectangle) ? "is " : "is not ") + "in the rectangle");
    }
}
