package JFSJD;
import java.util.Scanner;

public class LeapYear{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        scanner.close();

        if (isLYear(year)) {
            System.out.println(year + " it is a leap year.");
        } else {
            System.out.println(year + " it is not a leap year.");
        }
    }

    public static boolean isLYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}
