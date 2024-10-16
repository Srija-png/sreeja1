import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File1 {

    public static void main(String[] args) {
        try {
            // 1. Create a file
            File myFile = new File("example.txt");
            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File already exists.");
            }

            // 2. Write to the file
            FileWriter writer = new FileWriter("example.txt");
            writer.write("Hello, this is a simple file handling demonstration.\n");
            writer.write("File handling in Java is easy and useful.");
            writer.close();
            System.out.println("Successfully wrote to the file.");

            // 3. Read from the file
            Scanner reader = new Scanner(myFile);
            System.out.println("\nReading from file:");
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();
            
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
