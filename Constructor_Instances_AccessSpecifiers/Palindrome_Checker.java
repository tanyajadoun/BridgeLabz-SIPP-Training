import java.util.Scanner;

class Palindrome_Checker {
    String text;

    void getInput(Scanner sc) {
        System.out.print("Enter text to check: ");
        text = sc.nextLine();
    }

    boolean isPalindrome() {
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equalsIgnoreCase(reversed);
    }

    void displayResult() {
        if (isPalindrome()) {
            System.out.println("\"" + text + "\" is a Palindrome.");
        } else {
            System.out.println("\"" + text + "\" is NOT a Palindrome.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Palindrome_Checker checker = new Palindrome_Checker();
        checker.getInput(sc);
        checker.displayResult();
    }
}
