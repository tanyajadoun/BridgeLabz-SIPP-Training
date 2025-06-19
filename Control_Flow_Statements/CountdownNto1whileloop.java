import java.util.*;

public class CountdownNto1whileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        countdown(n);

    }

    public static void countdown(int n) {
        // if (n == 0) {
        // return ;
        // }
        // System.out.println(n);
        // countdown(n - 1);
        // using while loop
        while (n > 0) {
            System.out.println(n);
            n--;
        }
    }
}
