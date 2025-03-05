import java.util.Scanner;

class StringUppercase {
    // Method to convert the string to uppercase using charAt method
    public static String convertToUppercase(String str) {
        // Define a variable to store the converted string
        String convertedString = "";

        // Loop through the string and convert each character to uppercase
        for (int i = 0; i < str.length(); i++) {
            // Get the character at the current index
            char ch = str.charAt(i);

            // Convert the character to uppercase using ascii value
            char upperCaseChar = (char) (ch - 32);

            // Append the uppercase character to the converted string
            convertedString += upperCaseChar;
        }

        // Return the converted string
        return convertedString;
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take String input from user
        System.out.print("Enter a string with all letters in lowercase ");
        String userInput = input.next();

        // Method to convert string to uppercase
        String convertedString = convertToUppercase(userInput);

        // Convert string to upper case using toUpperCase method
        String convertedString2 = userInput.toUpperCase();

        // Display the results
        System.out.println("Converted string using charAt method: " + convertedString);
        System.out.println("Converted string using toUpperCase method: " + convertedString2);

        // Compare if the two strings are equal
        if (convertedString.equals(convertedString2)) {
            System.out.println("Both strings are equal");
        } else {
            System.out.println("Both strings are not equal");
        }
        input.close();
    }
}
