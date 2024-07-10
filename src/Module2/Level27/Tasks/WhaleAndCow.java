package Module2.Level27.Tasks;

/**
 * Переопредели метод getName в классе Whale(Кит), чтобы программа выдавала:
 * "Я не корова, Я - кит."
 * -----
 * Требования:
 * • Программа должна выводить текст на экран.
 * • Класс Whale должен наследоваться от класса Cow.
 * • Класс Whale должен переопределять метод getName().
 * • Метод main() должен вызывать метод getName() у объекта cow.
 * • Переопределить метод getName в классе Whale(Кит), чтобы программа выводила на экран: "Я не корова, Я - кит."
 * • Метод main() должен выводить на экран результат вызова метода getName().
 */

public class WhaleAndCow {
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
            return "Я не корова, Я - кит.";
        }
    }
}






















