import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class posNegZero {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number");
        String num = br.readLine();
        int num1 = Integer.parseInt(num);

        posnegzero(num1);
    }

    public static void posnegzero(int num) {
        if (num < 0) {
            System.out.println("The number is negative");
        } else if (num > 0) {
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is zero");
        }
    }
}
