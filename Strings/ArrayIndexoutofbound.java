
import java.util.*;
import java.lang.*;

public class ArrayIndexoutofbound {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        System.out.print("Enter the number of names: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }
       


        // Uncomment below line to see the uncaught exception crash the program
        // generateException(str);
        handleException(names);
        
    }
    public static void generateException(String arr[]){
 System.out.println("Accessing invalid index: " + arr[arr.length]);
    }
       
    public static void handleException(String s[]){
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

