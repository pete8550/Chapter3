import java.util.Scanner;

public class ThreeNine {

    public static void main(String[] args) {

        //Create scanner
        Scanner input = new Scanner(System.in);

        //Get first 9 digits
        System.out.println("Enter the first nine digits of an ISBN as integer: ");

        int isbnFirstNineDigits, d1, d2, d3, d4, d5, d6, d7, d8, d9, isbnLastDigit;

        isbnFirstNineDigits = input.nextInt();

        //Extract digits

        d9 = isbnFirstNineDigits % 10;
        d8 = (isbnFirstNineDigits / 10) % 10;
        d7 = (isbnFirstNineDigits / 100) % 10;
        d6 = (isbnFirstNineDigits / 1000) % 10;
        d5 = (isbnFirstNineDigits / 10000) % 10;
        d4 = (isbnFirstNineDigits / 100000) % 10;
        d3 = (isbnFirstNineDigits / 1000000) % 10;
        d2 = (isbnFirstNineDigits / 10000000) % 10;
        d1 = (isbnFirstNineDigits / 100000000) % 10;

        isbnLastDigit = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

        //Show result

        if (isbnLastDigit == 10) {
            System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + "X");
        } else
            System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + isbnLastDigit);
    }
}
