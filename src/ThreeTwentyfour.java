public class ThreeTwentyfour {

    public static void main(String[] args) {

        //Create random card between 1 - 13
        int value = (int)((Math.random() * (14 - 1)) + 1);

        //Create random suit
        int suit = (int)(Math.random() * 4);

        //Display card from deck
        System.out.println("The card you picked is ");
        switch (value) {
            case 1: System.out.print("Ace"); break;
            case 2: System.out.print(value); break;
            case 3: System.out.print(value); break;
            case 4: System.out.print(value); break;
            case 5: System.out.print(value); break;
            case 6: System.out.print(value); break;
            case 7: System.out.print(value); break;
            case 8: System.out.print(value); break;
            case 9: System.out.print(value); break;
            case 10: System.out.print(value); break;
            case 11: System.out.print("Jack"); break;
            case 12: System.out.print("Queen"); break;
            case 13: System.out.print("King");
        }

        System.out.print(" of");
        //Display suit from deck
        switch (suit) {
            case 1: System.out.println(" Hearts"); break;
            case 2: System.out.println(" Spades"); break;
            case 3: System.out.println(" Clubs"); break;
            case 4: System.out.println(" Diamonds");
        }
    }
}
