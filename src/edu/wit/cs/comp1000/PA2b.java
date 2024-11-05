package edu.wit.cs.comp1000;

import java.util.Scanner;


public class PA2b {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a b c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        // Calculate the discriminant
        double discriminant = (b * b) - (4 * a * c);

        // Check the discriminant value and determine the roots
        if (discriminant < 0) {
            System.out.println("Roots: imaginary");
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.printf("Root: %.2f%n", root);
        } else {
            double root1 = (-b - Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b + Math.sqrt(discriminant)) / (2 * a);

            // Ensure the roots are displayed in ascending order
            if (root1 > root2) {
                double temp = root1;
                root1 = root2;
                root2 = temp;
            }

            System.out.printf("Roots: %.2f, %.2f%n", root1, root2);
        }

        scanner.close();
    }
}
