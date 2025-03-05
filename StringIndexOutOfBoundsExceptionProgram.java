import java.util.Scanner;

class StringIndexOutOfBoundsExceptionProgram {
    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String str) {
        // Attempt to access an index beyond the length of the string
        char invalidChar = str.charAt(str.length()); // This will throw the exception
    }

    // Method to handle the RuntimeException
    public static void handleException(String str) {
        try {
            // Attempt to access an index beyond the length of the string
            char invalidChar = str.charAt(str.length()); // This will throw the exception
        } catch (StringIndexOutOfBoundsException e) {
            // Handle the exception
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Define a variable of type String and take user input
        System.out.print("Enter a string: ");
        String userInput = input.next();
        
        // Call the method to generate the Exception
        generateException(userInput);
        
        // Call the method to handle the RuntimeException
        handleException(userInput);
        
        input.close();
    }

}
