import java.util.Scanner;

public class ThreeTwo {

    public static void main(String[] args) {

        //Create scanner
        Scanner input = new Scanner(System.in);

        //Create random numbers
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);
        int number3 = (int)(Math.random() * 10);

        //Ask question
        System.out.println("What is " + number1 + " * " + number2 + " * " + number3 + "? ");

        int answer = input.nextInt();

        //Show result
        System.out.println(number1 + " * " + number2 + " * " + number3 + " = " + answer + " is " +
                (number1 * number2 * number3 == answer));
    }
}
