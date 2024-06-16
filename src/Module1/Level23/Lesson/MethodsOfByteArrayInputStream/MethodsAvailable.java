package Module1.Level23.Lesson.MethodsOfByteArrayInputStream;

import java.io.IOException;
import java.io.ByteArrayInputStream;

/**
 * Если вы хотите проверить, есть ли что-то в вашем буфере,
 * можно вызвать метод available()
 */

public class MethodsAvailable {
    public static void main(String[] args) {
        byte[] array = {1, 2, 3, 4};

        try (ByteArrayInputStream input = new ByteArrayInputStream(array)) {
            //количество доступных для чтения байтов меняется после каждого чтения из буфера
            System.out.println("байтов, доступных для чтения " + input.available()); //байтов, доступных для чтения 4

            input.read();
            System.out.println("байтов, свободных для чтения " + input.available()); //байтов, свободных для чтения 3

            input.read();
            System.out.println("байтов, свободных для чтения " + input.available()); //байтов, свободных для чтения 2
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
