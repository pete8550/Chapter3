import java.util.Scanner;

public class ThreeThirtyone {

    public static void main(String[] args) {


        //Create scanner
        Scanner input = new Scanner(System.in);

        //Get info
        System.out.println("Enter the exchange rate from dollars to RMB: ");
        double exchangeRate = input.nextDouble();

        System.out.println("Enter 0 to convert dollars to RMB and vice versa: ");
        int convert = input.nextInt();

        //Calculate result
        double amount;

        switch (convert) {

            case 0:
                System.out.println("Enter the dollar amount: ");
                amount = input.nextDouble();
                System.out.println("$" + amount + " is " + (amount * exchangeRate) + " yuan"); break;

            case  1:
                System.out.println("Enter the RMB amount: ");
                amount = input.nextDouble();
                System.out.println(amount + " yuan is $ " + ((int)((amount * 100) / exchangeRate)) / 100.0); break;

                default: System.out.println("Incorrect input");
        }
    }
}
