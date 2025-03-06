import java.util.Scanner;

class FrequencyOfCharactersUsingNestedLoops {
    // Method to find the frequency of characters in a string using nested loops
    public static String[] characterFrequency(String s) {
        // Remove all leading, trailing and in-between spaces
        s = s.replaceAll("\\s", "");
        s = s.trim();

        char[] characters = s.toCharArray();
        int[] freq = new int[characters.length];
        int length = characters.length;

        // Initialize frequency array
        for (int i = 0; i < length; i++) {
            freq[i] = 1; // Initialize frequency to 1
            for (int j = 0; j < i; j++) {
                if (characters[i] == characters[j]) { // If duplicate found
                    freq[j]++; 
                    characters[i] = '0'; // Mark duplicate as '0' to avoid recounting
                    break;
                }
            }
        }

        // Count unique characters
        int uniqueCount = 0;
        for (char ch : characters) {
            if (ch != '0') {
                uniqueCount++;
            }
        }

        // Store characters and their frequencies in a 1D array
        String[] result = new String[uniqueCount];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (characters[i] != '0') {
                result[index] = characters[i] + " -> " + freq[i];
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
        String[] result = characterFrequency(userInput);

        // Display the frequency of characters
        System.out.println("\nCharacter Frequency:");
        System.out.println("+------------+------------+");
        System.out.println("| Character  | Frequency  |");
        System.out.println("+------------+------------+");

        for (String s : result) {
            System.out.println("| " + s);
        }
    }
}
