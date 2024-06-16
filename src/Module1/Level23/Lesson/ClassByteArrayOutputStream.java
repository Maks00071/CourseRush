package Module1.Level23.Lesson;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Реализация методов класса ByteArrayOutputStream
 */

public class ClassByteArrayOutputStream {
    public static void main(String[] args) {
        try (ByteArrayOutputStream outputByte = new ByteArrayOutputStream();
             Scanner scanner = new Scanner(System.in);
             FileOutputStream fileOutputStream = new FileOutputStream(scanner.nextLine())) {

            //запись одного байта
            while (outputByte.size() != 8) {
                outputByte.write("javarush".getBytes());
            }

            //запись всего массива байтов
            String value = "\nWelcome to Java\n";
            byte[] arrBytes = value.getBytes(); //[10, 87, 101, 108, 99, 111, 109, 101, 32, 116, 111, 32, 74, 97, 118, 97, 10]
            outputByte.write(arrBytes);

            //запись массива по размерности
            String javaRush = "JavaRush";
            byte[] b = javaRush.getBytes();
            outputByte.write(b, 4, 4); //Rush

            outputByte.write(80);
            outputByte.writeTo(fileOutputStream);

        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}


























