import java.util.Scanner;

public class ThreeFifteen {

    public static void main(String[] args) {


        //Create scanner
        Scanner input = new Scanner(System.in);

        //Create random lottery number
        int lottery = (int)(Math.random() * 1000);

        //Prompt user to enter a 3-digit number
        System.out.println("Enter your lottery pick (three digits): ");
        int guess = input.nextInt();

        //Find lottery numbers
        int lotterydigit1 = lottery / 100;
        int lotterydigit2 = (lottery % 100) / 10;
        int lotterydigit3 = lottery % 10;

        //Extract digits from guess
        int guessdigit1 = guess / 100;
        int guessdigit2 = (guess % 100) / 10;
        int guessdigit3 = guess % 10;

        System.out.println("The lottery number is " + lottery);

        //Check guess
        if (guess == lottery) {
            System.out.println("Exact match: you win $10000");
        } else if ((guessdigit1 == lotterydigit2 && guessdigit2 == lotterydigit1 && guessdigit3 == lotterydigit3)
            || (guessdigit1 == lotterydigit2 && guessdigit1 == lotterydigit3 && guessdigit3 == lotterydigit1)
            || (guessdigit1 == lotterydigit3 && guessdigit2 == lotterydigit1 && guessdigit3 == lotterydigit2)
            || (guessdigit1 == lotterydigit3 && guessdigit2 == lotterydigit2 && guessdigit3 == lotterydigit1)
            || (guessdigit1 == lotterydigit1 && guessdigit2 == lotterydigit3 && guessdigit3 == lotterydigit2))
            System.out.println("Match all digits: you win $3000");
        else if (guessdigit1 == lotterydigit1 || guessdigit1 == lotterydigit2
            || guessdigit1 == lotterydigit3 || guessdigit2 == lotterydigit1
            || guessdigit2 == lotterydigit2 || guessdigit2 == lotterydigit3
            || guessdigit3 == lotterydigit1 || guessdigit3 == lotterydigit2
            || guessdigit3 == lotterydigit3)
            System.out.println("Match one digit: you win $1000");
        else
            System.out.println("Sorry, no match");
    }
}
