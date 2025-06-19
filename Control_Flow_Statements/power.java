import java.util.*;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the base");
        int b = sc.nextInt();
        System.out.println("enter the power");
        int p = sc.nextInt();
        System.out.println("power is");

        // using inbuilt function of java
        // int ans = (int) Math.pow(b, p);
        // System.out.println(ans);

        // building out own function without using for loop
        int res = powrOf(b, p);
        System.out.println("the ans is :" + res);
    }

    public static int powrOf(int b, int p) {
        if (p == 0) {
            return 1;
        } else {
            return b * powrOf(b, p - 1);
        }
    }
}
