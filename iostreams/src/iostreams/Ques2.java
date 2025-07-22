package iostreams;
import java.io.*;
import java.util.*;

public class Ques2 {
    public static void main(String[] args) {
        // Check for correct number of arguments
        if (args.length != 2) {
            System.out.println("Usage: java FileWordCount inputFile.txt outputFile.txt");
            return;
        }

        String inputFileName = args[0];
        String outputFileName = args[1];

        // Use TreeMap to keep words sorted alphabetically
        Map<String, Integer> wordCountMap = new TreeMap<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
            String line;

            while ((line = reader.readLine()) != null) {
                // Split line into words using regex to handle punctuation (optional)
                String[] words = line.split("\\s+");  // split by whitespace

                for (String word : words) {
                    word = word.trim();
                    if (!word.isEmpty()) {
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }

            reader.close();

            // Write the word counts to the output file
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName));

            for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
                writer.write(entry.getKey() + " : " + entry.getValue());
                writer.newLine();
            }

            writer.close();

            System.out.println("Word count written to " + outputFileName);

        } catch (FileNotFoundException e) {
            System.out.println("Input file not found: " + inputFileName);
        } catch (IOException e) {
            System.out.println("Error reading or writing files.");
        }
    }
}
