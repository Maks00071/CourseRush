package Module1.Level23.Tasks;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.InputStream;


/**
 * Программа считывает из консоли строку и выводит ее на экран, чередуя регистр символов:
 *  первый символ — в нижнем регистре,
 *  второй — в верхнем,
 *  третий — в нижнем, и т.д.
 * Не меняя функциональности программы, перепиши код с использованием BufferedReader
 * для чтения из консоли.
 *
 * Требования:
 * •Программа должна считать из консоли строку и вывести ее на экран, чередуя регистр символов.
 * •Для чтения из консоли в программе должен быть использован BufferedReader вместо Scanner.
 */

public class ReadingFromConsole {
    public static void main(String[] args) {
        try (InputStream stream = System.in;
            InputStreamReader input = new InputStreamReader(stream);
            BufferedReader reader = new BufferedReader(input)) {

            String line = reader.readLine();
            char[] chars = line.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (i % 2 == 0) {
                    System.out.print(String.valueOf(chars[i]).toLowerCase());
                } else {
                    System.out.print(String.valueOf(chars[i]).toUpperCase());
                }
            }
        } catch (IOException e) {
            System.out.println("Something went wrong: " + e);
        }
    }
}





















