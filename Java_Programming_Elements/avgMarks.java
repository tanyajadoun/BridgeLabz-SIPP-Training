package day4;

import java.util.Scanner;

public class avgMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Marks in maths:");
        int math = sc.nextInt();
        System.out.println("marks in physics");
        int phy = sc.nextInt();
        System.out.println("marks in chemistry");
        int chem = sc.nextInt();
        avgPercent(math, phy, chem);
    }

    public static void avgPercent(int math, int phy, int chem) {
        int total = math + phy + chem;
        int avg = total / 3;
        System.out.println("Sam's avg marks in PCM is: " + avg);
    }

}
