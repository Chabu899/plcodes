import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class exp6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the file name to write to (e.g., output.txt): ");
        String fileName = scanner.nextLine();
        
        System.out.print("Enter text to write into the file: ");
        String textToWrite = scanner.nextLine();
        
        // Write to file
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(textToWrite);
            System.out.println("Text successfully written to " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        // Read from file
        System.out.println("\nReading contents of the file:");
        try (FileReader reader = new FileReader(fileName)) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file.");
            e.printStackTrace();
        }
        
        scanner.close();
    }
}
