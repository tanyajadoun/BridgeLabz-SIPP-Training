import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class largest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input1 = br.readLine();
        int num1 = Integer.parseInt(input1);
        String input2 = br.readLine();
        int num2 = Integer.parseInt(input2);
        String input3 = br.readLine();
        int num3 = Integer.parseInt(input3);
        System.out.println("Largest of three is :");
        largest(num1, num2, num3);

    }

    public static void largest(int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2);
        } else {
            System.out.println(num3);
        }
    }
}
