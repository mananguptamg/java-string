import java.util.Scanner;

class VowelsAndConsonantsUsing2DArray {
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

    // Method to analyze the string and return a 2D array of characters and their types
    public static String[][] classifyCharacters(String text) {
        int n = stringLength(text);
        String[][] result = new String[n][2];

        for (int i = 0; i < n; i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharacterType(ch);
        }
        return result;
    }

    // Method to display the 2D array in a tabular format
    public static void displayTable(String[][] data) {
        System.out.println("\nCharacter\tType");
        System.out.println("-------------------------");
        for (String[] row : data) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = input.nextLine();

        // Method to analyze the string
        String[][] result = classifyCharacters(userInput);

        displayTable(result);
    }
}
