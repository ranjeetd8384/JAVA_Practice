package JFSJD;

import java.util.Scanner;

public class ReverseAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        int reverseNumber = 0, sumOfDigits = 0;

        while (number != 0) {
            int digit = number % 10;
            reverseNumber = reverseNumber * 10 + digit;
            sumOfDigits += digit;
            number /= 10;
        }

        System.out.println("Reversed number: " + reverseNumber);
        System.out.println("Sum of digits: " + sumOfDigits);
    }
}
