import java.io.*;
import java.util.Scanner;

public class NewFunctionDowhile {
    public static void main(String[] args) {
        String name;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the file name:");
        String filename = input.nextLine();
        filename = filename + ".txt";

        // Writing to the file
        try (FileWriter mir = new FileWriter(filename, true)) {
            do {
                System.out.println("Please enter the name (type 'exit' to stop):");
                name = input.nextLine();
                if (!name.equalsIgnoreCase("exit")) {
                    mir.write(name + "\n");
                }
            } while (!name.equalsIgnoreCase("exit"));
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }

        // Reading from the file
        System.out.println("\nContents of " + filename + ":");
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading the file.");
        }
    }
}
