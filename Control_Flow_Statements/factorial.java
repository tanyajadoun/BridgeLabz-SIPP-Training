import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class factorial {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number");
        String input1 = br.readLine();
        int num1 = Integer.parseInt(input1);

        System.out.println("factorial of " + num1 + " is " + fact(num1));

    }

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }

        return n * fact(n - 1);

    }
}
