
import java.util.*;

public class MatrixOperations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter matrix size (2 or 3): ");
        int size = sc.nextInt();

        if (size != 2 && size != 3) {
            System.out.println("Only 2x2 or 3x3 matrices are supported.");
            return;
        }

        int[][] matrix = generateRandomMatrix(size, size);
        System.out.println("Original Matrix:");
        displayMatrix(matrix);

        int[][] transposed = transpose(matrix);
        System.out.println("\nTranspose:");
        displayMatrix(transposed);

        if (size == 2) {
            int det = determinant2x2(matrix);
            System.out.println("\nDeterminant: " + det);
            if (det != 0) {
                double[][] inverse = inverse2x2(matrix);
                System.out.println("\nInverse:");
                displayMatrix(inverse);
            } else {
                System.out.println("\nMatrix is not invertible.");
            }
        } else {
            int det = determinant3x3(matrix);
            System.out.println("\nDeterminant: " + det);
            if (det != 0) {
                double[][] inverse = inverse3x3(matrix);
                System.out.println("\nInverse:");
                displayMatrix(inverse);
            } else {
                System.out.println("\nMatrix is not invertible.");
            }
        }
    }

    public static int[][] generateRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] mat = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                mat[i][j] = rand.nextInt(10);
        return mat;
    }

    public static int[][] transpose(int[][] mat) {
        int rows = mat.length, cols = mat[0].length;
        int[][] trans = new int[cols][rows];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                trans[j][i] = mat[i][j];
        return trans;
    }

    public static int determinant2x2(int[][] mat) {
        return mat[0][0] * mat[1][1] - mat[0][1] * mat[1][0];
    }

    public static int determinant3x3(int[][] mat) {
        return mat[0][0] * (mat[1][1] * mat[2][2] - mat[1][2] * mat[2][1])
             - mat[0][1] * (mat[1][0] * mat[2][2] - mat[1][2] * mat[2][0])
             + mat[0][2] * (mat[1][0] * mat[2][1] - mat[1][1] * mat[2][0]);
    }

    public static double[][] inverse2x2(int[][] mat) {
        int det = determinant2x2(mat);
        double[][] inv = new double[2][2];
        inv[0][0] = mat[1][1] / (double)det;
        inv[0][1] = -mat[0][1] / (double)det;
        inv[1][0] = -mat[1][0] / (double)det;
        inv[1][1] = mat[0][0] / (double)det;
        return inv;
    }

    public static double[][] inverse3x3(int[][] mat) {
        int det = determinant3x3(mat);
        double[][] inv = new double[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int[][] minor = new int[2][2];
                for (int r = 0, m = 0; r < 3; r++) {
                    if (r == i) continue;
                    for (int c = 0, n = 0; c < 3; c++) {
                        if (c == j) continue;
                        minor[m][n++] = mat[r][c];
                    }
                    m++;
                }
                int cofactor = determinant2x2(minor);
                inv[j][i] = ((i + j) % 2 == 0 ? cofactor : -cofactor) / (double)det;
            }
        }

        return inv;
    }

    public static void displayMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int val : row)
                System.out.printf("%6d", val);
            System.out.println();
        }
    }

    public static void displayMatrix(double[][] mat) {
        for (double[] row : mat) {
            for (double val : row)
                System.out.printf("%8.2f", val);
            System.out.println();
        }
    }
}
