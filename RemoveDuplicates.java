import java.util.Scanner;

class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        // Method to remove duplicates from a string
        String result = removeDuplicates(str);

        System.out.println("String after removing duplicates: " + result);
    }

    // Method to remove duplicates from a string
    public static String removeDuplicates(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (result.indexOf(str.charAt(i)) == -1) {
                result += str.charAt(i);
            }
        }
        return result;
    }
}
