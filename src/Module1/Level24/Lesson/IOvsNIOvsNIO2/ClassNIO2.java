package Module1.Level24.Lesson.IOvsNIOvsNIO2;

import java.io.IOException;
import java.nio.file.*;

/**
 * Проверим время копирования маленького файла (до 10 Мб) через NIO2
 */

public class ClassNIO2 {
    public static void main(String[] args) throws IOException {
        long currentMills = System.currentTimeMillis();
        long startMills = currentMills;

        Path sourceDirectory = Paths.get("C:\\Users\\maksim.korystov\\Documents\\file_test.txt");
        Path targetDirectory = Paths.get("C:\\Users\\maksim.korystov\\Documents\\file_testNIO2.txt");
        Files.copy(sourceDirectory, targetDirectory);

        currentMills = System.currentTimeMillis();
        System.out.println("Время выполнения в миллисекундах: " + (currentMills - startMills));  //=> Время выполнения в миллисекундах: 4
    }
}
