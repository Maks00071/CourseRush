package Module1.Level19.Tasks.TheNextMonth;

/**********Следующий месяц, пожалуйста*********
В классе Solution реализуй метод getNextMonth, который должен возвращать следующий месяц,
а если передан последний месяц, возвращать первый. Используй методы values и ordinal.

Требования:
•	Реализуй метод public static Month getNextMonth(Month): он должен работать согласно условию.
•	В методе getNextMonth должны использоваться методы ordinal() и values().
 */

public class Solution {
    public static void main(String[] args) {
        System.out.println(getNextMonth(ArrayMonths.JANUARY));
        System.out.println(getNextMonth(ArrayMonths.JULY));
    }

    public static ArrayMonths getNextMonth(ArrayMonths month) {
        int indexOfMonth = month.ordinal();
        if (indexOfMonth == 11) {
            return month.values()[0];
        }
        return month.values()[indexOfMonth+1];
    }
}
