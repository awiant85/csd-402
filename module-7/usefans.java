/*
 * Name: Austin Wiant - Date: April 20, 2025 - Assignment: Module 7 Programming Assignment
 * Creates a collection of Fan objects and displays them using methods that don't use toString().
 */

 import java.util.ArrayList;

 public class usefans {
 
     // Display a single Fan's details without toString()
     public static void displayFan(Fan fan) {
         System.out.println("Fan Details:");
         System.out.println("Speed: " + fan.getSpeed());
         System.out.println("Is On: " + fan.isOn());
         System.out.println("Radius: " + fan.getRadius());
         System.out.println("Color: " + fan.getColor());
         System.out.println("------------------------");
     }
 
     // Display a collection of Fan objects
     public static void displayFans(ArrayList<Fan> fanList) {
         for (Fan fan : fanList) {
             displayFan(fan);
         }
     }
 
     public static void main(String[] args) {
         // Create and populate collection of Fan objects
         ArrayList<Fan> fans = new ArrayList<>();
 
         fans.add(new Fan(3, true, 10.5, "white"));
         fans.add(new Fan(2, false, 8.0, "black"));
         fans.add(new Fan(1, true, 6.0, "red"));
 
         // Display all fan details
         displayFans(fans);
     }
 }
 