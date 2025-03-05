import java.util.Scanner;
class ArrayIndexOutOfBoundsExceptionProgram {
    // Method to generate an ArrayIndexOutOfBoundsException
    public static void generateException(String[] array, int start, int end){
        // Attempt to access an index beyond the length of the array
        for (int i = start; i <= end; i++) {
            System.out.println(array[i]); // This will throw the exception
        }
    }

    // Method to handle ArrayIndexOutOfBoundsException
    public static void handleException(String[] array, int start, int end) {
        try {
            // Attempt to access an index beyond the length of the array
            generateException(array, start, end);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    // Main Method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take the user input for the array size
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        // Define an array of the size entered by the user
        String[] names = new String[size];

        // Take user input for the array elements
        for (int i = 0; i < size; i++) {
            System.out.print("Enter a name: ");
            names[i] = input.next();
        }

        // Method to generate the Exception
        generateException(names, 0, size);

        // Method to handle the exception
        handleException(names, 0, size);

        input.close();
    }
}
