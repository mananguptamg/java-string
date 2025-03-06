
import java.util.Scanner;

class VowelsAndConsonants {
    // Method to calculate the length of the String
    public static int stringLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count); // Try to access the character at index 'count'
                count++; // Increment the counter if possible.
            }
        } catch (IndexOutOfBoundsException e) {
            // Exception occurs when we go beyond the last index, so return count
        }
        return count;
    }

    // Method to check if a character is a vowel, consonant, or not a letter
    public static String checkCharacterType(char ch) {
        // Convert to lowercase if uppercase
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        // Check if it's a vowel
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        }
        // Check if it's a consonant (a letter but not a vowel)
        else if (ch >= 'a' && ch <= 'z') {
            return "Consonant";
        }
        // Not a letter
        return "Not a Letter";
    }

    // Method to count vowels and consonants in a string
    public static int[] countVowelsAndConsonants(String text) {
        int vowels = 0, consonants = 0;
        int n = stringLength(text);

        for (int i = 0; i < n; i++) {
            String type = checkCharacterType(text.charAt(i));
            if (type.equals("Vowel")) {
                vowels++;
            } else if (type.equals("Consonant")) {
                consonants++;
            }
        }
        return new int[]{vowels, consonants}; // Returning count in an array
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Define a variable of type String and take user input
        System.out.print("Enter a string: ");
        String userInput = input.nextLine();

        // Method to count vowels and consonants
        int[] count = countVowelsAndConsonants(userInput);

        // Display the count of vowels and consonants
        System.out.println("Number of vowels: " + count[0]);
        System.out.println("Number of consonants: " + count[1]);
    }
}
