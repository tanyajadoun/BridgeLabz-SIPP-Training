import java.util.*;

public class numberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check: ");
        int num = sc.nextInt();

        System.out.println("The number of digits in " + num + " is " + count(num));
        int[] arr = digits(num);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
       

        System.out.println("Is Palindrome? " + isPalindrome(num));
        System.out.println("Is Duck Number? " + isDuck(arr));
    }

    public static int count(int num) {
        int cnt = 0;
        while (num > 0) {
            num = num / 10;
            cnt++;
        }
        return cnt;
    }

    public static int[] digits(int num) {
        int[] arr = new int[count(num)];
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = num % 10;
            num = num / 10;
        }
        return arr;

    }

    public static int[] reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }

    public static boolean isequal(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(int num) {
        int reverse[] = reverse(digits(num));
        return isequal(digits(num), reverse);
    }

    
    public static boolean isDuck(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 0) {
                return true;
            }
        }
        return false;
    }
}
