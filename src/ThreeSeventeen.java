import java.util.Scanner;

public class ThreeSeventeen {

    public static void main(String[] args) {

        //Create scanner
        Scanner input = new Scanner(System.in);

        //Scissor, Rock or Paper
        System.out.println("scissor (0), rock (1), paper (2): ");
        int ownHand = input.nextInt();

        //get hand from computer
        int computer = (int)(Math.random() * 3);

        //The computer is
        System.out.print("The computer is: ");
        switch (computer) {

            case 0: System.out.println("scissor"); break;
            case 1: System.out.println("rock"); break;
            case 2: System.out.println("paper");
        }

        //You are
        System.out.print("You are: ");
        switch (ownHand) {

            case 0: System.out.println("scissor"); break;
            case 1: System.out.println("rock"); break;
            case 2: System.out.println("paper");
        }

        if (computer == ownHand)
            System.out.println("It is a draw");
        else {

            boolean win = (ownHand == 0 && computer == 2) ||
                    (ownHand == 1 && computer == 0) ||
                    (ownHand == 2 && computer == 1);
            if (win)
                System.out.println("You won");
            else
                System.out.println("You lost");
        }
    }
}
