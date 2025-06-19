public class FactorTasks {
    public static void main(String[] args) {
        int num = 12;
        int[] factors = findFactors(num);
        System.out.println("Greatest Factor: " + greatestFactor(factors));
        System.out.println("Sum of Factors: " + sumOfFactors(factors));
        System.out.println("Product of Factors: " + productOfFactors(factors));
        System.out.println("Product of Cubes of Factors: " + productOfCubes(factors));
    }

    public static int[] findFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }
        int[] arr = new int[count];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) arr[index++] = i;
        }
        return arr;
    }

    public static int greatestFactor(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }

    public static int sumOfFactors(int[] arr) {
        int sum = 0;
        for (int x : arr) sum += x;
        return sum;
    }

    public static int productOfFactors(int[] arr) {
        int prod = 1;
        for (int x : arr) prod *= x;
        return prod;
    }

    public static double productOfCubes(int[] arr) {
        double prod = 1;
        for (int x : arr) prod *= Math.pow(x, 3);
        return prod;
    }
}
