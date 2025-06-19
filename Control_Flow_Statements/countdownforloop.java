
import java.util.*;

public class countdownforloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        countdown(n);

    }

    public static void countdown(int n) {
        // using recursion
        // if (n == 0) {
        // return ;
        // }
        // System.out.println(n);
        // countdown(n - 1);

        // using for loop
        for (int i = n; i > 0; i--) {
            System.out.println(i);
        }
    }
}
