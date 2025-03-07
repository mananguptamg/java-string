import java.util.Scanner;

class SubstringOccurences {
    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        System.out.print("Enter a substring: ");
        String subStr = input.nextLine();

        // Method to calculate number of times a substring occurs in the String
        int result = substringOccurences(str, subStr);

        System.out.println("Number of times the substring " +subStr+ " occurs in the string: " + result);
    }

    // Method to calculate number of times a substring occurs in the String
    public static int substringOccurences(String str, String subStr) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i).startsWith(subStr)) {
                count++;
            }
        }
        return count;
    }
}
