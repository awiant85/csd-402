/*
 * Name: Austin Wiant - Date: April 20, 2025 - Assignment: Module 7 Programming Assignment
 * Fan class with 'this' references and methods to display a fan and a collection of fans without using toString().
 */

 import java.util.ArrayList;

 public class Fan {
     private int speed;
     private boolean on;
     private double radius;
     private String color;
 
     public Fan() {
         this.speed = 1;
         this.on = false;
         this.radius = 5.0;
         this.color = "blue";
     }
 
     public Fan(int speed, boolean on, double radius, String color) {
         this.speed = speed;
         this.on = on;
         this.radius = radius;
         this.color = color;
     }
 
     public int getSpeed() {
         return this.speed;
     }
 
     public boolean isOn() {
         return this.on;
     }
 
     public double getRadius() {
         return this.radius;
     }
 
     public String getColor() {
         return this.color;
     }
 
     // Method to display one fan
     public static void displayFan(Fan fan) {
         System.out.println("Fan Details:");
         System.out.println("Speed: " + fan.getSpeed());
         System.out.println("Is On: " + fan.isOn());
         System.out.println("Radius: " + fan.getRadius());
         System.out.println("Color: " + fan.getColor());
         System.out.println("------------------------");
     }
 
     // Method to display a list of fans
     public static void displayFans(ArrayList<Fan> fans) {
         for (Fan fan : fans) {
             displayFan(fan);
         }
     }
 
     // Test code
     public static void main(String[] args) {
         ArrayList<Fan> fans = new ArrayList<>();
         fans.add(new Fan(3, true, 10.0, "white"));
         fans.add(new Fan(2, false, 7.5, "black"));
         fans.add(new Fan(1, true, 6.0, "red"));
 
         displayFans(fans);
     }
 }
 