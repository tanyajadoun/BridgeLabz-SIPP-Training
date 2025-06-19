
import java.util.*;

public class profitcalc {
    public static void main(String[] args) {
        int costPrice = 129;
        int sellingPrice = 191;

        int profit = calculateProfit(costPrice, sellingPrice);
        double profitPercent = calculateProfitPercentage(profit, costPrice);

        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice
                + "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercent);
    }

    public static int calculateProfit(int cp, int sp) {
        return sp - cp;
    }

    public static double calculateProfitPercentage(int profit, int cp) {
        return (profit * 100.0) / cp;
    }
}
