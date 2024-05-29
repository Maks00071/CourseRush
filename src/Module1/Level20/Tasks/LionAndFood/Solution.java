package Module1.Level20.Tasks.LionAndFood;

/*****Еда едой, а сон по расписанию*******
В методе eat добавь блок finally, чтобы лев ложился спать, даже если ему не удалось перекусить.

Ожидаемый вывод в случае, когда food != null:
    ищет еду
    нашел мясо
    все съел
    лег спать

Ожидаемый вывод когда food == null:
    ищет еду
    ничего не нашел
    лег спать голодным

Требования:
•	В методе eat должен быть блок finally.
•	Вывод должен соответствовать условию.
 */

public class Solution {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.eat(new Food("мясо"));
        lion.eat(null);
    }
}


















