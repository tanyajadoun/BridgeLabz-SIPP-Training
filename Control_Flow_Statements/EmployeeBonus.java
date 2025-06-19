import java.util.*;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee's salary: ");
        double salary = sc.nextDouble();

        System.out.println("Enter years of service: ");
        int yearsOfService = sc.nextInt();

        if (yearsOfService > 5) {
            double bonus = calculateBonus(salary);
            System.out.println("The bonus amount is INR " + bonus);
        } else {
            System.out.println("No bonus for service less than or equal to 5 years.");
        }
    }

    public static double calculateBonus(double salary) {
        return salary * 0.05;
    }
}
