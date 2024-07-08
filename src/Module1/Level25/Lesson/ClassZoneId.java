package Module1.Level25.Lesson;

import java.time.ZoneId;

public class ClassZoneId {
    public static void main(String[] args) {
        ZoneId zone = ZoneId.of("Africa/Cairo");
        System.out.println(zone);

        //посмотрим все временные зоны
        for (String s : ZoneId.getAvailableZoneIds()) {
            System.out.println(s);
        }
    }
}
