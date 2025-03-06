import java.util.Scanner;

class FrequencyOfCharacters {
    // Method to find the frequency of characters in a string
    public static String[][] characterFrequency(String s) {
        int[] freq = new int[256]; // Array to store frequency of characters (ASCII 0-255)

        // Remove all the between spaces and leading and trailing spaces
        s = s.replaceAll("\\s", "");
        s = s.trim();

        // Count frequency of each character
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch]++; // Increment frequency
        }

        // Count unique characters
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                uniqueCount++;
            }
        }

        // Store characters and their frequencies in a 2D array
        String[][] result = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = Character.toString((char) i); // Store character
                result[index][1] = Integer.toString(freq[i]); // Store frequency
                index++;
            }
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = input.nextLine();

        // Find the frequency of characters
        String[][] result = characterFrequency(userInput);

        // Display the frequency of characters
        System.out.println("\nCharacter Frequency:");
        System.out.println("+------------+------------+");
        System.out.println("| Character  | Frequency  |");
        System.out.println("+------------+------------+");

        for (int i = 0; i < result.length; i++) {
            System.out.printf("| %-10s | %-10s |\n", result[i][0], result[i][1]);
        }

        System.out.println("+------------+------------+");
    }
}
