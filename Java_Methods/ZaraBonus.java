import java.util.*;

public class ZaraBonus {
    public static void main(String[] args) {
        int[][] data = generateEmployeeData(10);
        int[][] result = calculateBonus(data);
        calculateAndDisplaySums(data, result);
    }

    public static int[][] generateEmployeeData(int n) {
        int[][] data = new int[n][2];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            data[i][0] = 10000 + rand.nextInt(90000); // salary
            data[i][1] = 1 + rand.nextInt(10); // years of service
        }
        return data;
    }

    public static int[][] calculateBonus(int[][] data) {
        int[][] result = new int[data.length][2];
        for (int i = 0; i < data.length; i++) {
            int salary = data[i][0];
            int years = data[i][1];
            double bonusRate = years > 5 ? 0.05 : 0.02;
            int bonus = (int) Math.round(salary * bonusRate);
            int newSalary = salary + bonus;
            result[i][0] = newSalary;
            result[i][1] = bonus;
        }
        return result;
    }

    public static void calculateAndDisplaySums(int[][] oldData, int[][] newData) {
        int totalOld = 0, totalNew = 0, totalBonus = 0;
        System.out.printf("%-10s%-15s%-15s%-15s%-15s\n", "EmpID", "Old Salary", "Service Yrs", "New Salary", "Bonus");
        for (int i = 0; i < oldData.length; i++) {
            int oldSal = oldData[i][0];
            int yrs = oldData[i][1];
            int newSal = newData[i][0];
            int bonus = newData[i][1];
            totalOld += oldSal;
            totalNew += newSal;
            totalBonus += bonus;
            System.out.printf("%-10d%-15d%-15d%-15d%-15d\n", (i + 1), oldSal, yrs, newSal, bonus);
        }
        System.out.println("Total Old Salary: " + totalOld);
        System.out.println("Total New Salary: " + totalNew);
        System.out.println("Total Bonus Paid: " + totalBonus);
    }
}
