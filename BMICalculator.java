import java.util.Scanner;

class BMICalculator {
    // Method to calculate BMI and status of every person
    public static String[][] calculateBMI(double[][] bodyValues) {
        String[][] result = new String[10][4];
        
        for (int i = 0; i < 10; i++) {
            double weight = bodyValues[i][0];
            double height = bodyValues[i][1] / 100; // Convert cm to meters
            double bmi = weight / (height * height);
            
            // Determine BMI status
            String status;
            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi <= 24.9) {
                status = "Normal";
            } else if (bmi <= 39.9) {
                status = "Overweight";
            } else {
                status = "Obese";
            }
            
            // Store results in String array
            result[i][0] = String.format("%.2f", bodyValues[i][1]); // Height in cm
            result[i][1] = String.format("%.2f", weight); // Weight in kg
            result[i][2] = String.format("%.2f", bmi); // BMI
            result[i][3] = status; // Status
        }
        
        return result;
    }

    // Method to display results in tabular format
    public static void displayResults(String[][] bmiData) {
        System.out.println("\nBMI Results:");
        System.out.println("+------------+------------+------------+-------------+");
        System.out.println("| Height (cm)| Weight (kg)| BMI        | Status      |");
        System.out.println("+------------+------------+------------+-------------+");
        
        for (int i = 0; i < 10; i++) {
            System.out.printf("| %-10s | %-10s | %-10s | %-11s |\n", bmiData[i][0], bmiData[i][1], bmiData[i][2], bmiData[i][3]);
        }
        
        System.out.println("+------------+------------+------------+-------------+");
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] bodyValues = new double[10][2];
        
        // Take user input for weight and height of 10 persons
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            bodyValues[i][0] = input.nextDouble();
            
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            bodyValues[i][1] = input.nextDouble();
        }
        
        // Calculate BMI and status of all persons
        String[][] bmiData = calculateBMI(bodyValues);
        
        // Display results in tabular format
        displayResults(bmiData);
    }
}
