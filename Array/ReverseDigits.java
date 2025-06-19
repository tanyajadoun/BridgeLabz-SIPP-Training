import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = getInput(sc);
        int[] digits = extractDigits(number);
        int[] reversed = reverseArray(digits);
        displayArray(reversed);
    }

    public static int getInput(Scanner sc) {
        System.out.print("Enter a number: ");
        return sc.nextInt();
    }

    public static int[] extractDigits(int num) {
        int temp = num, count = 0;
        while (temp > 0) {
            temp /= 10;
            count++;
        }
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }
        return digits;
    }

    public static int[] reverseArray(int[] arr) {
        int[] rev = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            rev[i] = arr[arr.length - 1 - i];
        }
        return rev;
    }

    public static void displayArray(int[] arr) {
        System.out.print("Reversed number: ");
        for (int d : arr) {
            System.out.print(d);
        }
        System.out.println();
    }
}
