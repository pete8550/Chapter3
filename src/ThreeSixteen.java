public class ThreeSixteen {

    public static void main(String[] args) {

        //Create random coordinates
        int width = (int)((Math.random() * (25 + 25)) - 25);
        int height = (int)((Math.random() * (75 + 75)) - 75);

        //Show result
        System.out.println("Random coordinate for the rectangle centered in (0.0) is: ");
        System.out.println(+ width + "," + height);
    }
}
