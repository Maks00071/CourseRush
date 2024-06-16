package Module1.Level23.Tasks.CanNotClose;

import java.io.*;
import java.util.Base64;

/***** Закрыть нельзя оставить *****
 * Попробуй запустить программу. Как видишь, метод fromString работает нормально,
 * если передать в него валидную строку. Но если передать в него пустую строку,
 * то возникает исключение, и у объекта MyStream не отрабатывает метод close.
 *
 * Внеси исправление в метод fromString так, чтобы у объекта MyStream вызывался метод close,
 * даже если в fromString была передана пустая строка.
 *
 * Требования:
 * • Функционал метода fromString не должен изменится, если в него передана валидная строка.
 * • Метод fromString должен пробрасывать дальше возникающие исключения (не перехватывать).
 * • Метод fromString должен вызвать метод close у объекта MyStream,
 *   если в fromString была передана пустая строка.
 */

public class Solution {
    public static void main(String[] args) throws ClassNotFoundException {
        try {
            String string = toString(new MyClass("Съешь ещё этих мягких французских булок."));
            System.out.printf("Объект в виде строки: %s\n", string);

            MyClass myClass = (MyClass) fromString(string);
            System.out.println("Восстановленный объект: " + myClass);

            System.out.println();
            fromString("");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String toString(Serializable o) throws IOException {
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
             ObjectOutputStream oos = new ObjectOutputStream(baos)) {

            oos.writeObject(o);
            return Base64.getEncoder().encodeToString(baos.toByteArray());
        }
    }

    public static Object fromString(String s) throws IOException, ClassNotFoundException {
        byte[] data = Base64.getDecoder().decode(s);

        try (MyStream ms = new MyStream(data);
             ObjectInputStream ois = new ObjectInputStream(ms)) {
            Object o = ois.readObject();
            return o;
        }
    }
}


















