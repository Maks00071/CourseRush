package Module1.Level23.Lesson.MethodsOfByteArrayInputStream;

import java.io.IOException;
import java.io.ByteArrayInputStream;

/**
 * С помощью метода skip() можно пропустить определенное кол-во байтов и не считывать их
 */

public class MethodSkip {
    public static void main(String[] args) {
        byte[] array = {1, 2, 3, 4};
        try (ByteArrayInputStream input = new ByteArrayInputStream(array)) {
            input.skip(2); //пропускаем два первых байта

            while (input.available() > 0) {
                int data = input.read();
                System.out.print(data + ", "); // 3, 4,
            }
        }catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
