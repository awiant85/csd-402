/*
 * Name: Austin Wiant - Date: April 27, 2025 - Assignment: File Writing and Reading Program 2
 *
 * Purpose: This program creates or appends to a file with 10 random numbers,then reads and displays the contents of the file.
 */

 import java.io.File;
 import java.io.FileWriter;
 import java.io.FileReader;
 import java.io.BufferedReader;
 import java.io.IOException;
 import java.util.Random;
 
 public class program2 {
     public static void main(String[] args) {
         // Create a file object for "data.file"
         File file = new File("data.file");
 
         try {
             // If the file doesn't exist, create it
             if (!file.exists()) {
                 file.createNewFile();
             }
 
             // Open FileWriter in append mode to add 10 random numbers
             FileWriter writer = new FileWriter(file, true); // 'true' = append mode
             Random random = new Random();
 
             // Write 10 random numbers separated by spaces
             for (int i = 0; i < 10; i++) {
                 int num = random.nextInt(100); // Random number between 0-99
                 writer.write(num + " ");
             }
             writer.write("\n"); // Add a newline after each batch of 10 numbers
             writer.close(); // Close the writer
 
             // Now open the file again to read its contents
             FileReader reader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(reader);
             String line;
 
             System.out.println("Contents of data.file:");
 
             // Read and print each line of the file
             while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close(); // Close the reader
        } catch (IOException e) {
            // Handle any file-related errors
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
 