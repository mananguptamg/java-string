import java.util.Scanner;

class VotingEligibility {
    // Method to generate random 2-digit ages for 'n' students
    public static int[] generateAges(int n) {
        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            ages[i] = (int) (Math.random() * 40) ; // Generates a random number between 0 and 40
        }
        return ages;
    }

    // Method to check if students can vote and return a 2D array
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] results = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            results[i][0] = String.valueOf(ages[i]);

            if (ages[i] < 0) {
                results[i][1] = "False (Invalid Age)";
            } else if (ages[i] >= 18) {
                results[i][1] = "True (Can Vote)";
            } else {
                results[i][1] = "False (Cannot Vote)";
            }
        }
        return results;
    }

    // Method to display the results in a tabular format
    public static void displayResults(String[][] results) {
        System.out.println("\nStudent Voting Eligibility:");
        System.out.println("+----------------+-------------+");
        System.out.println("| Age           | Can Vote    |");
        System.out.println("+----------------+-------------+");

        for (String[] row : results) {
            System.out.printf("| %-12s | %-11s |\n", row[0], row[1]);
        }
        System.out.println("+----------------+-------------+");
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = input.nextInt();

        // Generate random ages for 'n' students
        int[] ages = generateAges(n);

        // Check voting eligibility for each student
        String[][] results = checkVotingEligibility(ages);

        // Display the results in a tabular format
        displayResults(results);
    }
}
