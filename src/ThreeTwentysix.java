import java.util.Scanner;

public class ThreeTwentysix {

    public static void main(String[] args) {

        //Create scanner
        Scanner input = new Scanner(System.in);

        //Get integer
        System.out.println("Enter an integer: ");
        int number = input.nextInt();

        //Divisable by 4, 5?
        System.out.println("Is 10 divisable by 4 and 5? " +
                ((number % 4 == 0) && (number % 5 == 0)));
        System.out.println("Is 10 divisable by 4 or 5? " +
                ((number % 4 == 0) || (number % 5 == 0)));
        System.out.println("Is 10 divisable by 4 or 5, but not both? " +
                ((number % 4 == 0) ^ (number % 5 == 0)));
    }
}
