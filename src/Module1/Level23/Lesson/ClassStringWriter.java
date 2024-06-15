package Module1.Level23.Lesson;

import java.io.StringWriter;
import java.io.IOException;
import java.util.Scanner;

public class ClassStringWriter {
    public static void main(String[] args) {
        try (StringWriter writer = new StringWriter();
            Scanner scanner = new Scanner(System.in)) {

            writer.write(scanner.nextLine());   //"Hello"
            writer.write(String.valueOf(scanner.nextLine()));   //123
            String result = writer.toString();
            System.out.println(result); //"Hello123"

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
