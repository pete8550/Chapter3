import java.util.Scanner;

public class ThreeSeven {

    public static void main(String[] args) {

        //Create scanner
        Scanner input = new Scanner(System.in);

        //Recieve the amount
        System.out.println("Enter an amount in double, for example 11.56: ");
        double amount = input.nextDouble();

        int remainingAmount = (int)(amount * 100);

        //Find the number of one dollars
        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        //Find the number of quarters in the remaining amount
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        //Find the number of dimes in the remaining amount
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        //Find the number of nickles in the remaining amount
        int numberOfNickles = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        //Find the number of pennies in the remaining amount
        int numberOfPennies = remainingAmount;

        //Display result
        System.out.println("Your amount " + amount + " consists of");
        System.out.println("  " + numberOfOneDollars +
                (numberOfOneDollars == 1 ? " dollar" : " dollars"));
        System.out.println("  " + numberOfQuarters +
                (numberOfQuarters == 1 ? " quarter" : " quarters"));
        System.out.println("  " + numberOfDimes +
                (numberOfDimes == 1 ? " dime" : " dimes"));
        System.out.println("  " + numberOfNickles +
                (numberOfNickles == 1 ? " nickel" : " nickels"));
        System.out.println("  " + numberOfPennies +
                (numberOfPennies == 1 ? " pennie" : " pennies"));
    }
}
