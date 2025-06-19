import java.util.*;

public class length {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = sc.nextLine();

        int manualLength = findLength(input);
        int builtinLength = input.length();

        System.out.println("Length using custom method: " + manualLength);
        System.out.println("Length using built-in method: " + builtinLength);
    }

    public static int findLength(String str) {
        char[] chars = str.toCharArray();
        int count = 0;
        for (char c : chars) {
            count++;
        }
        return count;
    }
}
