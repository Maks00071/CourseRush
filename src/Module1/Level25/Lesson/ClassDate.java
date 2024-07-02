package Module1.Level25.Lesson;

import java.util.Date;
import java.text.SimpleDateFormat;

public class ClassDate {
    public static void main(String[] args) {
        //зададим дату и время
        Date current = new Date(105, 5, 4, 12, 15, 0);

        System.out.println(current.getYear());
        System.out.println(current.getMonth());
        System.out.println(current.getDate());
        System.out.println(current.getDay());
        System.out.println(current);

        //выполним преобразование даты в нужный нам формат
        Date current2 = new Date(105, 5, 4, 12, 15, 0);
        SimpleDateFormat formatter = new SimpleDateFormat("MMM-dd-yyy");
        String message = formatter.format(current2);
        System.out.println(message);
    }
}
