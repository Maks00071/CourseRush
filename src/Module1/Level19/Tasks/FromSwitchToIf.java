package Module1.Level19.Tasks;

/*
В классе Solution есть метод getTranslationForDayOfWeek(String), который возвращает
перевод дня недели с русского на английский. Твоя задача — переписать метод, используя
только оператор if-else.

Требования:
• Метод getTranslationForDayOfWeek(String) должен возвращать перевод дня недели с русского на английский.
• В методе getTranslationForDayOfWeek(String) должен использоваться только оператор if-else.
 */

public class FromSwitchToIf {
    public static void main(String[] args) {
        System.out.println(getTranslationForDayOfWeek("Вторник"));
        System.out.println(getTranslationForDayOfWeek("Пятница"));
        System.out.println(getTranslationForDayOfWeek("Высплюсенье"));
    }

    public static String getTranslationForDayOfWeek(String ru) {
        String en = null;
        if (ru.equalsIgnoreCase("понедельник")) {
            en = "Monday";
        } else if (ru.equalsIgnoreCase("вторник")) {
            en = "Tuesday";
        } else if (ru.equalsIgnoreCase("среда")) {
            en = "Wednesday";
        } else if (ru.equalsIgnoreCase("четверг")) {
            en = "Thursday";
        } else if (ru.equalsIgnoreCase("пятница")) {
            en = "Friday";
        } else if (ru.equalsIgnoreCase("суббота")) {
            en = "Saturday";
        } else if (ru.equalsIgnoreCase("воскресенье")) {
            en = "Sunday";
        } else {
            en = "Недействительный день недели";
        }
        return en;
    }
}






















