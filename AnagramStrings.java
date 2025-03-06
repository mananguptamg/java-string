import java.util.Scanner;

class AnagramStrings {
    // method to check if two strings are anagrams
    public static boolean areAnagrams(String s1, String s2) {
        // Check if lengths are equal
        if (s1.length() != s2.length()) {
            return false;
        }

        // Create frequency arrays for both texts (ASCII size: 256)
        int[] frequency1 = new int[256];
        int[] frequency2 = new int[256];

        // Count frequency of each character in both texts
        for (int i = 0; i < s1.length(); i++) {
            frequency1[s1.charAt(i)]++;
            frequency2[s2.charAt(i)]++;
        }

        // Compare the frequency arrays
        for (int i = 0; i < 256; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false;
            }
        }
        return true;
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first text: ");
        String text1 = input.nextLine();

        System.out.print("Enter second text: ");
        String text2 = input.nextLine();

        // Convert both strings to lowercase and remove spaces
        text1 = text1.toLowerCase().replaceAll("\\s", "");
        text2 = text2.toLowerCase().replaceAll("\\s", "");

        // Check if the texts are anagrams
        if (areAnagrams(text1, text2)) {
            System.out.println("The texts are anagrams");
        } else {
            System.out.println("The texts are not anagrams");
        }
    }
}
