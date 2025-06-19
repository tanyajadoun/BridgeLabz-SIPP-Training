
import java.util.*;

public class doubleOpt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three double values:");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double res1 = operation1(a, b, c);
        double res2 = operation2(a, b, c);
        double res3 = operation3(a, b, c);
        double res4 = operation4(a, b, c);

        System.out
                .println("The results of Double Operations are " + res1 + ", " + res2 + ", " + res3 + ", and " + res4);
    }

    public static double operation1(double a, double b, double c) {
        return a + b * c;
    }

    public static double operation2(double a, double b, double c) {
        return a * b + c;
    }

    public static double operation3(double a, double b, double c) {
        return c + a / b;
    }

    public static double operation4(double a, double b, double c) {
        return a % b + c;
    }
}
