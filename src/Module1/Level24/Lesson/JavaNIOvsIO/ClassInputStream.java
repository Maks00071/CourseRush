package Module1.Level24.Lesson.JavaNIOvsIO;

import java.io.IOException;
import java.io.InputStream;
import java.io.FileInputStream;
import java.util.Scanner;


public class ClassInputStream {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             FileInputStream fin = new FileInputStream(scanner.nextLine())) {

            System.out.printf("File size: %d bytes\n", fin.available());
            int i = -1;
            while ((i=fin.read())!=-1) {
                System.out.print((char) i);
            }

        }catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
