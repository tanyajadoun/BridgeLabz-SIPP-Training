
import java.util.*;

public class Copyarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.println("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter elements of the 2D matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int[] oneDArray = convertTo1D(matrix, rows, cols);

        System.out.println("The 1D array is:");
        for (int val : oneDArray) {
            System.out.print(val + " ");
        }
        sc.close();
    }

    public static int[] convertTo1D(int[][] matrix, int rows, int cols) {
        int[] array = new int[rows * cols];
        int index = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[index] = matrix[i][j];
                index++;
            }
        }

        return array;
    }
}
