
import java.util.*;

public class table6to9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to generate its multiplication table from 6 to 9:");
        int number = sc.nextInt();
        multiply(number);

        
    }
    public static void multiply( int number) {
         int[] multiplicationResult = new int[4];
        int index = 0;

        for (int i = 6; i <= 9; i++) {
            multiplicationResult[index] = number * i;
            index++;
        }

        index = 0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[index]);
            index++;
        }
}
}

