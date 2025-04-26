/*
 * Name: Austin Wiant - Date: April 26, 2025 - Assignment: Module 8 - ArrayList Max Value Finder
 * Purpose: Collect integers from user, find and display the largest one using a method.
 */

 import java.util.ArrayList;
 import java.util.Scanner;
 
 public class AustinArrayListTest {
 
     // Returns the max value from the list, or 0 if the list is empty
     public static Integer max(ArrayList list) {
         if (list.isEmpty()) {
             return 0;
         }
 
         Integer maxValue = (Integer) list.get(0);
         for (Object num : list) {
             if ((Integer) num > maxValue) {
                 maxValue = (Integer) num;
             }
         }
         return maxValue;
     }
 
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         ArrayList<Integer> numbers = new ArrayList<>();
 
         System.out.println("Enter integers (0 to stop):");
 
         int input;
         do {
             input = scanner.nextInt();
             numbers.add(input); // Include 0 in the list as required
         } while (input != 0);
 
         // Send list to the max method and display result
         System.out.println("The largest value entered is: " + max(numbers));
 
         scanner.close();
     }
 }
 