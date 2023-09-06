package JFSJD;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();
        
        int[] array = new int[length];

      
        System.out.println("Enter the array elements:");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

    
        System.out.print("Enter the element to search for: ");
        int numTofind = scanner.nextInt();

        // To do linear search
        int index = linearSearch(array, numTofind);

      
        if (index != -1) {
            System.out.println("Element " + numTofind + " found at index " + index);
        } else {
            System.out.println("Element " + numTofind + " not found in the array.");
        }

        scanner.close();
    }

   
    public static int linearSearch(int[] array, int numTofind) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numTofind) {
                return i; // Element found, return its index
            }
        }
        return -1; // Element not found in the array
    }
}
