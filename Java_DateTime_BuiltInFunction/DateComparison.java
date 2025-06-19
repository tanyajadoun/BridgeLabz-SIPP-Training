import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy");

        System.out.print("Enter the first date (ddMMyyyy): ");
        String firstInput = scanner.nextLine();
        LocalDate date1 = LocalDate.parse(firstInput, formatter);

        System.out.print("Enter the second date (ddMMyyyy): ");
        String secondInput = scanner.nextLine();
        LocalDate date2 = LocalDate.parse(secondInput, formatter);

        if (date1.isBefore(date2)) {
            System.out.println("The first date is BEFORE the second date.");
        } else if (date1.isAfter(date2)) {
            System.out.println("The first date is AFTER the second date.");
        } else {
            System.out.println("Both dates are EQUAL.");
        }
    }
}
