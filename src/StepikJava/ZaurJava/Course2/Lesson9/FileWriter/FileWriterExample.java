package StepikJava.ZaurJava.Course2.Lesson9.FileWriter;

import java.io.FileWriter;
import java.io.IOException;


public class FileWriterExample {
    public static void main(String[] args) throws IOException {
        String rubai = """
                Много лет размышлял я над жизнью земной.
                Непонятного нет для меня под луной.
                Мне известно, что мне ничего не известно, —
                Вот последний секрет из постигнутых мной.""";

        FileWriter writer = null;
        try {
            // абсолютный путь
//            writer = new FileWriter("C:\\Users\\corys\\IdeaProjects\\WorkWithFiles\\FileWriterExp");

            // относительный путь - появится в корне данного проекта
            writer = new FileWriter("FileWriterExp.txt");

            for (int i = 0; i < rubai.length(); i++) {
                writer.write(rubai.charAt(i));
            }
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            writer.close();
        }
    }
}
