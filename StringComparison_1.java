import java.util.Scanner;

public class StringComparison_1 {

    // Method to compare two strings character by character using charAt()
    public static boolean compareStringsCharAt(String str1, String str2) {
        // If lengths are different, strings cannot be equal
        if (str1.length() != str2.length()) {
            return false;
        }

        // Compare each character one by one
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false; // If any character is different, return false
            }
        }
        return true; // Strings are equal
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for two strings
        System.out.print("Enter first string: ");
        String string1 = input.next();

        System.out.print("Enter second string: ");
        String string2 = input.next();

        // Compare strings using charAt() method
        boolean charAtComparison = compareStringsCharAt(string1, string2);

        // Compare strings using built-in equals() method
        boolean equalsComparison = string1.equals(string2);

        // Display the results
        System.out.println("Comparison using charAt(): " + charAtComparison);
        System.out.println("Comparison using equals(): " + equalsComparison);

        // Verify if both methods give the same result
        if (charAtComparison == equalsComparison) {
            System.out.println("Result is same");
        } else {
            System.out.println("Result is different");
        }
    }
}
