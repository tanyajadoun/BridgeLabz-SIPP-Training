import java.util.*;

public class substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter the text: ");
        String text = sc.next();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

       
        String manualSub = manualSubstring(text, start, end);
        System.out.println("Manual Substring: " + manualSub);

     
        String builtInSub = text.substring(start, end);
        System.out.println("Built-in Substring: " + builtInSub);

        // Step 4: Compare both substrings
        boolean areEqual = compare(manualSub, builtInSub);
        System.out.println("Are both substrings equal? " + areEqual);
    }

    }
    public static String manualSubstring(String s,int start,int end) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            result+=s.charAt(i);
        }
        return result;

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
