package StepikJava.ZaurJava.Course2.Lesson9.FileReader;

import java.io.FileReader;
import java.io.IOException;


public class FileReaderExample {
    public static void main(String[] args) throws IOException {
        FileReader reader = null;
        try {
            reader = new FileReader("FileWriterExp.txt");
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            System.out.println();
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            reader.close();
        }

        /*
        Много лет размышлял я над жизнью земной.
        Непонятного нет для меня под луной.
        Мне известно, что мне ничего не известно, —
        Вот последний секрет из постигнутых мной.
        Done!
         */
    }
}
