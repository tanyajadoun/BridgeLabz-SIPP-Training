
import java.util.*;

public class triangularParkrun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the three sides of the triangular park in meters:");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        double perimeter = calculatePerimeter(side1, side2, side3);
        double totalRounds = calculateRounds(perimeter, 5000);

        System.out.println("The total number of rounds the athlete will run is " + totalRounds + " to complete 5 km");
    }

    public static double calculatePerimeter(double a, double b, double c) {
        return a + b + c;
    }

    public static double calculateRounds(double perimeter, double distanceMeters) {
        return distanceMeters / perimeter;
    }
}
