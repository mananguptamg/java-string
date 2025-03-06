import java.util.Scanner;;

class LengthOfString {
    // Method to calculate length of a string without using length() method
    public static int stringLength(String s) {
        int count = 0;
        try {
            while ( true ) {
                s.charAt(count); // Try to access the character at index 'count'
                count++; // Increment the counter if possible.
            }
        } catch (IndexOutOfBoundsException e) {
            // Exception occurs when we go beyond the last index, so return count
        }
        return count;
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Define a variable of type String and take user input
        System.out.print("Enter a string: ");
        String userInput = input.next();

        // Method to calculate the length of the string
        int length = stringLength(userInput);

        // Display the length of the string
        System.out.println("Length of the string without length() method: " + length);
        System.out.println("Length of the string using length() method: " + userInput.length());
    }
}