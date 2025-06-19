import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose option: ");
        int choice = scanner.nextInt();

        System.out.print("Enter temperature: ");
        double temp = scanner.nextDouble();

        if (choice == 1) {
            System.out.printf("%.2f°C = %.2f°F%n", temp, celsiusToFahrenheit(temp));
        } else if (choice == 2) {
            System.out.printf("%.2f°F = %.2f°C%n", temp, fahrenheitToCelsius(temp));
        } else {
            System.out.println("Invalid choice.");
        }
    }

    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
}
