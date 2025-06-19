
import java.util.*;

public class discount {
    public static void main(String[] args) {
        double fee = 125000;
        double discountPercent = 10;

        double discount = calculateDiscount(fee, discountPercent);
        double finalFee = fee - discount;

        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }

    public static double calculateDiscount(double fee, double discountPercent) {
        return (discountPercent / 100) * fee;
    }
}
