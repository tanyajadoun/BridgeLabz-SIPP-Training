package day4;

import java.util.*;

public class kmtomiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of km");
        double a = sc.nextDouble();
        System.out.println("The value of miles is");
        kmtomiles(a);
    }

    public static void kmtomiles(double a) {
        double c = a * (1 / 1.6);
        System.out.println("The distance" + " " + a + " " + "km is" + " " + c);
    }
}
