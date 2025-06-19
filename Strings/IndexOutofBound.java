import java.util.*;

public class IndexOutofBound {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str= sc.next();
       
    }
    public static void generateException(String s){
          System.out.println("Inside generateException(no handling");
          char charAt = s.charAt(s.length() + 1);
       
    }
    public static void handlingexception(String s){
        System.out.println("Inside handlingexception");
        try{
            generateException(s);
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("Index out of bound"+ e.getMessage());
        }
         catch(RuntimeException e){
            System.out.println("Runtime exception"+ e.getMessage());
         }
    }
}
