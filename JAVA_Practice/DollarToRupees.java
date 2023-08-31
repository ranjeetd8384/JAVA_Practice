package JFSJD;

import java.util.Scanner;

public class DollarToRupees{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter US Dollars: ");
        double dollars = scanner.nextDouble();

      
        double multiplier = 82.59; // 1 USD = 82.59 INR

        double rupees = dollars * multiplier;
        
        System.out.println(dollars + " USD is equal to " + rupees + " INR");

        scanner.close();
    }
}

