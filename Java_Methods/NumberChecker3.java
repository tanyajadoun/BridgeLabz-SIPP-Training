import java.util.*;

public class NumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (isPrime(num)) System.out.println("Prime Number");
        else System.out.println("Not a Prime Number");

        if (isNeon(num)) System.out.println("Neon Number");
        else System.out.println("Not a Neon Number");

        if (isSpy(num)) System.out.println("Spy Number");
        else System.out.println("Not a Spy Number");

        if (isAutomorphic(num)) System.out.println("Automorphic Number");
        else System.out.println("Not an Automorphic Number");

        if (isBuzz(num)) System.out.println("Buzz Number");
        else System.out.println("Not a Buzz Number");
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static boolean isNeon(int n) {
        int square = n * n;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == n;
    }

    public static boolean isSpy(int n) {
        int sum = 0, prod = 1;
        while (n > 0) {
            int d = n % 10;
            sum += d;
            prod *= d;
            n /= 10;
        }
        return sum == prod;
    }

    public static boolean isAutomorphic(int n) {
        int square = n * n;
        int temp = n;
        while (n > 0) {
            if (n % 10 != square % 10) return false;
            n /= 10;
            square /= 10;
        }
        return true;
    }

    public static boolean isBuzz(int n) {
        return n % 7 == 0 || n % 10 == 7;
    }
}
