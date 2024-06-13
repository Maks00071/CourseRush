package Module1.Level23.Lesson;

import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;


public class OutputStreams {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in);
            FileInputStream input = new FileInputStream(scanner.nextLine());
            FileOutputStream output = new FileOutputStream(scanner.nextLine())) {

            byte[] buffer = new byte[65536]; //64Kb
            while (input.available() > 0) {
                int real = input.read(buffer);
                output.write(buffer, 0, real);

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
