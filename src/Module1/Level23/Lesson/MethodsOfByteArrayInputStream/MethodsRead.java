package Module1.Level23.Lesson.MethodsOfByteArrayInputStream;

import java.io.IOException;
import java.io.ByteArrayInputStream;

/**
 * Когда нужно читать байты из ByteArrayInputStream так же, как и из обычного InputStream,
 * можно использовать метод read()
 */

public class MethodsRead {
    public static void main(String[] args) {
        byte[] array = {1, 2, 3, 4};

        try (ByteArrayInputStream input = new ByteArrayInputStream(array)) {

            for (int i = 0; i < array.length; i++) {
                int data = input.read();
                System.out.print(data + ", "); // 1, 2, 3, 4,
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
