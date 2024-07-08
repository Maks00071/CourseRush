package Module1.Level25.Tasks;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * В методе main выведи на экран переменную localDateTime в таком виде:
 * 19.03.2020г. 5ч.4мин
 * -----
 * Требования:
 * • Метод main должен вывести в консоли значение
 *   переменной localDateTime согласно шаблону.
 */

public class JustPattern {
    static LocalDateTime localDateTime = LocalDateTime.now();

    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyyг. Hч.mмин");
        String text = formatter.format(localDateTime);
        System.out.println(text);
    }
}

















