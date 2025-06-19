import java.util.*;

public class ctofcovert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the celcius value");
        int c = sc.nextInt();
        System.out.println("celcius to fahrenheit : ");
        celtofar(c);
    }

    public static void celtofar(int c) {
        int f = (c * 9 / 5) + 32;
        System.out.println(f);
    }
}
