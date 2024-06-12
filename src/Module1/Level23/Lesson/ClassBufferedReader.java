package Module1.Level23.Lesson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ClassBufferedReader {
    public static void main(String[] args) {
        String src = "c:\\projects\\log.txt";

        try (FileReader in = new FileReader(src);
            BufferedReader reader = new BufferedReader(in)) {

            while (reader.ready()) {
                String line = reader.readLine();
                System.out.println(line);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
