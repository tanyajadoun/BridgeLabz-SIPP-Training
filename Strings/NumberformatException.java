import java.util.*;
import java.lang.*;

public class NumberformatException {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();

        // Uncomment below line to see the uncaught exception crash the program
        // generateException(str);
        handleException(str);
        
    }
    public static void generateException(String s){
        int num=Integer.parseInt(s);
       System.out.println("Parsed number: " + num);
    }
    public static void handleException(String s){
         try{
            generateException(s);
        }
        catch(NumberFormatException e){
            System.out.println("Invalid input"+e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }
}

