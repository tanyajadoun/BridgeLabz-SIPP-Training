import java.util.Scanner;

public class posNegZero {

    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        analyzeNumbers(numbers);
        compareFirstAndLast(numbers);

        sc.close();
    }

    // Function to analyze each number
    public static void analyzeNumbers(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println("Number at index " + i + " is Positive and Even: " + num);
                } else {
                    System.out.println("Number at index " + i + " is Positive and Odd: " + num);
                }
            } else if (num < 0) {
                System.out.println("Number at index " + i + " is Negative: " + num);
            } else {
                System.out.println("Number at index " + i + " is Zero");
            }
        }
    }

    // Function to compare first and last element
    public static void compareFirstAndLast(int[] arr) {
        int first = arr[0];
        int last = arr[arr.length - 1];

        System.out.print("Comparison between first and last element: ");
        if (first == last) {
            System.out.println("Both are equal (" + first + ")");
        } else if (first > last) {
            System.out.println("First element (" + first + ") is greater than last element (" + last + ")");
        } else {
            System.out.println("First element (" + first + ") is less than last element (" + last + ")");
        }
    }
}
