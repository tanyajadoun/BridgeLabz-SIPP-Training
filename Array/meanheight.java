
import java.util.*;

public class meanheight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] heights = new double[11];

        System.out.println("Enter the height of 11 football players (in cm):");
        for (int i = 0; i < heights.length; i++) {
            heights[i] = sc.nextDouble();
        }

        double mean = calculateMean(heights);
        System.out.println("The mean height of the football players is: " + mean + " cm");

        sc.close();
    }

    public static double calculateMean(double[] heights) {
        double sum = 0;
        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }
        return sum / heights.length;
    }
}

