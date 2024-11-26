package hust.soict.hedspi.garbage;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;

public class GarbageCreator {
    public static void main(String[] args) {
        // Define the filename to read data from
        String filenamePhucNH = "test.txt";
        // Initialize a byte array to store file content
        byte[] inputBytesPhucNH = { 0 };       
        // Variables to store the start and end time of the operation
        long startTimePhucNH, endTimePhucNH;
        try {
            // Read all bytes from the file and store them in inputBytesPhucNH
            inputBytesPhucNH = Files.readAllBytes(Paths.get(filenamePhucNH));
        } catch (IOException e) {
            // Print the stack trace if an error occurs while reading the file
            e.printStackTrace();
        }

        // Record the start time of the string concatenation operation
        startTimePhucNH = System.currentTimeMillis();        
        // Initialize an empty string to build the output
        String outputString = "";       
        // Loop through each byte in the input array and concatenate it to the output string
        for (byte b : inputBytesPhucNH) {
            outputString += (char)b; // Convert byte to char and add to the string
        }      
        // Record the end time after the loop finishes
        endTimePhucNH = System.currentTimeMillis();      
        // Print the total time taken for the string concatenation process
        System.out.println(endTimePhucNH - startTimePhucNH);
    }
}