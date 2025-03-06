import java.util.Scanner;

class TrimSpaces {
    // Method to find start and end indices after trimming spaces
    public static int[] findStartEndIndices(String s) {
        int start = 0, end = s.length()-1;
        while(start<=end && s.charAt(start) == ' ') {
            start++;
        }
        while(end>=start && s.charAt(end) == ' ') {
            end--;
        }
        return new int[]{start, end};
    }

    // Method to create a substring using charAt()
    public static String createSubstring(String s, int start, int end) {
        String subString = "";
        for(int i=start;i<=end;i++) {
            subString += s.charAt(i);
        }
        return subString;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        if(s1.length() != s2.length()) {
            return false;
        }
        for(int i=0;i<s1.length();i++) {
            if(s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = input.nextLine();

        // Find the start and end indices after trimming spaces
        int[] indices = findStartEndIndices(userInput);
        int start = indices[0];
        int end = indices[1];

        // Create a substring using charAt()
        String subString = createSubstring(userInput, start, end);

        // Create a substring using built-in trim() method
        String trimmedString = userInput.trim();

        // Compare the original and trimmed strings
        boolean isEqual = compareStrings(subString, trimmedString);

        // Display the original and trimmed strings
        System.out.println("Original String: " + userInput);
        System.out.println("Trimmed String: " + subString);
        System.out.println("Trimmed String using trim() method: " + trimmedString);
        System.out.println("Are the strings equal? " + isEqual);
    }
}
