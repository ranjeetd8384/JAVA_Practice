package JFSJD;

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        System.out.print("Enter a month (1-12): ");
        int month = scanner.nextInt();

        int daysInMonth = 0;

        switch (month) {
            case 1: // Jan
            case 3: // Mar
            case 5: // May
            case 7: // July
            case 8: // Aug
            case 10: // Oct
            case 12: // Dec
                daysInMonth = 31;
                break;
            case 4: // Apr
            case 6: // Jun
            case 9: // Sep
            case 11: // Nov
                daysInMonth = 30;
                break;
            case 2: // Feb
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    daysInMonth = 29; // Leap year
                } else {
                    daysInMonth = 28; // Non-leap year
                }
                break;
            default:
                System.out.println("it is Invalid month");
                System.exit(0);
        }

        System.out.println("Number of days in the selected month: " + daysInMonth);
        scanner.close();
    }
}

