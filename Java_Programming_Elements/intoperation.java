
import java.util.*;

public class intoperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three integer values:");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int res1 = operation1(a, b, c);
        int res2 = operation2(a, b, c);
        int res3 = operation3(a, b, c);
        int res4 = operation4(a, b, c);

        System.out.println("The results of Int Operations are " + res1 + ", " + res2 + ", " + res3 + ", and " + res4);
    }

    public static int operation1(int a, int b, int c) {
        return a + b * c;
    }

    public static int operation2(int a, int b, int c) {
        return a * b + c;
    }

    public static int operation3(int a, int b, int c) {
        return c + a / b;
    }

    public static int operation4(int a, int b, int c) {
        return a % b + c;
    }
}
