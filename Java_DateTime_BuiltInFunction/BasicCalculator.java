import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
        System.out.print("Choose operation: ");
        int choice = scanner.nextInt();

        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();

        switch (choice) {
            case 1 -> System.out.println("Result: " + add(a, b));
            case 2 -> System.out.println("Result: " + subtract(a, b));
            case 3 -> System.out.println("Result: " + multiply(a, b));
            case 4 -> {
                if (b == 0)
                    System.out.println("Cannot divide by zero.");
                else
                    System.out.println("Result: " + divide(a, b));
            }
            default -> System.out.println("Invalid operation.");
        }
    }

    public static double add(double x, double y) {
        return x + y;
    }

    public static double subtract(double x, double y) {
        return x - y;
    }

    public static double multiply(double x, double y) {
        return x * y;
    }

    public static double divide(double x, double y) {
        return x / y;
    }
}
