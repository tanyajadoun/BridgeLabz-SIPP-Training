import java.util.*;
public class nullpointerException {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();

        // Uncomment below line to see the uncaught exception crash the program
        // generateException();
        handleException();
    }
    
     public static void generateException() {
        String text = null;
        System.out.println("Text length: " + text.length()); // This will cause NullPointerException
    }

    
    public static void handleException() {
        String text = null;
        try {
            System.out.println("Text in uppercase: " + text.toUpperCase());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: String is null.");
        }
    }
}
