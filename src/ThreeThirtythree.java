import java.util.Scanner;

public class ThreeThirtythree {

    public static void main(String[] args) {


        //Create scanner
        Scanner input = new Scanner(System.in);

        //Get price and weight from user
        System.out.println("Enter weight and price for package 1: ");
        double weight1 = input.nextDouble();
        double price1 = input.nextDouble();

        System.out.println("Enter weight and price for package 2: ");
        double weight2 = input.nextDouble();
        double price2 = input.nextDouble();

        //Calculate which is cheapest
        double package1 = price1 / weight1;
        double package2 = price2 / weight2;

        if (package1 < package2)
            System.out.println("Package 1 has a better price.");
        else if (package1 > package2)
            System.out.println("Package 2 has a better price.");
        else System.out.println("Two packages have the same price.");
    }
}
