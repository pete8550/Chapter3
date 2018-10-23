import java.util.Scanner;

public class ThreeEight {

    public static void main(String[] args) {

        //Create scanner
        Scanner input = new Scanner(System.in);

        //get 3 integers
        System.out.println("Enter three integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        //Sort the numbers
        int temp;
        if (number2 < number1 || number3 < number1) {

            if (number2 < number1) {
                temp = number1;
                number1 = number2;
                number2 = temp;
            }

            if (number3 < number1) {
                temp = number1;
                number1 = number3;
                number3 = temp;
            }
        }

        if (number3 < number2) {
            temp = number2;
            number2 = number3;
            number3 = temp;
        }

        //Display numbers
        System.out.println(number1 + " " + number2 + " " + number3);
    }
}
