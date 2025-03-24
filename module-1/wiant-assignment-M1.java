// Austin Wiant - March 23, 2025 - Module1 Programming Assignment

// This program calculates the energy required to heat water from an initial temperature to a final temperature.

import java.util.Scanner;

public class HeatWater {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create Scanner for user input

        // Prompt user to enter the mass of water in kilograms
        System.out.print("Enter the amount of water in kilograms: ");
        double waterMass = input.nextDouble();

        // Prompt initial temperature in Celsius
        System.out.print("Enter the initial temperature in Celsius: ");
        double initialTemp = input.nextDouble();

        // Prompt final temperature in Celsius
        System.out.print("Enter the final temperature in Celsius: ");
        double finalTemp = input.nextDouble();

        // Calculate the energy required using the formula Q = mass * (final - initial) * 4184
        double energy = waterMass * (finalTemp - initialTemp) * 4184;

        // Display
        System.out.println("The energy needed is " + energy + " joules.");

        input.close(); // Close the scanner
    }
}
