import java.util.*;
import java.lang.Math;

public class scoreCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int n = sc.nextInt();

        int[][] pcmScores = new int[n][3]; 
        int[][] result = new int[n][3]; 

       
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");
            System.out.print("Physics: ");
            int physics = sc.nextInt();
            System.out.print("Chemistry: ");
            int chemistry = sc.nextInt();
            System.out.print("Maths: ");
            int maths = sc.nextInt();

            pcmScores[i][0] = physics;
            pcmScores[i][1] = chemistry;
            pcmScores[i][2] = maths;

            int[][] calc = calcScore(physics, chemistry, maths);
            result[i][0] = calc[0][0]; 
            result[i][1] = calc[0][1]; 
            result[i][2] = calc[0][2];
        }

        
        System.out.printf("\n%-10s%-10s%-10s%-10s%-10s%-10s%-10s\n",
            "Student", "Physics", "Chem", "Maths", "Total", "Average", "Percent");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-10d%-10d%-10d%-10d%-10d%-10d%-10d\n",
                    (i + 1),
                    pcmScores[i][0],
                    pcmScores[i][1],
                    pcmScores[i][2],
                    result[i][0],
                    result[i][1],
                    result[i][2]);
        }
    }

    public static int[][] calcScore(int physics, int chemistry, int maths) {
        int total = physics + chemistry + maths;
        int avg = Math.round(total / 3.0f);
        int percentage = Math.round((total * 100.0f) / 300);

        int[][] arr = new int[1][3];
        arr[0][0] = total;
        arr[0][1] = avg;
        arr[0][2] = percentage;
        return arr;
    }
}
