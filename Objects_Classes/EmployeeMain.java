import java.util.*;

class Employee {
    String name;
    int id;
    double salary;

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "John";
        e.id = 101;
        e.salary = 50000.0;
        e.displayDetails();
    }
}
