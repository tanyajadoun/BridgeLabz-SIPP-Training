
import java.util.*;

public class trianglearea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base in inches:");
        double base = sc.nextDouble();
        System.out.println("Enter height in inches:");
        double height = sc.nextDouble();

        double areaInInches = calculateAreaInInches(base, height);
        double areaInCm = convertToCentimeter(areaInInches);

        System.out.println(
                "Area of triangle is " + areaInInches + " square inches and " + areaInCm + " square centimeters");
    }

    public static double calculateAreaInInches(double base, double height) {
        return 0.5 * base * height;
    }

    public static double convertToCentimeter(double areaInInches) {
        return areaInInches * 6.4516;
    }
}
