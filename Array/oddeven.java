import java.util.*;

public class oddeven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Error: Please enter a positive natural number.");
            sc.close();
            return;
        }

        int[] evenArray = new int[number / 2 + 1];
        int[] oddArray = new int[number / 2 + 1];
        int evenIndex = 0;
        int oddIndex = 0;

        classifyNumbers(number, evenArray, oddArray);

        System.out.println("Even numbers:");
        printArray(evenArray);
        
        System.out.println("Odd numbers:");
        printArray(oddArray);

        sc.close();
    }

    public static void classifyNumbers(int number, int[] evenArray, int[] oddArray) {
        int evenIndex = 0;
        int oddIndex = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenArray[evenIndex++] = i;
            } else {
                oddArray[oddIndex++] = i;
            }
        }

        // Fill the remaining spaces with -1 to indicate unused slots
        while (evenIndex < evenArray.length) {
            evenArray[evenIndex++] = -1;
        }
        while (oddIndex < oddArray.length) {
            oddArray[oddIndex++] = -1;
        }
    }

    public static void printArray(int[] arr) {
        for (int val : arr) {
            if (val != -1) {
                System.out.print(val + " ");
            }
        }
        System.out.println();
    }
}
