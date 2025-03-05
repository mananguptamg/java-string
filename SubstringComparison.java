import java.util.Scanner;

public class SubstringComparison {

    // Method to create a substring using charAt()
    public static String createSubstringUsingCharAt(String text, int start, int end) {
        StringBuilder substring = new StringBuilder();
        for (int i = start; i < end; i++) {
            substring.append(text.charAt(i)); // Append each character to build the substring
        }
        return substring.toString();
    }

    // Method to compare two strings character by character using charAt()
    public static boolean compareStringsCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false; // If lengths are different, strings are not equal
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false; // If any character is different, return false
            }
        }
        return true; // Strings are equal
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for the main string
        System.out.print("Enter the main string: ");
        String text = input.next();

        // Take user input for start and end index
        System.out.print("Enter the start index: ");
        int start = input.nextInt();

        System.out.print("Enter the end index: ");
        int end = input.nextInt();

        // Validate start and end indices
        if (start < 0 || end > text.length() || start >= end) {
            System.out.println("Enter valid start and end values.");
        } else {
            // Create substring using charAt()
            String substringCharAt = createSubstringUsingCharAt(text, start, end);

            // Create substring using built-in substring() method
            String substringBuiltIn = text.substring(start, end);

            // Compare both substrings
            boolean areEqual = compareStringsCharAt(substringCharAt, substringBuiltIn);

            // Display results
            System.out.println("Substring using charAt: " + substringCharAt);
            System.out.println("Substring using substring: " + substringBuiltIn);
            System.out.println("Both substrings equal? " + areEqual);
     	}
    }
}
