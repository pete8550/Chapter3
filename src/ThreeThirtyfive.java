import java.util.Scanner;

public class ThreeThirtyfive {

    public static void main(String[] args) {


        //Create scanner
        Scanner input = new Scanner(System.in);

        //Get integer
        System.out.println("Enter an integer: ");
        int number = input.nextInt();

        //Check if number is even or odd
        System.out.print(number);

        System.out.print((number % 2 == 0) ? " is even number" : " is odd number");
    }
}
