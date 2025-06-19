import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] digits = extractDigits(number);
        int[] freq = countFrequency(digits);
        displayFrequency(freq);
    }

    public static int[] extractDigits(int num) {
        int[] temp = new int[20];
        int count = 0;
        while (num > 0) {
            temp[count++] = num % 10;
            num /= 10;
        }
        int[] digits = new int[count];
        for (int i = 0; i < count; i++) {
            digits[i] = temp[i];
        }
        return digits;
    }

    public static int[] countFrequency(int[] digits) {
        int[] freq = new int[10];
        for (int d : digits) {
            freq[d]++;
        }
        return freq;
    }

    public static void displayFrequency(int[] freq) {
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " occurs " + freq[i] + " times");
            }
        }
    }
}
