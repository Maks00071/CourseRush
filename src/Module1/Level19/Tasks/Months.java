package Module1.Level19.Tasks;

/*
В классе Solution есть метод getMonthByIndex(int), который возвращает название месяца по его номеру,
начиная с 1. Твоя задача — переписать метод, используя только оператор switch
и ключевые слова case, break и default.

Требования:
• Метод getMonthByIndex(int) должен возвращать имя месяца по его номеру.
• В методе getMonthByIndex(int) должен использоваться только оператор множественного выбора switch.
 */

public class Months {
    public static void main(String[] args) {
        System.out.println(getMonthByIndex(4));
        System.out.println(getMonthByIndex(8));
        System.out.println(getMonthByIndex(12));
    }

    public static String getMonthByIndex(int monthIndex) {
        String monthString = null;
        switch (monthIndex) {
            case 1 -> monthString = "Январь";
            case 2 -> monthString = "Февраль";
            case 3 -> monthString = "Март";
            case 4 -> monthString = "Апрель";
            case 5 -> monthString = "Май";
            case 6 -> monthString = "Июнь";
            case 7 -> monthString = "Июль";
            case 8 -> monthString = "Август";
            case 9 -> monthString = "Сентябрь";
            case 10 -> monthString = "Октябрь";
            case 11 -> monthString = "Ноябрь";
            case 12 -> monthString = "Декабрь";
            default -> monthString = "Недействительный месяц";
        }
        return monthString;
    }
}























