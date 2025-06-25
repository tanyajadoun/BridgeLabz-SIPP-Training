import java.util.Scanner;

class Student_report {
    String name;
    int rollNumber;
    double marks;
    String grade;

    void getDetails(Scanner sc) {
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Roll Number: ");
        rollNumber = sc.nextInt();
        System.out.print("Enter Marks (out of 100): ");
        marks = sc.nextDouble();
        sc.nextLine(); // Clear buffer
    }

    void calculateGrade() {
        if (marks >= 90)
            grade = "A";
        else if (marks >= 75)
            grade = "B";
        else if (marks >= 60)
            grade = "C";
        else if (marks >= 40)
            grade = "D";
        else
            grade = "F";
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
        System.out.println("---------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        Student_report[] students = new Student_report[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details of Student " + (i + 1));
            students[i] = new Student_report();
            students[i].getDetails(sc);
            students[i].calculateGrade();
        }

        System.out.println("\n--- Student Reports ---");
        for (Student_report s : students) {
            s.display();
        }
    }
}
