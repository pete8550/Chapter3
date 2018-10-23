import java.util.Scanner;

public class ThreeTwentynine {

    public static void main(String[] args) {

        //Create scanner
        Scanner input = new Scanner(System.in);

        //Get info
        System.out.println("Enter circle1's center x-, y-coordinates, and radius: ");
        double c1x = input.nextDouble();
        double c1y = input.nextDouble();
        double c1r = input.nextDouble();

        System.out.println("Enter circle2's center x-, y-coordinates, and radius: ");
        double c2x = input.nextDouble();
        double c2y = input.nextDouble();
        double c2r = input.nextDouble();

        //Check possible outcome
        if (Math.pow(Math.pow(c2x - c1x, 2) + Math.pow(c2y - c1y, 2), 0.5) <= Math.abs(c1r - c2r))
        System.out.println("Circle2 is inside circle1");

        else if (Math.pow(Math.pow(c2x - c1x, 2) + Math.pow(c2y - c1y, 2), 0.5) <= c1r + c2r)
        System.out.println("Circle2 overlaps circle1");

        else System.out.println("Circle2 does not overlap circle1");
    }
}
