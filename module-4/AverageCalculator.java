/*Name: Austin Wiant - Date: April 6, 2025 - Assignment: Java Overloaded Methods - Average of Arrays
 * 
 * Purpose: This program calculates the average of different numeric arrays using
 * four overloaded methods. It prints the array contents and their average.
 */

 public class AverageCalculator {

    // Method to calculate average of a short array
    public static short average(short[] array) {
        int sum = 0;
        for (short number : array) {
            sum += number;
        }
        return (short)(sum / array.length);
    }

    // Method to calculate average of an int array
    public static int average(int[] array) {
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        return sum / array.length;
    }

    // Method to calculate average of a long array
    public static long average(long[] array) {
        long sum = 0;
        for (long number : array) {
            sum += number;
        }
        return sum / array.length;
    }

    // Method to calculate average of a double array
    public static double average(double[] array) {
        double sum = 0.0;
        for (double number : array) {
            sum += number;
        }
        return sum / array.length;
    }

    // Helper method to print array elements in a readable format
    public static void printArray(String label, Object array) {
        System.out.print(label + ": ");
        
        // Check which type of array is being passed in and print accordingly
        if (array instanceof short[]) {
            for (short num : (short[]) array) {
                System.out.print(num + " ");
            }
        } else if (array instanceof int[]) {
            for (int num : (int[]) array) {
                System.out.print(num + " ");
            }
        } else if (array instanceof long[]) {
            for (long num : (long[]) array) {
                System.out.print(num + " ");
            }
        } else if (array instanceof double[]) {
            for (double num : (double[]) array) {
                System.out.print(num + " ");
            }
        }

        System.out.println(); // Move to next line after printing array
    }

    public static void main(String[] args) {

        // Create arrays of different types and sizes
        short[] shortArray = {10, 20, 30};
        int[] intArray = {5, 15, 25, 35};
        long[] longArray = {100L, 200L, 300L, 400L, 500L};
        double[] doubleArray = {1.5, 2.5, 3.5, 4.5, 5.5, 6.5};

        // Test and print results for short array
        printArray("Short Array", shortArray);
        System.out.println("Average: " + average(shortArray));
        System.out.println();

        // Test and print results for int array
        printArray("Int Array", intArray);
        System.out.println("Average: " + average(intArray));
        System.out.println();

        // Test and print results for long array
        printArray("Long Array", longArray);
        System.out.println("Average: " + average(longArray));
        System.out.println();

        // Test and print results for double array
        printArray("Double Array", doubleArray);
        System.out.println("Average: " + average(doubleArray));
        System.out.println();
    }
}
