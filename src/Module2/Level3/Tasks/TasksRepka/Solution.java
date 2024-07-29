package Module2.Level3.Tasks.TasksRepka;

import java.util.ArrayList;
import java.util.List;

/***** Репка *****
 * Давай напишем программу по мотивам сказки "Репка":
 * Реализуй интерфейс RepkaItem в классе Person.
 * В классе Person реализуй метод pull(Person person),
 * который выводит фразу типа '<name> за <person>'.
 * Пример:
 * Бабка за Дедку
 * Дедка за Репку
 * -----
 * Требования:
 * • Интерфейс RepkaItem должен быть реализован в классе Person.
 * • В классе Person должен быть реализован метод pull() c одним параметром типа Person.
 * • Метод pull в классе Person должен выводить на экран фразу типа '<name> за <person>'.
 *   Например: Бабка за Дедку.
 * • В результате выполнения метода main() на экран должен быть выведен
 *   краткий вариант сказки про Репку.
 */

public class Solution {
    public static void main(String[] args) {
        List<Person> plot = new ArrayList<>();
        plot.add(new Person("Репка", "Репку"));
        plot.add(new Person("Дедка", "Дедку"));
        plot.add(new Person("Бабка", "Бабку"));
        plot.add(new Person("Внучка", "Внучку"));
        RepkaStory.tell(plot);
    }
}






















