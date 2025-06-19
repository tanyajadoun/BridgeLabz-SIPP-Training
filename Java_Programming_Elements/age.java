package day4;

import java.util.*;

public class age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the birth year:");
        int birthyr = sc.nextInt();
        System.out.println("enter the current year");
        int curryr = sc.nextInt();

        age calcAge = new age();

        calcAge.age(birthyr, curryr);
    }

    public void age(int birthyr, int curryr) {
        int age = curryr - birthyr;
        System.out.println("harry's age in" + " " + curryr + " " + "is :");
        System.out.println(age);
    }
}
