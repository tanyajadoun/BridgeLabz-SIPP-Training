import java.util.Scanner;

public class GCD_LCM {
    public static void main(String[] args) {
        int[] numbers = getInput();
        int gcd = findGCD(numbers[0], numbers[1]);
        int lcm = findLCM(numbers[0], numbers[1], gcd);
        displayResult(numbers[0], numbers[1], gcd, lcm);
    }

    public static int[] getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        return new int[] { a, b };
    }

    public static int findGCD(int a, int b) {
        if (b == 0)
            return a;
        return findGCD(b, a % b);
    }

    public static int findLCM(int a, int b, int gcd) {
        return (a * b) / gcd;
    }

    public static void displayResult(int a, int b, int gcd, int lcm) {
        System.out.println("GCD of " + a + " and " + b + ": " + gcd);
        System.out.println("LCM of " + a + " and " + b + ": " + lcm);
    }
}
