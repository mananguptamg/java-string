import java.util.Scanner;

class StudentPercentageGrade {
    // Method to generate random PCM scores for all students
    public static int[][] generateScores(int numOfStudents) {
        int[][] scores = new int[numOfStudents][3];

        for (int i = 0; i < numOfStudents; i++) {
            scores[i][0] = (int) (Math.random() * 41) + 60; // Physics (60-100)
            scores[i][1] = (int) (Math.random() * 41) + 60; // Chemistry (60-100)
            scores[i][2] = (int) (Math.random() * 41) + 60; // Maths (60-100)
        }
        return scores;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculateResults(int[][] scores) {
        int numOfStudents = scores.length;
        double[][] results = new double[numOfStudents][3]; // [Total, Average, Percentage]

        for (int i = 0; i < numOfStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0; // Rounded to 2 decimal places
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    // Method to assign grades based on percentage
    public static String[] assignGrades(double[][] results) {
        int numStudents = results.length;
        String[] grades = new String[numStudents];

        for (int i = 0; i < numStudents; i++) {
            double percentage = results[i][2];

            if (percentage >= 80) grades[i] = "A";
            else if (percentage >= 70) grades[i] = "B";
            else if (percentage >= 60) grades[i] = "C";
            else if (percentage >= 50) grades[i] = "D";
            else if (percentage >= 40) grades[i] = "E";
            else grades[i] = "R"; // Remedial attention needed
        }
        return grades;
    }

    // Method to display the scorecard
    public static void displayScorecard(int[][] scores, double[][] results, String[] grades) {
        System.out.println("\nStudent Scorecard:");
        System.out.println("+-----------+---------+---------+---------+-------+---------+-----------+--------+");
        System.out.println("| Student # | Physics | Chem.   | Maths   | Total | Average | Percentage | Grade  |");
        System.out.println("+-----------+---------+---------+---------+-------+---------+-----------+--------+");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("| %-9d | %-7d | %-7d | %-7d | %-5.0f | %-7.2f | %-9.2f | %-6s |\n",
                    (i + 1), scores[i][0], scores[i][1], scores[i][2], results[i][0], results[i][1], results[i][2], grades[i]);
        }
        System.out.println("+-----------+---------+---------+---------+-------+---------+-----------+--------+");
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numOfStudents = input.nextInt();

        // Generate random PCM scores for all students
        int[][] scores = generateScores(numOfStudents);

        // Calculate total, average, and percentage
        double[][] results = calculateResults(scores);

        // Assign grades based on percentage
        String[] grades = assignGrades(results);

        // Display the scorecard
        displayScorecard(scores, results, grades);
    }
}
