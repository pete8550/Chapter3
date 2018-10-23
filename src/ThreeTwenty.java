import java.util.Scanner;

public class ThreeTwenty {

    public static void main(String[] args) {

                //Create scanner
                Scanner input = new Scanner(System.in);

                //Get info
                System.out.println("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
                double temperature = input.nextDouble();

                System.out.println("Enter the wind speed (>=2) in miles per hour: ");
                double wind = input.nextDouble();

                //Check if data is valid
                if (temperature <= -58 || temperature >= 41 || wind < 2) {
                    System.out.print("The ");

                    if (temperature <= -58 || temperature >= 41)
                        System.out.print("temperature ");
                    if ((temperature <= -58 || temperature >= 41) && wind < 2)
                        System.out.print("and ");
                    if (wind < 2)
                        System.out.print("wind speed ");
                    System.out.println("is invalid");
                    System.exit(1);
                }

                //Calculate Wind Chill Index
                double WCI = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(wind, 0.16) +
                        0.4275 * temperature * Math.pow(wind, 0.16);

                //Show result
                System.out.println("The wind chill index is " + WCI);
            }
        }



