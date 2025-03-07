import java.util.Scanner;

class ToggleCase {
    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        // Method to toggle character case
        String result = toggleCharacterCase(str);

        System.out.println("String after toggling character case: " + result);
    }

    // Method to toggle character case
    public static String toggleCharacterCase(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if((int) ch >=65 && (int) ch <= 90){
                result += (char) ((int) ch + 32);
            } else if((int) ch >= 97 && (int) ch <= 122){
                result += (char) ((int) ch - 32);
            } else {
                result += ch;
            }
        }
        return result;
    }
}
