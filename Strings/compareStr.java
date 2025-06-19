
import java.util.*;

public class compareStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String str1 = sc.nextLine().trim();
        System.out.println("Enter the second string: ");
        String str2 = sc.next();

        boolean resultCharAt = compare(str1, str2);
        boolean resultbuiltin = str1.equals(str2);

        System.out.println("Using charAt(): " + resultCharAt);
        System.out.println("Using equals(): " + resultbuiltin);
        System.out.println("Both methods give the same result: " + (resultCharAt == resultbuiltin));
    }

    public static boolean compare(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
