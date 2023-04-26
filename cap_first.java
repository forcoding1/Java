import java.io.*;

public class cap_first {
    public static void main(String[] args) {
        try {
            BufferedReader inputFile = new BufferedReader(new FileReader("a.txt"));

            BufferedWriter outputFile = new BufferedWriter(new FileWriter("c.txt"));

            String line;
            while ((line = inputFile.readLine()) != null) {
                String[] words = line.split("\\s+");

                for (int i = 0; i < words.length; i++) {
                    String firstLetter = words[i].substring(0, 1); 
                    String restOfWord = words[i].substring(1); 
                    String capitalizedWord = firstLetter.toUpperCase() + restOfWord;
                    outputFile.write(capitalizedWord + " "); 
                }
                outputFile.newLine();
            }
            inputFile.close();
            outputFile.close();

            System.out.println("Successfully capitalized the first letter of every word in the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while capitalizing the first letter of every word in the file: " + e.getMessage());
        }
    }
}
