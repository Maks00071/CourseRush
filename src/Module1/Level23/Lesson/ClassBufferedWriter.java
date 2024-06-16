package Module1.Level23.Lesson;

import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.Scanner;

/**
 * Напишем программу, которая создаст файл и запишет в него сообщение.
 * Путь в папку и название файла вводить с клавиатуры
 */

public class ClassBufferedWriter {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(scanner.nextLine()))) {

            String message = "Привет, Амиго! Это очень важное сообщение!";
            bufferedWriter.write(message, 0, 14);
            bufferedWriter.newLine();
            bufferedWriter.write(message, 15, 27); //с 15-го символа до 27-го

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
