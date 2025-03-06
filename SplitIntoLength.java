import java.util.Scanner;
class SplitWithLength {
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

    // Method to split the string into words using charAt method
    public static String[] splitString(String s, int length) {
        // calculate the number of words in the String
        int wordCount = 0;
        for(int i=0;i<length;i++) {
            if(s.charAt(i) == ' ') {
                wordCount++;
            }
        }
        wordCount++; // For the last word

        // Create an array to store the indices of spaces
        int[] spaces = new int[wordCount];
        int j = 0;
        for(int i=0;i<length;i++) {
            if(s.charAt(i) == ' ') {
                spaces[j++] = i;
            }
        }
        spaces[j] = length;

        // Create an array to store the words
        String[] words = new String[wordCount];
        int start = 0;
        for(int i=0;i<wordCount;i++) {
            String word = "";
            for(int k=start;k<spaces[i];k++) {
                word += s.charAt(k);
            }
            words[i] = word;
            start = spaces[i]+1;
        }
        return words;
    }

    // Method to create a 2D array with words and their corresponding lengths
    public static String[][] create2DArray(String[] words) {
        String[][] wordLengths = new String[words.length][2];
        for(int i=0;i<words.length;i++) {
            wordLengths[i][0] = words[i];
            wordLengths[i][1] = String.valueOf(stringLength(words[i]));
        }
        return wordLengths;
    }

    // Method to display the words and their lengths in a tabular format
    public static void displayTable(String[][] wordLengths) {
        System.out.println("\nWord\t\tLength");
        System.out.println("-------------------");
        for (String[] row : wordLengths) {
            System.out.println(row[0] + "\t\t" + Integer.parseInt(row[1]));
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Define a variable of type String and take user input
        System.out.print("Enter a string: ");
        String userInput = input.nextLine();

        // Calculate the length of the string
        int length = stringLength(userInput);

        // Split the string into words
        String[] words = splitString(userInput, length);

        // Create a 2D array with words and their corresponding lengths
        String[][] wordLengths = create2DArray(words);

        // Display the words and their lengths in a tabular format
        displayTable(wordLengths);
    }
}
