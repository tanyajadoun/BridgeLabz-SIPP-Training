import java.util.*;

public class StoreAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] values = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {
            System.out.println("Enter a number (0 or negative to stop):");
            double number = sc.nextDouble();

            if (number <= 0 || index == 10) {
                break;
            }

            values[index] = number;
            index++;
        }

        System.out.println("The numbers entered are:");
        for (int i = 0; i < index; i++) {
            System.out.print(values[i] + " ");
            total += values[i];
        }

        System.out.println("\nThe total sum is: " + total);
        sc.close();
    }
}

