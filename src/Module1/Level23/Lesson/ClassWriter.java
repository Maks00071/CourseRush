package Module1.Level23.Lesson;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class ClassWriter {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
            FileReader reader = new FileReader(scanner.nextLine());
            FileWriter writer = new FileWriter(scanner.nextLine())) {

            char[] buffer = new char[65536];
            while (reader.ready()) {
                int real = reader.read(buffer);
                writer.write(buffer, 0, real);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
