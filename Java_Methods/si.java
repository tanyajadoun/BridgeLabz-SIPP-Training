import java.util.*;

public class si {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount: ");
        double p = sc.nextDouble();
        System.out.println("Enter the rate of interest: ");
        double r = sc.nextDouble();
        System.out.println("Enter the time period: ");
        double t = sc.nextDouble();

        System.out.println("Simple Interest is: ");
        simpleinterest(p, r, t);
    }

    public static void simpleinterest(double p, double r, double t) {
        double si = (p * r * t) / 100;
        System.out.println(si);
    }
}
