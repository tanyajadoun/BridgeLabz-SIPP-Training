import java.util.*;

public class Illegalargument {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String str1 = sc.next();
        // generateException(str1); //this will strop the program hence we have to comment ir out
        handleException(str1);

    }

    public static void generateException(String s) {
        System.out.println("Inside generate Exception (No handling)");
        String ans = s.substring(5,2 );
        System.out.println("substring is"+ans);
    }
    public static void handleException(String s){
        System.out.println("Inside handle Exception (with handling)");
        try{
            String ans = s.substring(5,2 );
        System.out.println("substring is"+ans);   //this will throw an error will not run

        }
        catch(Exception e){
            System.out.println("Caught an Illegal ArgumentException");

        }
        
    }
}
