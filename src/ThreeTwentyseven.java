import java.util.Scanner;

public class ThreeTwentyseven {

    public static void main(String[] args) {

        //Create scanner
        Scanner input = new Scanner(System.in);

        //Get x and y coordinates
        System.out.println("Enter a point's x- and y-coordinates: ");

        double x = input.nextDouble();
        double y = input.nextDouble();

        //Check if the point is inside triangle
        double checkx = (-x * (200 * 100)) / (-y * 200 - x * 100);
        double checky = (-y * (200 * 100)) / (-y * 200 - x * 100);

        //Display result
        System.out.println("The point " + ((x > checkx || y > checky) ?
                "is not " : "is ") + "in the triangle");
    }
}
