import java.util.*;

public class NumberChecker2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (isPerfect(num))
            System.out.println("Perfect Number");
        else
            System.out.println("Not a Perfect Number");

        if (isAbundant(num))
            System.out.println("Abundant Number");
        else
            System.out.println("Not an Abundant Number");

        if (isDeficient(num))
            System.out.println("Deficient Number");
        else
            System.out.println("Not a Deficient Number");

        if (isStrong(num))
            System.out.println("Strong Number");
        else
            System.out.println("Not a Strong Number");
    }

    public static boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                sum += i;
        }
        return sum == n;
    }

    public static boolean isAbundant(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                sum += i;
        }
        return sum > n;
    }

    public static boolean isDeficient(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                sum += i;
        }
        return sum < n;
    }

    public static boolean isStrong(int n) {
        int sum = 0, temp = n;
        while (temp > 0) {
            int d = temp % 10;
            sum += factorial(d);
            temp /= 10;
        }
        return sum == n;
    }

    public static int factorial(int n) {
        int f = 1;
        for (int i = 2; i <= n; i++) {
            f *= i;
        }
        return f;
    }
}
