package Module1.Level25.Tasks;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.ZoneId;

/***** Лишь бы не запутаться *****
 * Можно ли, зная время в одном часовом поясе, определить время в другом?
 * Реши эту задачу в методе changeZone.
 * Его параметры:
 *  - fromTime — известное время;
 *  - fromZone — временная зона, в которой известно время;
 *  - toZone — временная зона, в которой нужно определить время.
 * Требования:
 * • Метод changeZone должен вернуть LocalDateTime во временной зоне toZone.
 */

public class NotAMess {
    public static void main(String[] args) {
        ZoneId zone1 = ZoneId.of("Zulu");
        ZoneId zone2 = ZoneId.of("Etc/GMT+8");
        System.out.println(ZonedDateTime.now(zone1));
        System.out.println(ZonedDateTime.now(zone2));

        LocalDateTime time = changeZone(LocalDateTime.of(2020, 3, 19, 1, 40), zone1, zone2);
        System.out.println(time);
    }

    static LocalDateTime changeZone(LocalDateTime fromDateTime, ZoneId fromZone, ZoneId toZone) {
        /*
        Метод .atZone() является методом класса LocalDateTime и используется для создания
        объекта ZonedDateTime из объекта LocalDateTime с указанием часового пояса.
        Это позволяет добавить информацию о часовом поясе к локальной дате и времени.
         */
        ZonedDateTime fromZonedDateTime = fromDateTime.atZone(fromZone);
        /*
        Метод .withZoneSameInstant() возвращает новое поясное время и дату в виде объекта
        типа ZonedDateTime в указанном часовом поясе
         */
        ZonedDateTime toZonedDateTime = fromZonedDateTime.withZoneSameInstant(toZone);

        return toZonedDateTime.toLocalDateTime();
    }
}























