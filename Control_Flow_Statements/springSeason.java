import java.util.*;

public class springSeason {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month: ");
        int month = sc.nextInt();
        System.out.println("enter the day");
        int day = sc.nextInt();
        springSeason obj = new springSeason();
        obj.springseason(month, day);
    }

    public void springseason(int month, int day) {
        if ((month == 3 && day >= 20 && day <= 31) ||
                (month == 4 && day >= 1 && day <= 30) ||
                (month == 5 && day >= 1 && day <= 31) ||
                (month == 6 && day >= 1 && day <= 20)) {
            System.out.println("spring season");
        } else {
            System.out.println("not spring season");
        }
    }
}
