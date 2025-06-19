
import java.util.*;

public class pendistribution {
    public static void main(String[] args) {
        int totalPens = 14;
        int totalStudents = 3;

        int pensPerStudent = calculatePensPerStudent(totalPens, totalStudents);
        int remainingPens = calculateRemainingPens(totalPens, totalStudents);

        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is "
                + remainingPens);
    }

    public static int calculatePensPerStudent(int pens, int students) {
        return pens / students;
    }

    public static int calculateRemainingPens(int pens, int students) {
        return pens % students;
    }
}
