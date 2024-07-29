package Module2.Level1.Tasks;

/***** Кит, коровий потомок *****
 * Переопредели метод getName в классе Whale(Кит), чтобы программа выводила на экран пустую строку.
 * -----
 * Требования:
 * • Программа должна выводить на экран пустую строку.
 * • Класс Whale должен наследоваться от класса Cow.
 * • Класс Whale должен переопределять метод getName().
 * • Метод main() должен вызывать метод getName() у объекта cow.
 * • Реализуй метод getName() класса Whale, чтобы программа выводила на экран пустую строку.
 * • Метод main() должен выводить на экран результат вызова метода getName().
 */

public class WhaleDescendantCow {
    public static void main(String[] args) {
        Cow cow = new Whale();
        System.out.println(cow.getName());
    }

    public static class Cow {
        public String getName() {
            return "Я - корова";
        }
    }

    public static class Whale extends Cow {
        public String getName() {
            return "";
        }
    }
}
