import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fizzbuzz {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the number");
        String input = br.readLine();
        int n = Integer.parseInt(input);
        fizzbuzz(n);

    }

    public static void fizzbuzz(int n) {
        if (n >= 0) {
            for (int i = 1; i < n; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("fizzbuzz");
                } else if (i % 3 == 0) {
                    System.out.println("fizz");
                } else if (i % 5 == 0) {
                    System.out.println("buzz");
                } else {
                    System.out.println(i);
                }
            }
        }
    }
}
