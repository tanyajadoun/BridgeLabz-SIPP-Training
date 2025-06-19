
import java.util.*;

public class universitydiscount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the student fee:");
        double fee = input.nextDouble();
        System.out.println("Enter discount percentage:");
        double discountPercent = input.nextDouble();

        double discountAmount = calculateDiscount(studentFee, discountPercent);
        double finalDiscountedFee = studentFee - discountAmount;

        System.out.printf("Discount amount is INR %.2f and final discounted fee is INR %.2f%n", discountAmount,
                finalDiscountedFee);
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }

    public static double calculateDiscount(double fee, double discountPercent) {
        return (discountPercent / 100) * fee;
    }
}
