import java.util.Scanner;

class NumberFormatExceptionProgram {
    // Method to generate NumberFormatException
    public static void generateException(String message){
        // Try to display the number from a string without number
        System.out.print("Number is: "+ Integer.parseInt(message));
    } 

    // Method to handle NumberFormatException
    public static void handleException(String message){
        try {
            // Attempt to generate a number from a string without number
            System.out.println("Number is: "+ Integer.parseInt(message));
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take String input from user
        System.out.print("Enter a string: ");
        String userInput = input.next();

        // Method to generate the Exception
        generateException(userInput);

        // Method to handle the NumberFormatException
        handleException(userInput);

        input.close();
    }
}
