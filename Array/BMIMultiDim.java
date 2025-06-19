import java.util.Scanner;

public class BMIMultiDim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[][] personData = new double[n][3];
        String[] status = new String[n];

        takeInput(sc, n, personData);
        calculateBMI(n, personData, status);
        displayResults(n, personData, status);
    }

    public static void takeInput(Scanner sc, int n, double[][] data) {
        for (int i = 0; i < n; i++) {
            data[i][0] = sc.nextDouble();
            data[i][1] = sc.nextDouble();
        }
    }

    public static void calculateBMI(int n, double[][] data, String[] status) {
        for (int i = 0; i < n; i++) {
            data[i][2] = data[i][0] / (data[i][1] * data[i][1]);
            if (data[i][2] < 18.5)
                status[i] = "Underweight";
            else if (data[i][2] < 25)
                status[i] = "Normal";
            else if (data[i][2] < 30)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }
    }

    public static void displayResults(int n, double[][] data, String[] status) {
        for (int i = 0; i < n; i++) {
            System.out.printf("Height: %.2f, Weight: %.2f, BMI: %.2f, Status: %s\n", data[i][1], data[i][0], data[i][2], status[i]);
        }
    }
}
