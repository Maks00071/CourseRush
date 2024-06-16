package Module1.Level23.Lesson.MethodsOfByteArrayInputStream;

import java.io.IOException;
import java.io.ByteArrayInputStream;

/**
 * Метод mark() класса ByteArrayInputStream устанавливает внутреннюю метку в текущей позиции байта,
 * то есть сразу после чтения предыдущего байта. Этот метод принимает параметр,
 * указывающий, сколько байтов можно прочитать после этой метки, прежде чем она станет
 * недействительной. По умолчанию, если метка не была установлена явно,
 * ByteArrayInputStream помечает позицию 0 или позицию со смещением, переданным его конструктору.
 * Важно отметить, что для данного класса отметка readAheadLimit недействительна.
 */

public class MethodMark {
    public static void main(String[] args) {
        byte[] array = {65, 66, 67, 68, 69};

        try (ByteArrayInputStream input = new ByteArrayInputStream(array)) {
            //читаем три первых байта
            System.out.println("прочитали: " + input.read()); //прочитали: 65
            System.out.println("прочитали: " + input.read()); //прочитали: 66
            System.out.println("прочитали: " + input.read()); //прочитали: 67

            //устанавливаем стартовую позицию для считывания следующего байта (0 по-умолчанию)
            input.mark(5);

            System.out.println("прочитали: " + input.read()); //прочитали: 68
            System.out.println("прочитали: " + input.read()); //прочитали: 69

            System.out.println("вызов метода reset()");
            input.reset(); //скинули на метку mark

            System.out.println("прочитали: " + input.read()); //прочитали: 68
            System.out.println("прочитали: " + input.read()); //прочитали: 69
        }catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
