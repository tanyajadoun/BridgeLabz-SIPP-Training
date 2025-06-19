
import java.util.Scanner;

public class StudentGrades {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

       
        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];
        double[] percentage = new double[n];
        char[] grade = new char[n];

      
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");

            physics[i] = getValidMarks(sc, "Physics");
            chemistry[i] = getValidMarks(sc, "Chemistry");
            maths[i] = getValidMarks(sc, "Maths");

            
            int total = physics[i] + chemistry[i] + maths[i];
            percentage[i] = (total / 300.0) * 100;

           
            grade[i] = calculateGrade(percentage[i]);
        }

       
        System.out.println("\nStudent Report:");
        System.out.printf("%-10s %-10s %-10s %-12s %-12s %-8s\n", "Physics", "Chemistry", "Maths", "Percentage", "Grade Level", "Grade");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-10d %-10d %-10d %-12.2f %-12s %-8c\n",
                physics[i], chemistry[i], maths[i], percentage[i], getGradeRemark(grade[i]), grade[i]);
        }

        sc.close();
    }

    
    public static int getValidMarks(Scanner sc, String subject) {
        int marks;
        while (true) {
            System.out.print("Enter marks in " + subject + ": ");
            marks = sc.nextInt();
            if (marks >= 0 && marks <= 100) break;
            System.out.println("Invalid marks. Please enter a value between 0 and 100.");
        }
        return marks;
    }

    
    public static char calculateGrade(double percentage) {
        if (percentage >= 80) return 'A';
        else if (percentage >= 70) return 'B';
        else if (percentage >= 60) return 'C';
        else if (percentage >= 50) return 'D';
        else if (percentage >= 40) return 'E';
        else return 'R';
    }


    public static String getGradeRemark(char grade) {
        switch (grade) {
            case 'A': return "Level 4";
            case 'B': return "Level 3";
            case 'C': return "Level 2";
            case 'D': return "Level 1";
            case 'E': return "Level 1-";
            case 'R': return "Remedial";
            default: return "Unknown";
        }
    }
}

