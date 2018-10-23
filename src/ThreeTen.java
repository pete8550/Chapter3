import java.util.Scanner;

public class ThreeTen {

    public static void main(String[] args) {

        //Create scanner
        Scanner input = new Scanner(System.in);

        //Generate two random integers
        int number1 = (int)(Math.random() * 1000);
        int number2 = (int)(Math.random() * 1000);

        //Ask the question
        System.out.println("What is " + number1 + " * " + number2 + "? ");

        int answer = input.nextInt();

        //Check result
        if (number1 * number2 == answer) {
            System.out.println("You are correct!");
        } else {
            System.out.println("Your answer is wrong.");
            System.out.println(number1 + " * " + number2 + " should be " + (number1 * number2));
        }
    }
}
