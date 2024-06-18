package Module1.Level23.Lesson;

import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.Scanner;
import java.io.BufferedInputStream;


public class ClassFileInputStream {
    public static void main(String[] args) {
        Date date = new Date();

        try (Scanner scanner = new Scanner(System.in);
            FileInputStream fileInputStream = new FileInputStream(scanner.nextLine());
            BufferedInputStream bufferInput = new BufferedInputStream(fileInputStream, 200);
            FileOutputStream fileOutputStream = new FileOutputStream(scanner.nextLine())) {

            while (fileInputStream.available() > 0) {
                fileOutputStream.write(fileInputStream.read());
            }

            Date date1 = new Date();
            System.out.println(date1.getTime() - date.getTime());

        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}