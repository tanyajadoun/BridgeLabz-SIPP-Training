import java.util.*;

public class multiply{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to print its multiplication table:");
        int number = sc.nextInt();

        int[] table = generateMultiplicationTable(number);

        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 0; i < table.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + table[i]);
        }

        sc.close();
    }

    public static int[] generateMultiplicationTable(int number) {
        int[] table = new int[10];

        for (int i = 0; i < 10; i++) {
            table[i] = number * (i + 1);
        }

        return table;
    }
}
