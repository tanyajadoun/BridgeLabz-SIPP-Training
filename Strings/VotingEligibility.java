import java.util.*;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = generateStudentAges(10);
        String[][] result = checkVotingEligibility(ages);
        displayResult(result);
    }

    public static int[] generateStudentAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(90) + 10; // generates random 2-digit age (10 to 99)
        }
        return ages;
    }

    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            result[i][0] = String.valueOf(age);
            if (age < 0) {
                result[i][1] = "false";
            } else if (age >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }
        return result;
    }

    public static void displayResult(String[][] result) {
        System.out.println("Age\tCan Vote");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t" + Boolean.parseBoolean(result[i][1]));
        }
    }
}
