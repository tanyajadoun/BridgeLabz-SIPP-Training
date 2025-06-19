import java.util.*;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks in Physics: ");
        int physics = sc.nextInt();

        System.out.println("Enter marks in Chemistry: ");
        int chemistry = sc.nextInt();

        System.out.println("Enter marks in Maths: ");
        int maths = sc.nextInt();

        int total = physics + chemistry + maths;
        double percentage = (total / 3.0);

        System.out.println("Total Percentage: " + percentage + "%");

        if (percentage >= 80) {
            System.out.println("Grade: A (Level 4, above agency-normalized standards)");
        } else if (percentage >= 70) {
            System.out.println("Grade: B (Level 3, at agency-normalized standards)");
        } else if (percentage >= 60) {
            System.out.println("Grade: C (Level 2, below, but approaching agency-normalized standards)");
        } else if (percentage >= 50) {
            System.out.println("Grade: D (Level 1, well below agency-normalized standards)");
        } else if (percentage >= 40) {
            System.out.println("Grade: E (Level 1-, too below agency-normalized standards)");
        } else {
            System.out.println("Grade: R (Remedial standards)");
        }
    }
}
