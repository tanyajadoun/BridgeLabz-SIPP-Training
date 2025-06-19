import java.util.*;

public class leadingAndTrailingSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int[] bounds = findTrimBounds(input);
        String trimmedCustom = customSubstring(input, bounds[0], bounds[1]);
        String trimmedBuiltin = input.trim();

        boolean isEqual = compareStrings(trimmedCustom, trimmedBuiltin);

        System.out.println("Trimmed using custom method: '" + trimmedCustom + "'");
        System.out.println("Trimmed using built-in method: '" + trimmedBuiltin + "'");
        System.out.println("Are both equal? " + isEqual);
    }

    public static int[] findTrimBounds(String s) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                start = i;
                break;
            }
        }

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                end = i;
                break;
            }
        }

        return new int[]{start, end};
    }

    public static String customSubstring(String s, int start, int end) {
        char[] result = new char[end - start + 1];
        int index = 0;
        for (int i = start; i <= end; i++) {
            result[index++] = s.charAt(i);
        }
        return new String(result);
    }

    public static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
