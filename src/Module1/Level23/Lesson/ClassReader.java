package Module1.Level23.Lesson;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class ClassReader {
    public static void main(String[] args) {
        String src = "c:\\projects\\log.txt";
        String dest = "c:\\projects\\copy.txt";

        try (FileReader reader = new FileReader(src);
            FileWriter writer = new FileWriter(dest)) {

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
