import java.util.*;

public class greatestFactor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        greatestFactor obj = new greatestFactor();
        obj.greaterfactor(num);
    }

    public void greaterfactor(int num) {
        int greatestFactor = 1;
        for (int i = num - 1; i >= 1; i--) {
            if (num % i == 0) {
                greatestFactor = i;
                break;
            }
        }
        System.out.println("The greatest factor of " + num + " is " + greatestFactor);
    }
}
