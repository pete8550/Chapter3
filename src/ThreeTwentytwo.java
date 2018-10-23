import java.util.Scanner;

public class ThreeTwentytwo {

    public static void main(String[] args) {

        //Create scanner
        Scanner input = new Scanner(System.in);

        //Get coordinates from user
        System.out.println("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        //Check if coordinates is in a circle or not
        boolean withinCircle =
                (Math.pow(Math.pow(x, 2) + Math.pow(y, 2), 0.5) <= 10);

        //Show results
        System.out.println("Point (" + x + ", "+ y + ") is " +
                ((withinCircle) ? "in " : "not in ") + "the circle");
    }
}
