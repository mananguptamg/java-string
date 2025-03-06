import java.util.Scanner;

class PalindromeString {
    // Logic 1: using two-pointers approach
    public static boolean isPalindromeStringTwoPointer(String s) {
        int start = 0, end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    } 

    // Logic 2: Using Recursion approach
    public static boolean isPalindromeStringRecursive(String s, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }
        return isPalindromeStringRecursive(s, start + 1, end - 1);
    }

    // Logic 3: Using character array and reverse comparison approach
    public static boolean isPalindromeStringCharArray(String s) {
        char[] originalArray = s.toCharArray();
        char[] reversedArray = reverseString(s);

        // Compare original and reversed arrays
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] != reversedArray[i]) {
                return false;
            }
        }
        return true;
    }

    // Method to reverse a string
    public static char[] reverseString(String s) {
        char[] reversed = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            reversed[i] = s.charAt(s.length() - 1 - i);
        }
        return reversed;
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = input.nextLine();

        // Checking using all three logic methods
        boolean result1 = isPalindromeStringTwoPointer(userInput);
        boolean result2 = isPalindromeStringRecursive(userInput, 0, userInput.length() - 1);
        boolean result3 = isPalindromeStringCharArray(userInput);

        // Display results
        System.out.println("[Logic 1] Is the string a palindrome? " + result1);
        System.out.println("[Logic 2] Is the string a palindrome? " + result2);
        System.out.println("[Logic 3] Is the string a palindrome? " + result3);

        // Compare the results
        if (result1 == result2 && result2 == result3) {
            System.out.println("All methods give the same result.");
        } else {
            System.out.println("Results are not the same.");
        }
    }
}
