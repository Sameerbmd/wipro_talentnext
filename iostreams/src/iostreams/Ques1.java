
package iostreams;

import java.io.*;
import java.util.Scanner;

public class Ques1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get file name from user
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();

        // Get character to be counted
        System.out.print("Enter the character to be counted: ");
        char targetChar = scanner.nextLine().toLowerCase().charAt(0); // Convert to lowercase

        int count = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            int ch;

            while ((ch = reader.read()) != -1) {
                if (Character.toLowerCase((char) ch) == targetChar) {
                    count++;
                }
            }

            reader.close();
            System.out.println("File '" + fileName + "' has " + count + " instances of letter '" + targetChar + "'.");
        } catch (FileNotFoundException e) {
            System.out.println("File '" + fileName + "' not found.");
        } catch (IOException e) {
            System.out.println("Error reading the file.");
        }
    }
}
