class PalindromeChecker {
    String text;

    boolean isPalindrome() {
        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }
        return text.equalsIgnoreCase(reversed);
    }

    void displayResult() {
        System.out.println("Text: " + text);
        if (isPalindrome()) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }
    }
}

public class PalindromeMain {
    public static void main(String[] args) {
        PalindromeChecker p = new PalindromeChecker();
        p.text = "Madam";
        p.displayResult();
    }
}
