import java.util.*;
import java.lang.Math;

public class trigonometry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the angle in degrees: ");
        double angle = sc.nextDouble();

        double[] values = trigonometry(angle);
        System.out.printf("sin(%f) = %.6f\n", angle, values[0]);
        System.out.printf("cos(%f) = %.6f\n", angle, values[1]);
        System.out.println("tan(" + angle + ") = " + values[2]);
    }

    public static double[] trigonometry(double angle) {
        double radians = Math.toRadians(angle);
        double[] values = new double[3];
        values[0] = Math.sin(radians);
        values[1] = Math.cos(radians);
        values[2] = Math.tan(radians);
        return values;
    }
}
