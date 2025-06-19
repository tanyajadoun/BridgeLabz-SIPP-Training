import java.util.*;

public class divideChocolates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of chocolates");
        int n = sc.nextInt();
        System.out.println("enter the number of students");
        int s = sc.nextInt();

        int[] arr = findremandQuo(n, s);
        System.out.println("Chocolates left is " + arr[0] + " and each student got " + arr[1] + "\tchocolates");

    }

    public static int[] findremandQuo(int chocolates, int students) {
        int a = chocolates / students;
        int b = chocolates % students;
        int[] arr = new int[2];
        arr[0] = b;
        arr[1] = a;
        return arr;
    }
}
