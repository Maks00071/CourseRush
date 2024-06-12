package Module1.Level23.Tasks;

import java.io.*;
import java.util.Scanner;

/***** Перепутанные байты ***********
 * Напиши программу, которая считывает из консоли путь к файлу1 и путь к файлу2.
 * Далее все байты из файла1 записывает в файл2, но при этом меняет их местами по такому принципу:
 *      первый со вторым, третий с четвертым и т. д.
 * Если последний байт в файле1 нечетный, пишем его в файл2 как есть.
 * Для чтения и записи файлов используй FileInputStream и FileOutputStream.
 * Требования:
 * •Программа должна считать из консоли пути к файлам.
 * •Программа должна переписывать байты из одного файла в другой согласно условию.
 * •Для чтения и записи файлов должны быть использованы FileInputStream и FileOutputStream.
 * •Потоки для чтения и записи должны быть закрыты.
 */

public class MixedUpBytes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pathToFile1 = scanner.nextLine();
        String pathToFile2 = scanner.nextLine();

        try (FileInputStream input = new FileInputStream(pathToFile1);
             FileOutputStream output = new FileOutputStream(pathToFile2)) {

            byte[] bytesIn = input.readAllBytes(); //считываем все байты из первого потока
            byte[] bytesOut = new byte[bytesIn.length]; //создаем массив под второй поток

            for (int i = 0; i < bytesIn.length; i+=2) {
                if (i < bytesIn.length - 1) {
                    bytesOut[i] = bytesIn[i + 1];
                    bytesOut[i + 1] = bytesIn[i];
                } else {
                    bytesOut[i] = bytesIn[i];
                }
            }
            output.write(bytesOut);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}





















