package lecture3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Application {
    private static final String pathInput = "src/main/resources/input.txt";
    private static final String pathOutput = "src/main/resources/output_lec3.txt";

    public static void main(String[] args) {
        try (FileReader reader = new FileReader(pathInput);
             FileWriter writer = new FileWriter(pathOutput)
        ) {
            while (reader.ready()){
                writer.write(reader.read());
            }
        } catch (RuntimeException | IOException e) {
            System.out.println("Catched exception: " + e.getClass().getSimpleName());
        }
        System.out.println("Copied successfully");
    }
}
