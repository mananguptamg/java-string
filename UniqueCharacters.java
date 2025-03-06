import java.util.Scanner;

class UniqueCharacters {
    // Method to find the string length using charAt method
    public static int stringLength(String s) {
        // First replace all spaces in between the string
        s = s.replaceAll("\\s", "");
        
        int count = 0;
        try {
            while(s.charAt(count)!= '\0'){
                count++;
            }
        } catch (Exception e) {
            // Caught index out of bound, count is the length
        }
        return count;
    }

    // Method to find unique characters in a String using charAt()
    public static char[] uniqueCharacters(String text) {
        int len = stringLength(text);
        char[] uniqueChars = new char[len]; // Store unique characters
        int uniqueCount = 0;

        for (int i = 0; i < len; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Check if currentChar is already in uniqueChars
            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueChars[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            // If unique, add to the result array
            if (isUnique) {
                uniqueChars[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        // Create a new array with the exact unique count
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = uniqueChars[i];
        }
        return result;
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = input.nextLine();

        // Find unique characters in the string
        char[] uniqueChars = uniqueCharacters(userInput);

        // Display the unique characters
        System.out.print("Unique characters in String " + userInput + " are: ");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }
    }
}
