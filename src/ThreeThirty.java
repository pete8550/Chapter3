import java.util.Scanner;

public class ThreeThirty {

    public static void main(String[] args) {

                //Create scanner
                Scanner input = new Scanner(System.in);

                //Get GMT
                System.out.println("Enter the time zone offset to GMT: ");

                int gmt = input.nextInt();

                //Calculate time
                long totalMiliseconds = System.currentTimeMillis();

                long totalSeconds = totalMiliseconds / 1000;

                long currentSecond = totalSeconds % 60;

                long totalMinutes = totalSeconds / 60;

                long currentMinute = totalMinutes % 60;

                long totalHours = totalMinutes / 60;

                long currentHour = totalHours % 24;
                currentHour = currentHour + gmt;

                //Show result
                System.out.println("The current time is: " + ((currentHour > 12) ? currentHour - 12 : currentHour)
                        + ":" + currentMinute + ":" + currentSecond + ((currentHour > 12) ? " PM" : " AM"));
            }
        }
