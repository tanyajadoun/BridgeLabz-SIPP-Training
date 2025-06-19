
import java.util.*;

public class sidefromperimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the perimeter:");
        double perimeter = sc.nextDouble();

        double side = findSide(perimeter);

        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
    }

    public static double findSide(double perimeter) {
        return perimeter / 4;
    }
}
