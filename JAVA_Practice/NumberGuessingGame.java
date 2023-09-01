package JFSJD;

import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int originalNumber = random.nextInt(100);
        int attempts = 0;
        int maxAttempts = 5; 
        
        System.out.println("Number Guessing Game!");
        System.out.println("I've chosen a number between 1 and 100. Try to guess it.");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;
            
            if (userGuess < originalNumber) {
                System.out.println("your number is too low.");
            } else if (userGuess > originalNumber) {
                System.out.println("Your number is too high.");
            } else {
                System.out.println("Congratulations! You've guessed the number " + originalNumber + " in " + attempts + " attempts.");
                break;
            }
            
            if (attempts < maxAttempts) {
                System.out.println("You have " + (maxAttempts - attempts) + " attempt(s) left.");
            } else {
                System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was " + originalNumber + ".");
            }
        }

        scanner.close();
    }
}
