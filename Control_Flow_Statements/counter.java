import java.util.*;

public class counter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive number less than 100:");
        int number = sc.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Invalid input. Please enter a positive number less than 100.");
            return;
        }

        int counter = number;
        System.out.println("Multiples of " + number + " below 100 are:");
        while (counter < 100) {
            System.out.println(counter);
            counter += number;
        }
    }
}
