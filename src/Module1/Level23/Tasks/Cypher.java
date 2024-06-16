package Module1.Level23.Tasks;

import java.io.IOException;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;

/***** Шифр *****
 * Зашифруй сообщение — перепиши из String переменной (параметра метода encrypt)
 * байты в ByteArrayOutputStream по определенному правилу:
 *
 *  первый, последний, второй, предпоследний, третий, ....
 *
 * Требования:
 * • Метод encrypt должен возвращать поток содержащий все байты из строки message.
 * • В возвращенном потоке байты должны быть перемешаны в соответствии с условием.
 */

public class Cypher {
    public static void main(String[] args) {
        System.out.println(encrypt("abcdefghi"));
    }

    public static ByteArrayOutputStream encrypt(String message) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        byte[] bytes = message.getBytes(StandardCharsets.UTF_8);
        for (int i = 0; i < bytes.length / 2; i++) {
            outputStream.write(bytes[i]);
            outputStream.write(bytes[bytes.length - i - 1]);
        }
        if (bytes.length % 2 == 1) {
            outputStream.write(bytes[bytes.length/2]);
        }
        return outputStream;
    }
}

























