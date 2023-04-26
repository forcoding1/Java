import java.io.*;

public class by_wr {
    public static void main(String[] args) {
        try {
            // Open the output file
            OutputStream outputFile = new FileOutputStream("output2.bin");

            // Write 5 lines of text to the file
            String[] lines = {"This is the first line.",
                              "This is the second line.",
                              "This is the third line.",
                              "This is the fourth line.",
                              "This is the fifth line."};
           for (int i = 0; i < lines.length; i++) {
                byte[] lineBytes = lines[i].getBytes(); // Convert the line to a byte array
                outputFile.write(lineBytes); // Write the byte array to the file
                outputFile.write('\n'); // Add a newline character after each line
            }

            // Close the output file
            outputFile.close();

            System.out.println("Successfully wrote 5 lines of text to the binary file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the binary file: " + e.getMessage());
        }
    }
}
