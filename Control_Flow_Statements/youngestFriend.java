import java.util.*;

public class youngestFriend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Amar's age");
        int n1 = sc.nextInt();
        System.out.println("enter Amar's height");
        int h1 = sc.nextInt();
        System.out.println("enter the Akbar's age");
        int n2 = sc.nextInt();
        System.out.println("enter the Akbar's height");
        int h2 = sc.nextInt();
        System.out.println("enter the Anthony's age");
        int n3 = sc.nextInt();
        System.out.println("enter the Anthony's height");
        int h3 = sc.nextInt();
        young(n1, n2, n3, h1, h2, h3);
    }

    public static void young(int n1, int n2, int n3, int h1, int h2, int h3) {
        if (n1 < n2 && n1 < n3 && h1 > h2 && h1 > h3) {
            System.out.println("Amar is the youngest and the tallest");
        } else if (n2 < n1 && n2 < n3 && h2 > h1 && h2 > h3) {
            System.out.println("Akbar is the youngest ans the tallest");
        } else {
            System.out.println("Anthony is the youngest ans the tallest");
        }
    }
}
