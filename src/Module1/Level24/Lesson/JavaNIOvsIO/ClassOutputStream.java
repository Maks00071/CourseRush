package Module1.Level24.Lesson.JavaNIOvsIO;

import java.io.IOException;
import java.io.FileOutputStream;
import java.util.Scanner;


public class ClassOutputStream {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
            FileOutputStream outputStream = new FileOutputStream(scanner.nextLine())) {

            String textForWriting = scanner.nextLine();
            //переводим строку для записи в байты
            byte[] buffer = textForWriting.getBytes();

            outputStream.write(buffer, 0, buffer.length);
            System.out.println("The file has been written");

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
