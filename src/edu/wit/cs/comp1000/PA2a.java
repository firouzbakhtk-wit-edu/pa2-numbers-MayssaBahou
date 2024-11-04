package edu.wit.cs.comp1000;

import java.util.Scanner;

/**
 * A class that reads five whole numbers and calculates the sum and average of all numbers,
 * as well as the sum and average of positive and non-positive numbers separately.
 */
public class PA2a {

    /**
     * Main method that prompts the user for five numbers and calculates required statistics.
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter five whole numbers: ");
        int[] numbers = new int[5];
        int totalSum = 0;
        int positiveSum = 0, positiveCount = 0;
        int nonPositiveSum = 0, nonPositiveCount = 0;

        // Read five numbers
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
            totalSum += numbers[i];

            // Separate sums and counts for positive and non-positive numbers
            if (numbers[i] > 0) {
                positiveSum += numbers[i];
                positiveCount++;
            } else {
                nonPositiveSum += numbers[i];
                nonPositiveCount++;
            }
        }

        // Calculate averages, handling division by zero cases
        double totalAverage = totalSum / 5.0;
        double positiveAverage = positiveCount > 0 ? (double) positiveSum / positiveCount : 0.0;
        double nonPositiveAverage = nonPositiveCount > 0 ? (double) nonPositiveSum / nonPositiveCount : 0.0;

        // Display results
        System.out.println("The sum of the " + positiveCount + " positive numbers: " + positiveSum);
        System.out.println("The sum of the " + nonPositiveCount + " non-positive numbers: " + nonPositiveSum);
        System.out.println("The sum of the 5 numbers: " + totalSum);
        System.out.printf("The average of the %d positive numbers: %.2f%n", positiveCount, positiveAverage);
        System.out.printf("The average of the %d non-positive numbers: %.2f%n", nonPositiveCount, nonPositiveAverage);
        System.out.printf("The average of the 5 numbers: %.2f%n", totalAverage);

        scanner.close();
    }
}

