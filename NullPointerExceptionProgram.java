class NullPointerExceptionProgram {
    // Method to generate NullPointerException
    public static String generateNullPointerException() {
        // Define the variable text and initialize it to null
        String text = null;

        // Return the null string
        return text;
    }

    // Method to handle NullPointerException
    public static void handleNullPointerException(String s) {
        // Define the variable text and initialize it to null
        try {
            // Attempt to call a method on the null variable
            System.out.println(s.length()); // This will throw NullPointerException
        } catch (NullPointerException e) {
            // Catch the NullPointerException and print a message indicating it was caught
            System.out.println("NullPointerException caught");
        }
    }
    // Main method
    public static void main(String[] args) {
        // Call the method to generate the NullPointerException
        String s = generateNullPointerException();
        
        // Call the method to handle the NullPointerException
        handleNullPointerException(s);
    }
}
