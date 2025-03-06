import java.util.Scanner;

public class ReverseString {
    // Method to reverse a string without built-in functions
    public static String reverse(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i); // Append characters in reverse order
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String userInput = input.nextLine();

        // Calling the reverse method
        String reversedString = reverse(userInput);

        // Displaying the result
        System.out.println("Reversed String: " + reversedString);
    }
}
