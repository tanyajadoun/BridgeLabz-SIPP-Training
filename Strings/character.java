import java.util.*;
public class character {
   public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the string");
     String str=sc.next();

     System.out.println("using builtin method");
     char builtin[]=str.toCharArray();
     for(int i=0;i<builtin.length;i++){
       System.out.println(builtin[i]);
     }
      
     char customArray[]=charcter(str);
     System.out.println("using for loop"+Arrays.toString(customArray));

      boolean areEqual = compareCharArrays(builtin, customArray);
        System.out.println("Are both arrays equal? " + areEqual);
     
   }
   public static char[] charcter(String str){
    char[] result = new char[str.length()];
     for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        result[i]=ch;
        
     }
     return result;
     
   }
   public static boolean compareCharArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

}
