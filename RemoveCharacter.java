import java.util.Scanner;

class RemoveCharacter {
    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        System.out.print("Enter a character to remove: ");
        char ch = input.next().charAt(0);

        // Method to remove a specific character from the string
        String result = removeCharacter(str, ch);

        System.out.println("String after removing character: " + result);

        input.close();
    }

    // Method to remove a specific character from the string
    public static String removeCharacter(String str, char ch) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch) {
                result += str.charAt(i);
            }
        }
        return result;
    }
}
