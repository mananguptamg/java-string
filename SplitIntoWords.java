import java.util.Scanner;

class SplitIntoWords {
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

    // Method to compare two string arrays
    public static boolean compareStringArray(String[] arr1, String[] arr2) {
        if(arr1.length != arr2.length) {
            return false;
        }
        for(int i=0;i<arr1.length;i++) {
            if(!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Define a variable of type String and take user input
        System.out.print("Enter a string: ");
        String userInput = input.nextLine();

        // Method to calculate the length of the string
        int length = stringLength(userInput);

        // Method to split the string into words
        String[] words = splitString(userInput, length);

        // Split the string into words using split() method
        String[] wordsUsingSplit = userInput.split(" ");

        // Display the words
        System.out.println("Words using splitString method:");
        for(String word: words) {
            System.out.print(word+", ");
        }
        System.out.println("\n");

        System.out.println("Words using split() method:");
        for(String word: wordsUsingSplit) {
            System.out.print(word+", ");
        }
        System.out.println("\n");

        // Test the method
        if(compareStringArray(words, wordsUsingSplit)) {
            System.out.println("Both methods give the same result");
        } else {
            System.out.println("Both methods give different results");
        }
    }
}
