import java.util.*;
import java.lang.*;

public class euclideanDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coordinates of the first point: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("Enter the coordinates of the second point: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.println("The Euclidean distance between the two points is: " + distance(x1, y1, x2, y2));
        double[] equation = equationOfLine(x1, y1, x2, y2);
        System.out.println("The equation of the line is: y=" + equation[0] + "and intercept is" + equation[1]);
    }

    public static double distance(int x1, int y1, int x2, int y2) {
        double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        return distance;
    }

    public static double[] equationOfLine(int x1, int y1, int x2, int y2) {
        double[] equation = new double[2];
        double m = (y2 - y1) / (x2 - x1);
        double c = y1 - m * x1;
        equation[0] = m;
        equation[1] = c;
        return equation;

    }
}
