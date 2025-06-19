import java.util.*;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter month (1 = Jan, 2 = Feb, ..., 12 = Dec): ");
        int m = sc.nextInt();
        System.out.println("Enter day: ");
        int d = sc.nextInt();
        System.out.println("Enter year: ");
        int y = sc.nextInt();

        if (m < 3) {
            m += 12;
            y -= 1;
        }

        int k = y % 100;
        int j = y / 100;

        int h = (d + (13 * (m + 1)) / 5 + k + k / 4 + j / 4 + 5 * j) % 7;

        int dayOfWeek = ((h + 6) % 7); // 0 = Sunday, 1 = Monday, ..., 6 = Saturday

        System.out.println("The day of the week is: " + dayOfWeek);
    }
}
