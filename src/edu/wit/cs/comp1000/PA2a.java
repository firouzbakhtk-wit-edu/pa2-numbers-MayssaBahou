package edu.wit.cs.comp1000;

import java.util.Scanner;

public class PA2a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for five whole numbers
        System.out.print("Enter five whole numbers: ");
        
        // Variables for sums and counters
        int sumPositive = 0;
        int sumNonPositive = 0;
        int totalSum = 0;
        int countPositive = 0;
        int countNonPositive = 0;

        // Reading 5 integers
        for (int i = 0; i < 5; i++) {
            int num = scanner.nextInt();
            totalSum += num;

            // Classify and accumulate the sums and counts
            if (num > 0) {
                sumPositive += num;
                countPositive++;
            } else {
                sumNonPositive += num;
                countNonPositive++;
            }
        }

        // Calculate averages
        double averagePositive = countPositive > 0 ? (double) sumPositive / countPositive : 0.0;
        double averageNonPositive = countNonPositive > 0 ? (double) sumNonPositive / countNonPositive : 0.0;
        double averageTotal = (double) totalSum / 5;

        // Output results in the required format
        System.out.printf("The sum of the %d positive number%s: %d%n", countPositive, countPositive == 1 ? "" : "s", sumPositive);
        System.out.printf("The sum of the %d non-positive number%s: %d%n", countNonPositive, countNonPositive == 1 ? "" : "s", sumNonPositive);
        System.out.printf("The sum of the 5 numbers: %d%n", totalSum);
        System.out.printf("The average of the %d positive number%s: %.2f%n", countPositive, countPositive == 1 ? "" : "s", averagePositive);
        System.out.printf("The average of the %d non-positive number%s: %.2f%n", countNonPositive, countNonPositive == 1 ? "" : "s", averageNonPositive);
        System.out.printf("The average of the 5 numbers: %.2f%n", averageTotal);

        scanner.close();
    }
}
