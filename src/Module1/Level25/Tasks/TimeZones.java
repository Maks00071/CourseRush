package Module1.Level25.Tasks;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.TreeSet;

/***** Тренировка временных зон *****
 * Что общего у всех временных зон и Пекина?
 * Правильно! Они позволят нам потренироваться в использовании классов ZoneId и ZonedDateTime :)
 * -----
 * Реализуй два метода:
 * -----
 * - в методе getSortedZones верни множество TreeSet всех временных зон;
 * - в методе getBeijingTime верни текущую дату и время в Пекине
 *   (временная зона для него — "Asia/Shanghai").
 * Требования:
 * • Метод getSortedZones должен вернуть множество всех временных зон.
 * • Метод getBeijingDateTime должен вернуть текущую дату и время в Пекине.
 */

public class TimeZones {
    public static void main(String[] args) {
        TreeSet<String> sortedZones = getSortedZones();
        System.out.println(sortedZones.size());
        System.out.println(sortedZones.first());
        System.out.println(sortedZones.last());

        System.out.println(getBeijingDateTime());
    }

    static TreeSet<String> getSortedZones() {
        TreeSet<String> zonesSet = new TreeSet<>();
        zonesSet.addAll(ZoneId.getAvailableZoneIds());
        return zonesSet;
    }

    static ZonedDateTime getBeijingDateTime() {
        ZoneId zoneBeijing = ZoneId.of("Asia/Shanghai");
        return ZonedDateTime.now(zoneBeijing);
    }
}


















