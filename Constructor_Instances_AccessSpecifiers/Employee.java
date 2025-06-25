import java.util.Scanner;

class Employee {
    String name;
    int id;
    double salary;

    void getDetails(Scanner sc) {
        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();
        System.out.print("Enter Employee ID: ");
        id = sc.nextInt();
        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();
        sc.nextLine();
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: ₹" + salary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3; // Minimum 3 employees

        Employee[] employees = new Employee[n];

        System.out.println("Enter details of " + n + " employees:\n");

        for (int i = 0; i < n; i++) {
            System.out.println("Employee " + (i + 1));
            employees[i] = new Employee();
            employees[i].getDetails(sc);
            System.out.println();
        }

        System.out.println("\n--- Employee Records ---");
        for (int i = 0; i < n; i++) {
            employees[i].displayDetails();
        }
    }
}
