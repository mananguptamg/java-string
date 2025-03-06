import java.util.Scanner;

class GreogorianCalender {
    // Array to store month names
    private static final String[] months = {
        "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    // Array to store the number of days in each month
    private static final int[] daysInAMonth = {
        31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get the first day of the month using Gregorian calendar algorithm
    public static int getFirstDayOfMonth(int month, int year) {
        int y = year - (14 - month) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        return (1 + x + (31 * m) / 12) % 7;  // Return the day index (0 = Sunday, 1 = Monday, ..., 6 = Saturday)
    }

    // Method to print the calendar for a given month and year
    public static void printCalendar(int month, int year) {
        // Get the number of days in the month
        int days = daysInAMonth[month - 1];

        // Adjust for leap year in February
        if (month == 2 && isLeapYear(year)) {
            days = 29;
        }

        // Get the first day of the month
        int firstDay = getFirstDayOfMonth(month, year);

        // Print the calendar header
        System.out.println("\n" + months[month - 1] + " " + year);
        System.out.println("Sun  Mon  Tue  Wed  Thu  Fri  Sat");

        // Print leading spaces for the first row
        for (int i = 0; i < firstDay; i++) {
            System.out.print("     ");
        }

        // Print the days of the month
        for (int day = 1; day <= days; day++) {
            System.out.printf("%-5d", day);
            if ((day + firstDay) % 7 == 0) {  // Start a new line every week
                System.out.println();
            }
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = input.nextInt();

        System.out.print("Enter year: ");
        int year = input.nextInt();

        // Validate input
        if (month < 1 || month > 12 || year < 1) {
            System.out.println("Invalid month. Please enter a month between 1 and 12.");
        } else {
            printCalendar(month, year);
        }
    }
}
