/*
 * Name: Austin Wiant - Date: 04/13/2025 - Assignment: Module 5 – Locate Largest and Smallest Elements
 * 
 * Purpose: Finds the location of the largest and smallest elements in 2D arrays (int and double).
 */

 public class LocateElements {

    public static void main(String[] args) {
        // Sample 2D int array
        int[][] intArray = {
            {3, 5, 1},
            {9, 2, 8},
            {4, 6, 0}
        };

        // Sample 2D double array
        double[][] doubleArray = {
            {3.5, 5.1, 1.2},
            {9.7, 2.4, 8.6},
            {4.9, 6.3, 0.5}
        };

        // Test methods on int array
        int[] largestInt = locateLargest(intArray);
        int[] smallestInt = locateSmallest(intArray);

        System.out.println("Largest int location: [" + largestInt[0] + "][" + largestInt[1] + "]");
        System.out.println("Smallest int location: [" + smallestInt[0] + "][" + smallestInt[1] + "]");

        // Test methods on double array
        int[] largestDouble = locateLargest(doubleArray);
        int[] smallestDouble = locateSmallest(doubleArray);

        System.out.println("Largest double location: [" + largestDouble[0] + "][" + largestDouble[1] + "]");
        System.out.println("Smallest double location: [" + smallestDouble[0] + "][" + smallestDouble[1] + "]");
    }

    // Returns the location of the largest element in a 2D double array
    public static int[] locateLargest(double[][] arrayParam) {
        int[] location = {0, 0};
        double max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }

        return location;
    }

    // Returns the location of the largest element in a 2D int array
    public static int[] locateLargest(int[][] arrayParam) {
        int[] location = {0, 0};
        int max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }

        return location;
    }

    // Returns the location of the smallest element in a 2D double array
    public static int[] locateSmallest(double[][] arrayParam) {
        int[] location = {0, 0};
        double min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }

        return location;
    }

    // Returns the location of the smallest element in a 2D int array
    public static int[] locateSmallest(int[][] arrayParam) {
        int[] location = {0, 0};
        int min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }

        return location;
    }
}
