import java.util.Scanner;

class IllegalArgumentExceptionProgram {
    // Method to generate IllegalArgumentException
    public static void generateException(String str) {
        // Attempt to access an index beyond the length of the string
        String subString = str.substring(str.length()-1, 0); // This will throw the exception
    
        // Try to display the subString
        System.out.println("Substring: " + subString);
    }
    
    // Method to handle RuntimeException
    public static void handleException(String str) {
        try {
            // Attempt to generate a substring with invalid indices
            String subStr = str.substring(5, 2); // Start index greater than end index
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Define a variable of type String and take user input
        System.out.print("Enter a string: ");
        String userInput = input.next();

        // Method to generate the Exception
        generateException(userInput);

        // Method to handle the RuntimeException
        handleException(userInput);
    }
}
