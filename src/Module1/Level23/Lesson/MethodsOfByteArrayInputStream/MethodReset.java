package Module1.Level23.Lesson.MethodsOfByteArrayInputStream;

import java.io.IOException;
import java.io.ByteArrayInputStream;

/**
 * Метод сбрасывает положение буферизированного потока до последней отмеченной позиции.
 * Он занимает позицию метки 0, если явно не указана другая метка
 */

public class MethodReset {
    public static void main(String[] args) {
        byte[] array = {65, 66, 67, 68, 69};

        try (ByteArrayInputStream input = new ByteArrayInputStream(array)) {
            System.out.println("прочитали: " + input.read()); //прочитали: 65
            System.out.println("прочитали: " + input.read()); //прочитали: 66
            System.out.println("прочитали: " + input.read()); //прочитали: 67
            System.out.println("прочитали: " + input.read()); //прочитали: 68

            System.out.println("вызов метода reset()");

            input.reset(); //снова вернулись на метку 0

            System.out.println("прочитали: " + input.read()); //прочитали: 65
            System.out.println("прочитали: " + input.read()); //прочитали: 66
        }catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
















