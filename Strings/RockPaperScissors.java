import java.util.*;

public class RockPaperScissors{
    static int userWins = 0;
    static int compWins = 0;
    static int draws = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rounds to play: ");
        int rounds = sc.nextInt();

        String[][] results = new String[rounds][4];

        for (int i = 0; i < rounds; i++) {
            System.out.println("\nRound " + (i + 1));
            System.out.print("Enter your choice (rock/paper/scissors): ");
            String userChoice = sc.next().toLowerCase();
            String compChoice = getComputerChoice();

            String winner = getWinner(userChoice, compChoice);
            results[i][0] = String.valueOf(i + 1);
            results[i][1] = userChoice;
            results[i][2] = compChoice;
            results[i][3] = winner;
        }

        System.out.println("\n--- Game Summary ---");
        System.out.printf("%-10s %-10s %-15s %-10s\n", "Round", "User", "Computer", "Result");
        for (int i = 0; i < rounds; i++) {
            System.out.printf("%-10s %-10s %-15s %-10s\n", results[i][0], results[i][1], results[i][2], results[i][3]);
        }

        String[][] stats = calculateStats(rounds);
        System.out.println("\n--- Win Statistics ---");
        System.out.printf("%-15s %-10s %-15s\n", "Player", "Wins", "Win %");
        System.out.printf("%-15s %-10s %-15s\n", stats[0][0], stats[0][1], stats[0][2]);
        System.out.printf("%-15s %-10s %-15s\n", stats[1][0], stats[1][1], stats[1][2]);
    }

    public static String getComputerChoice() {
        double rand = Math.random();
        if (rand < 0.33)
            return "rock";
        else if (rand < 0.66)
            return "paper";
        else
            return "scissors";
    }

    public static String getWinner(String user, String comp) {
        if (user.equals(comp)) {
            draws++;
            return "Draw";
        } else if (
                (user.equals("rock") && comp.equals("scissors")) ||
                (user.equals("scissors") && comp.equals("paper")) ||
                (user.equals("paper") && comp.equals("rock"))) {
            userWins++;
            return "User";
        } else {
            compWins++;
            return "Computer";
        }
    }

    public static String[][] calculateStats(int totalGames) {
        String[][] stats = new String[2][3];

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.format("%.2f", (userWins * 100.0 / totalGames)) + "%";

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(compWins);
        stats[1][2] = String.format("%.2f", (compWins * 100.0 / totalGames)) + "%";

        return stats;
    }
}

