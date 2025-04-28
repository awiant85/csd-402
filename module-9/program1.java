/*
 * Name: Austin Wiant - Date: April 27, 2025 - Assignment: ArrayList Exception Handling Program 1
 *
 * Purpose: This program prints a list of strings and lets the user select one by index, handling errors if the index is out of bounds.
 */

 import java.util.ArrayList;
 import java.util.Scanner;
 
 public class program1 {
     public static void main(String[] args) {
         // Create and fill the ArrayList with 10 string values
         ArrayList<String> items = new ArrayList<>();
         items.add("Apple");
         items.add("Banana");
         items.add("Cherry");
         items.add("Date");
         items.add("Elderberry");
         items.add("Fig");
         items.add("Grape");
         items.add("Honeydew");
         items.add("Kiwi");
         items.add("Lemon");
 
         // Print each item in the list using a for-each loop
         for (String item : items) {
             System.out.println(item);
         }
 
         // Ask the user for an index to display
         Scanner input = new Scanner(System.in);
         System.out.print("Enter an index (0-9) to see that item again: ");
         String userInput = input.nextLine(); // User enters index as a string
 
         try {
             // Convert user input to integer (Autoboxing from String to int)
             int index = Integer.parseInt(userInput);
 
             // Display the selected item from the list
             System.out.println("Item at index " + index + ": " + items.get(index));
         } catch (Exception e) {
             // Handle invalid index or input errors
             System.out.println("Exception: Out of Bounds");
         }
 
         input.close(); // Close the Scanner to avoid resource leak
     }
 }
 