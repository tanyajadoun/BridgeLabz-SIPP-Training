import java.util.Scanner;

public class FibonacciGenerator {
    public static void main(String[] args) {
        int terms = getInput();
        generateFibonacci(terms);
    }

    public static int getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        return scanner.nextInt();
    }

    public static void generateFibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Sequence: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = b;
            b = a + b;
            a = temp;
        }
        System.out.println();
    }
}
