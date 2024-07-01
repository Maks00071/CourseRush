package Module1.Level25.Tasks;

import java.util.Date;
import java.text.SimpleDateFormat;

/***** Чиним формат *****
 * Исправь ошибку, чтобы программа вывела "2010-01-06".
 * Инициализацию переменной date не меняй.
 * -----
 * Требования:
 * • Программа должна вывести: 2010-01-06
 * • Должна быть исправлена одна ошибка.
 */

public class RepairOfFormat {
    public static void main(String[] args) {
        Date date = new Date("6 January 2010");
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");  //"mm" -> "MM"
        System.out.println(formatter.format(date));
    }
}
