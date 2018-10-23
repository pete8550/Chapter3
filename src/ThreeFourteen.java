import java.util.Scanner;

public class ThreeFourteen {

    public static void main(String[] args) {

        //Create scanner
        Scanner input = new Scanner(System.in);

        //Create coin
        int coin = (int)(Math.random() * 2);

        //Prompt user to make a guess
        System.out.println("Enter a guess, 0-head or 1-tail: ");
        int guess = input.nextInt();

        //Display result
        System.out.println(((guess == coin) ? "correct" : "incorrect") + " guess");
    }
}
