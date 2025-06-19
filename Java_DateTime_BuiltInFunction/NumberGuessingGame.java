import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int low = 1, high = 100;
        String feedback;

        System.out.println("Think of a number between 1 and 100. I will try to guess it!");

        while (true) {
            int guess = generateGuess(low, high);
            System.out.println("Is your number " + guess + "?");
            System.out.print("Enter 'low', 'high', or 'correct': ");
            feedback = scanner.nextLine().trim().toLowerCase();

            if (feedback.equals("correct")) {
                System.out.println("Yay! I guessed your number!");
                break;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            } else if (feedback.equals("high")) {
                high = guess - 1;
            } else {
                System.out.println("Invalid input. Please type 'low', 'high', or 'correct'.");
            }

            if (low > high) {
                System.out.println("Hmm... it seems there's a contradiction in the feedback!");
                break;
            }
        }
    }

    public static int generateGuess(int low, int high) {
        Random random = new Random();
        return random.nextInt(high - low + 1) + low;
    }
}
