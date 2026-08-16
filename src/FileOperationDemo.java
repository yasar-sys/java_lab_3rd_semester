import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileOperationDemo {

    public static void main(String[] args) {

        try {

            // CREATE
            File file = new File("example.txt");

            if (file.createNewFile()) {
                System.out.println("File created successfully");
            } else {
                System.out.println("File already exists");
            }

            // WRITE
            FileWriter writer = new FileWriter(file);
            writer.write("Hello, this is Java file handling.");
            writer.close();

            System.out.println("Data written successfully");

            // READ
            FileReader reader = new FileReader(file);

            int ch;

            System.out.println("File Content:");

            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }

            reader.close();

            System.out.println();

            // DELETE
            if (file.delete()) {
                System.out.println("File deleted successfully");
            } else {
                System.out.println("File deletion failed");
            }

        } catch (IOException e) {
            System.out.println("An error occurred");
        }
    }
}