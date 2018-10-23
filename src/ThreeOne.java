import java.util.Scanner;

public class ThreeOne {

    public static void main(String[] args) {

        //Create scanner
        Scanner input = new Scanner(System.in);

        //Get variables
        System.out.println("Enter a, b, c: ");

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        //Calculate discriminant
        double d = Math.pow(b, 2) - (4 * a * c);

        //If statements
        if (d > 0) {

            double r1 = (-b + Math.pow(d, 0.5)) / 2 * a;
            double r2 = (-b - Math.pow(d, 0.5)) / 2 * a;
            System.out.println("The equation has two roots " + r1 + " and " + r2);
        }

        else if (d == 0) {

            double x = -b / 2 * a;
            System.out.println("The equation has one root " + x);
        }

        else {

            System.out.println("The equation has no real roots");
        }
    }
}
