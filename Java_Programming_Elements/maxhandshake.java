package day4;

import java.util.Scanner;

public class maxhandshake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of people: ");
        int n = sc.nextInt();
        System.out.println("Maximum number of handshakes: " + maxhandshake(n));
    }

    public static int maxhandshake(int n) {
        if (n <= 1) {
            return 0;
        }
        return (n * (n - 1)) / 2;
    }
}
