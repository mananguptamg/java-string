import java.util.Scanner;

class MostFrequentCharacter {
    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        // Method to find the most frequent character in a string
        char result = mostFrequentChar(str);

        System.out.println("Most frequent character in the string: " + result);
    }

    // Method to find the most frequent character in a string
    public static char mostFrequentChar(String str) {
        // Remove all leading and trailing whitespace, and in between spaces
        str = str.replaceAll("\\s", "").trim();

        int[] freq = new int[256];

        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }

        // Find the character with maximum frequency
        char mostFrequentChar = '\0';
        int maxFreq = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                mostFrequentChar = (char) i;
            }
        }

        return mostFrequentChar;
    }
}
