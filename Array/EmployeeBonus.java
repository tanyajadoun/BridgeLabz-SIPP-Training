import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] salary = new double[10];
        double[] years = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter data for Employee " + (i + 1));
            System.out.print("Salary: ");
            double sal = sc.nextDouble();
            System.out.print("Years of Service: ");
            double yrs = sc.nextDouble();

            if (sal < 0 || yrs < 0) {
                System.out.println("Invalid input. Re-enter data.");
                i--;
                continue;
            }

            salary[i] = sal;
            years[i] = yrs;
        }

        for (int i = 0; i < 10; i++) {
            if (years[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }
            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("\nZara Bonus Report:");
        System.out.printf("%-10s %-10s %-10s %-10s\n", "Salary", "Years", "Bonus", "New Salary");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-10.2f\n", salary[i], years[i], bonus[i], newSalary[i]);
        }

        System.out.printf("\nTotal Bonus Paid: %.2f\n", totalBonus);
        System.out.printf("Total Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);
        sc.close();
    }
}
