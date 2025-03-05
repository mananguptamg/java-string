import java.util.Scanner;

public class CharacterArray {

    // Method to return all characters in a string without using toCharArray()
    public static char[] getCharactersManually(String text) {
        int length = text.length();
        char[] characters = new char[length];

        for (int i = 0; i < length; i++) {
            characters[i] = text.charAt(i); // Extract each character using charAt()
        }
        return characters;
    }

    // Method to compare two character arrays
    public static boolean compareCharArrays(char[] array1, char[] array2) {
        if (array1.length != array2.length) {
            return false; // If lengths differ, arrays are not equal
        }

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false; // If any character differs, return false
            }
        }
        return true; // Arrays are identical
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string: ");
        String text = input.next();

        // Get characters using manual method
        char[] manualChars = getCharactersManually(text);

        // Get characters using built-in toCharArray() method
        char[] builtInChars = text.toCharArray();

        // Compare both character arrays
        boolean areEqual = compareCharArrays(manualChars, builtInChars);

        // Display results
        System.out.print("Characters using manual method: ");
        System.out.println(manualChars);

        System.out.print("Characters using toCharArray(): ");
        System.out.println(builtInChars);

        System.out.println("Are both character arrays equal? " + areEqual);
    }
}
