import java.util.Scanner;

class RockPaperScissors {
    // Method to get the computer's choice
    public static String getComputerChoice() {
        String[] choices = {"Rock", "Paper", "Scissors"};
        // Random number between 0-2
        int index = (int) (Math.random() * 3);
        return choices[index];
    }

    // Method to determine the winner
    public static String determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equalsIgnoreCase(computerChoice)) {
            return "Draw";
        } else if ((userChoice.equalsIgnoreCase("Rock") && computerChoice.equals("Scissors")) ||
                   (userChoice.equalsIgnoreCase("Paper") && computerChoice.equals("Rock")) ||
                   (userChoice.equalsIgnoreCase("Scissors") && computerChoice.equals("Paper"))) {
            return "User";
        } else {
            return "Computer";
        }
    }

    // Method to calculate win statistics
    public static String[][] calculateStats(int userWins, int computerWins, int totalGames) {
        double userWinPercentage = ((double) userWins / totalGames) * 100;
        double computerWinPercentage = ((double) computerWins / totalGames) * 100;

        String[][] stats = {
            {"Total Games", String.valueOf(totalGames)},
            {"User Wins", String.valueOf(userWins)},
            {"Computer Wins", String.valueOf(computerWins)},
            {"User Win %", String.format("%.2f%%", userWinPercentage)},
            {"Computer Win %", String.format("%.2f%%", computerWinPercentage)}
        };

        return stats;
    }

    // Method to display results in a table format
    public static void displayResults(String[][] results) {
        System.out.println("\nGame Results:");
        System.out.println("+------------+------------+------------+------------+");
        System.out.println("| Game No.   | User Choice | Computer Choice | Winner     |");
        System.out.println("+------------+------------+------------+------------+");

        for (String[] row : results) {
            System.out.printf("| %-10s | %-10s | %-10s | %-10s |\n", row[0], row[1], row[2], row[3]);
        }
        System.out.println("+------------+------------+------------+------------+");
    }

    // Method to display stats
    public static void displayStats(String[][] stats) {
        System.out.println("\nGame Statistics:");
        System.out.println("+----------------+------------+");
        for (String[] stat : stats) {
            System.out.printf("| %-14s | %-10s |\n", stat[0], stat[1]);
        }
        System.out.println("+----------------+------------+");
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of games: ");
        int totalGames = input.nextInt();
        input.nextLine(); // Consume the newline character

        int userWins = 0, computerWins = 0;
        String[][] results = new String[totalGames][4];

        for (int i = 0; i < totalGames; i++) {
            System.out.println("\nGame " + (i + 1));
            System.out.print("Enter your choice (Rock, Paper, Scissors): ");
            String userChoice = input.nextLine().trim();

            // Validating input
            if (!userChoice.equalsIgnoreCase("Rock") &&
                !userChoice.equalsIgnoreCase("Paper") &&
                !userChoice.equalsIgnoreCase("Scissors")) {
                System.out.println("Invalid input! Please enter Rock, Paper, or Scissors.");
                i--; // Repeat this iteration
                continue;
            }
            
            String computerChoice = getComputerChoice();
            String winner = determineWinner(userChoice, computerChoice);

            results[i][0] = String.valueOf(i + 1);
            results[i][1] = userChoice;
            results[i][2] = computerChoice;
            results[i][3] = winner;

            if (winner.equals("User")) {
                userWins++;
            } else if (winner.equals("Computer")) {
                computerWins++;
            }
        }

        String[][] stats = calculateStats(userWins, computerWins, totalGames);

        displayResults(results);
        displayStats(stats);
    }
}
