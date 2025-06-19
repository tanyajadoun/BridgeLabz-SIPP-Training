
import java.util.*;

public class FeetTomilesyards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance in feet:");
        double feet = sc.nextDouble();

        double yards = convertToYards(feet);
        double miles = convertToMiles(yards);

        System.out.println("Your distance in yards is " + yards + " while in miles is " + miles);
    }

    public static double convertToYards(double feet) {
        return feet / 3;
    }

    public static double convertToMiles(double yards) {
        return yards / 1760;
    }
}
