import java.util.*;

public class matrixManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of row");
        int m = sc.nextInt();
        System.out.println("enter the size of col");
        int n = sc.nextInt();
        // int[][] arr = new int[n][m];
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < m; j++) {
        // arr[i][j] = sc.nextInt();
        // }
        // }

        // prindting the array elements
        // for(int i=0;i<n;i++){
        // for(int j=0;j<m;j++){
        // System.out.print(arr[i][j]+" ");
        // }
        // System.out.println();
        // }

        //printing randomarray
        // int[][] randomArray = randomArray(m, n);
        // for (int i = 0; i < m; i++) {
        //     for (int j = 0; j < n; j++) {
        //         System.out.print(randomArray[i][j] + " ");
        //     }
        //     System.out.println();
        // }

         int[][] A = randomArray(2, 3);
    int[][] B = randomArray(2, 3);
    int[][] C = randomArray(3, 2);

    System.out.println("Matrix A:");
    printMatrix(A);

    System.out.println("Matrix B:");
    printMatrix(B);

    System.out.println("A + B:");
    printMatrix(addMatrix(A, B));

    System.out.println("A - B:");
    printMatrix(subtractMatrix(A, B));

    System.out.println("A x C:");
    printMatrix(multiplyMatrix(A, C));
    }

    public static int[][] randomArray(int rows, int col) {
        int[][] matrix = new int[rows][col];
        Random rand = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = rand.nextInt(10);
            }
        }
        return matrix;
    }
    public static int[][] addMatrix(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }
    public static int[][] subtractMatrix(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }
    public static int[][] multiplyMatrix(int[][] matrix1, int[][] matrix2) {
        int rowsA=matrix1.length;
        int colsA=matrix1[0].length;
        
        int colsB=matrix2[0].length;
       
        int[][] result = new int[rowsA][colsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                 for (int k = 0; k < colsA; k++) {
                result[i][j] += matrix1[i][k] * matrix2[k][j];
            }
                
            }
        }
        return result;
    }
    public static int[][] printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        return matrix;
    }
}
