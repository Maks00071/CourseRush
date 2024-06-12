package Module1.Level23.Lesson;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class InputOutputStream {
    public static void main(String[] args) {
        String src = "c:\\projects\\log.txt";
        String dest = "c:\\projects\\copy.txt";

        try(FileInputStream input = new FileInputStream(src);
            FileOutputStream output = new FileOutputStream(dest)) {

            byte[] buffer = new byte[65536];
            while (input.available() > 0) {
                int real = input.read(buffer);
                output.write(buffer, 0, real);
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }
}
