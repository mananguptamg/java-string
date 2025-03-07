import java.util.Scanner;

class LexicographicString {
    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = input.nextLine();

        System.out.print("Enter second string: ");
        String str2 = input.nextLine();

        // Method to compare two strings lexicographically
        int result = compareStrings(str1, str2);

        // Display result
        if (result < 0) {
            System.out.printf("\"%s\" comes before \"%s\" in lexicographical order", str1, str2);
        } else if (result > 0) {
            System.out.printf("\"%s\" comes before \"%s\" in lexicographical order", str2, str1);
        } else {
            System.out.printf("\"%s\" and \"%s\" are equal in lexicographical order", str1, str2);
        }
    }

    // Method to compare two strings lexicographically
    public static int compareStrings(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        int minLen = Math.min(len1, len2);

        for (int i = 0; i < minLen; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return str1.charAt(i) - str2.charAt(i);
            }
        }

        return len1 - len2;
    }
}
