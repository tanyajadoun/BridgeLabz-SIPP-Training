import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class sumOfnaturalusingloop {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number");
        String input = br.readLine();
        int num = Integer.parseInt(input);
        if (num < 0) {
            System.out.println("Not a Natural number");
        } else {
            System.out.println("It is a natural number... lets proceed to calc its sum");
            System.out.println("Sum of " + num + " natural numbers is " + sum(num));
        }

    }

    public static int sum(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum;
    }
}
