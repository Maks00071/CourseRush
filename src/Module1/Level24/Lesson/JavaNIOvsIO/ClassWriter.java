package Module1.Level24.Lesson.JavaNIOvsIO;

import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;

public class ClassWriter {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
            FileWriter fileWriter = new FileWriter(scanner.nextLine())) {

            fileWriter.write("Это простой пример,\n в котором мы осуществляем\n " +
                    "с помощью языка Java\n запись в файл\n и чтение из файла\n");
            fileWriter.flush();

        } catch (IOException ex) {
            System.out.println(ex.getStackTrace());
        }
    }
}
