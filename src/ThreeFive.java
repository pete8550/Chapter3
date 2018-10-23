import java.util.Scanner;

public class ThreeFive {

    public static void main(String[] args) {

        //Create scanner
        Scanner input = new Scanner(System.in);

        //Get day and elapsed days
        System.out.println("Enter today's day: ");
        int day = input.nextInt();

        System.out.println("Enter the number of days elapsed since today: ");
        int elapsed = input.nextInt();

        //Calculate future day
        int futureDay = (day + elapsed) % 7;

        //Calulate and show days
        System.out.print("Today is ");

        switch (day) {

            case 0: System.out.print("Sunday"); break;
            case 1: System.out.print("Monday"); break;
            case 2: System.out.print("Tuesday"); break;
            case 3: System.out.print("Wednesday"); break;
            case 4: System.out.print("Thursday"); break;
            case 5: System.out.print("Friday"); break;
            case 6: System.out.print("Saturday"); break;
        }

        System.out.print(" and the future day is ");

        switch (futureDay) {

            case 0: System.out.print("Sunday"); break;
            case 1: System.out.print("Monday"); break;
            case 2: System.out.print("Tuesday"); break;
            case 3: System.out.print("Wednesday"); break;
            case 4: System.out.print("Thursday"); break;
            case 5: System.out.print("Friday"); break;
            case 6: System.out.print("Saturday");
        }
    }
}
