
import java.util.*;

public class kmtomiles2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double km;
        System.out.println("Enter distance in kilometers:");
        km = input.nextDouble();

        double miles = convertKmToMiles(km);
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
    }

    public static double convertKmToMiles(double km) {
        return km / 1.6;
    }
}
