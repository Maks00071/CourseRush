package Module1.Level24.Lesson.JavaNIOvsIO;

import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;


public class ClassReader {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
            FileReader fileReader = new FileReader(scanner.nextLine())) {

            char[] buffer = new char[50];
            fileReader.read(buffer);

            for (char elem : buffer) {
                System.out.print(elem);
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
