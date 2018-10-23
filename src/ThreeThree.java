import java.util.Scanner;

public class ThreeThree {

    public static void main(String[] args) {


        //Create scanner
        Scanner input = new Scanner(System.in);

        //get numbers
        System.out.println("Enter a, b, c, d, e, f: ");

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        //Calculate and show result
        if (a * d - b * c == 0) {

            System.out.println("The equation has no solution");
        }

        else {

            double x = (e * d - b * f) / (a * d - b * c);
            double y = (a * f - e * c) / (a * d - b * c);

            System.out.println("x is " + x + " and y is " + y);
        }
    }
}
