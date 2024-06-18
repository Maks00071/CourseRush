package Module1.Level23.Lesson;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;


public class ClassFileOutputStream {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
            FileOutputStream fileOutputStream = new FileOutputStream(scanner.nextLine(), true)) {

            String message = scanner.nextLine() + "\r\n";
            fileOutputStream.write(message.getBytes());

        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}

//C:\\Users\\maksim.korystov\\new_file.txt
//Привет! Добро пожаловать на JavaRush - лучший сайт для тех, кто хочет стать программистом!