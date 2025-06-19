import java.util.*;

public class StudentScoreCard {
    public static void main(String[] args) {
        int[][] scores = generateScores(10);
        double[][] result = calculateResults(scores);
        String[] grades = calculateGrades(result);
        displayScorecard(scores, result, grades);
    }

    public static int[][] generateScores(int students) {
        Random rand = new Random();
        int[][] scores = new int[students][3];
        for (int i = 0; i < students; i++) {
            scores[i][0] = rand.nextInt(90) + 10;
            scores[i][1] = rand.nextInt(90) + 10;
            scores[i][2] = rand.nextInt(90) + 10;
        }
        return scores;
    }

    public static double[][] calculateResults(int[][] scores) {
        double[][] result = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            result[i][0] = total;
            result[i][1] = Math.round(average * 100.0) / 100.0;
            result[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return result;
    }

    public static String[] calculateGrades(double[][] result) {
        String[] grades = new String[result.length];
        for (int i = 0; i < result.length; i++) {
            double percent = result[i][2];
            if (percent >= 90) {
                grades[i] = "A";
            } else if (percent >= 75) {
                grades[i] = "B";
            } else if (percent >= 60) {
                grades[i] = "C";
            } else if (percent >= 45) {
                grades[i] = "D";
            } else if (percent >= 33) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }
        return grades;
    }

    public static void displayScorecard(int[][] scores, double[][] result, String[] grades) {
        System.out.println("S.No\tPhysics\tChemistry\tMaths\tTotal\tAverage\t\tPercentage\tGrade");
        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "\t" + scores[i][0] + "\t" + scores[i][1] + "\t\t" + scores[i][2] +
                    "\t" + (int) result[i][0] + "\t" + result[i][1] + "\t\t" + result[i][2] + "\t\t" + grades[i]);
        }
    }
}
