import java.util.Scanner;

public class ThreeTwelve {

    public static void main(String[] args) {

        //Create scanner
        Scanner input = new Scanner(System.in);

        //Get integer
        System.out.println("Enter a three-digit integer: ");
        int number = input.nextInt();

        //Check for palindrome
        int digit1 = number / 100;
        int digit3 = number % 10;

        if (digit1 == digit3) {
            System.out.println(number + " is a palindrome");
        } else {
            System.out.println(number + " is not a palindrome");
        }
    }
}
