import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = getNumberOfPersons(sc);
        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        takeInput(sc, n, weight, height);
        calculateBMIandStatus(n, weight, height, bmi, status);
        displayResults(n, weight, height, bmi, status);

        sc.close();
    }

    public static int getNumberOfPersons(Scanner sc) {
        System.out.print("Enter the number of persons: ");
        return sc.nextInt();
    }

    public static void takeInput(Scanner sc, int n, double[] weight, double[] height) {
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for person " + (i + 1));
            System.out.print("Weight (kg): ");
            weight[i] = sc.nextDouble();
            System.out.print("Height (m): ");
            height[i] = sc.nextDouble();
        }
    }

    public static void calculateBMIandStatus(int n, double[] weight, double[] height, double[] bmi, String[] status) {
        for (int i = 0; i < n; i++) {
            bmi[i] = weight[i] / (height[i] * height[i]);
            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] < 25) {
                status[i] = "Normal weight";
            } else if (bmi[i] < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
    }

    public static void displayResults(int n, double[] weight, double[] height, double[] bmi, String[] status) {
        System.out.printf("%-10s %-10s %-10s %-20s\n", "Height", "Weight", "BMI", "Status");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-20s\n", height[i], weight[i], bmi[i], status[i]);
        }
    }
}
