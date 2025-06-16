import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        boolean value = true;


        try (Scanner input = new Scanner(System.in)) {
            // Asking user for file name

            System.out.println("Enter the name of the file (without extension): ");
            String name = input.nextLine(); // Read full file name

            String fileName = name + ".txt"; // Ensure proper file extension

            // Open file in append mode
            try (FileWriter write1 = new FileWriter(fileName, true)) {
                System.out.println("Enter text to append (type 'Exit' to stop): ");

                while (true) {
                    String text = input.nextLine();


                    if (text.equalsIgnoreCase("Exit")) {
                        break;
                    }

                    write1.write(text + "\n"); // Write text with newline
                }

                System.out.println("Text successfully appended to " + fileName);
            }

            // Reading the file contents
            System.out.println("\nReading from " + fileName + ":");
            try (Scanner reader = new Scanner(new File(fileName))) {
                while (reader.hasNextLine()) {
                    System.out.println(reader.nextLine()); // Correct way to read and print file
                }
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
