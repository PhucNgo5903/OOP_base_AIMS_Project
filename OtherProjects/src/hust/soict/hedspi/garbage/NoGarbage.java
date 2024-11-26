package hust.soict.hedspi.garbage;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
    public static void main(String[] args) {
        // Define the filename to read data from
        String filenamePhucNH = "test.txt";
        // Initialize a byte array to store file content
        byte[] inputBytesPhucNH = { 0 };        
        // Variables to store the start and end time of the operation
        long startTimePhucNH, endTimePhucNH;

        try {
            // Read all bytes from the specified file and store them in inputBytesPhucNH
            inputBytesPhucNH = Files.readAllBytes(Paths.get(filenamePhucNH));
        } catch (IOException e) {
            // Print stack trace if an error occurs during file reading
            e.printStackTrace();
        }
        // Record the start time of the operation
        startTimePhucNH = System.currentTimeMillis();
        // Use StringBuilder for efficient string concatenation
        StringBuilder outpStringBuilder = new StringBuilder();
        
        // Loop through each byte in the input array and append it to the StringBuilder
        for (byte b : inputBytesPhucNH) {
            outpStringBuilder.append((char)b); // Convert byte to char and append
        }       
        // Record the end time after the loop finishes
        endTimePhucNH = System.currentTimeMillis();
        // Print the total time taken for building the string using StringBuilder
        System.out.println(endTimePhucNH - startTimePhucNH);
    }
}