import java.util.Scanner;

public class ThreeEighteen {

    public static void main(String[] args) {

        //Create scanner
        Scanner input = new Scanner(System.in);

        //Get weight from customer
        System.out.println("Enter the weight of the package: ");
        double weight = input.nextDouble();

        //Calculate price
        if (weight > 20)
            System.out.println("the package cannot be shipped");
        else {

            double costPerPound;
            if (weight > 0 && weight <= 2)
                costPerPound = 2.5;
            else if (weight <= 4)
                costPerPound = 4.5;
            else if (weight <= 10)
                costPerPound = 7.5;
            else
                costPerPound = 10.5;

            System.out.println("the cost of shipping is $" + costPerPound * weight);
        }

    }
}
