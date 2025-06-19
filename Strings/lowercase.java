import java.util.*;

public class lowercase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String s=sc.nextLine();
        
        
        String builtin=s.toLowerCase();
        System.out.println("Conversion using builtin lowercase method:"+builtin);

         System.out.println("Conversion using custom method:");
         convert(s);
    }
    public static String convert(String str){
        String result="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
                result+=(char)(str.charAt(i)+32);  //A=65 and a=97 the difference is 32
            }
          else{
            result+=str.charAt(i);
          }
        }
        return result;

    }
    public static boolean compareUsingCharAt(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
