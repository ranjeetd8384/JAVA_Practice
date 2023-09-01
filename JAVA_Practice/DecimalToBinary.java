package JFSJD;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        scanner.close();

        int binary = 0;
        int base = 1;

        while (decimal > 0) {
            int digit = decimal % 2;
            binary = binary + digit * base;
            base = base * 10;
            decimal = decimal / 2;
        }

        System.out.println("Binary representation: " + binary);
    }
}
