import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class naturalNum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number");
        String input = br.readLine();
        int num = Integer.parseInt(input);
        if (num < 0) {
            System.out.println("Not a Natural number");
        } else {
            System.out.println("Natural Number");
            sum(num);
        }

    }

    public static void sum(int num) {
        int sum = num * (num + 1) / 2;
        System.out.println("Sum of first " + num + " natural numbers is " + sum);
    }

}
