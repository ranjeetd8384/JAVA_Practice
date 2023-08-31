package JFSJD;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a num: ");
        int num = scanner.nextInt();

        System.out.println("Multiplication Table for " + num + ":");
        for (int i = 1; i <= 10; i++) {
            int wholetable = num * i;
            System.out.println(num + " * " + i + " = " + wholetable);
        }

        scanner.close();
    }
}
