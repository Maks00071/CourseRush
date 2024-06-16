package Module1.Level23.Tasks;

import java.io.IOException;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

/**
 * Создай публичный статический метод bytesToChars(ByteArrayInputStream stream, int n),
 * возвращающий char[].
 * Метод должен считать n первых байт из stream, и преобразовать их в массив символов.
 * Возвращенный массив должен иметь длину n, или меньше, если в потоке меньше чем n байт.
 * Считаем, что каждый байт соответствует одному символу.
 *
 * Требования:
 * • В классе Solution должен быть создан метод
 *   public static char[] bytesToChars(ByteArrayInputStream stream, int n).
 * • Метод bytesToChars должен преобразовать первые n байт из stream в символы
 *   и вернуть их в виде массива.
 */

public class BytesToChars {
    public static void main(String[] args) {
        ByteArrayInputStream stream = new ByteArrayInputStream("O sole, o sole mio!\nSta 'nfronte a te!\n Sta 'nfronte a te!".getBytes(StandardCharsets.UTF_8));
        System.out.println(new String(bytesToChars(stream, 38)));
    }

    public static char[] bytesToChars(ByteArrayInputStream stream, int n) {
        int minLength = Math.min(n, stream.available());

        char[] result = new char[minLength];

        for (int i = 0; i < result.length; i++) {
            result[i] = (char) stream.read();
        }
        return result;
    }
}





















