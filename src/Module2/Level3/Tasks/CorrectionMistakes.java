package Module2.Level3.Tasks;

/***** Исправление ошибок *****
 * Переделай наследование в классах и интерфейсах так,
 * чтобы программа компилировалась и продолжала делать то же самое.
 * Класс Hobby должен реализовывать интерфейсы Desire, Dream.
 * -----
 * Требования:
 * • Интерфейс Desire должен быть реализован в классе Hobby.
 * • Интерфейс Dream должен быть реализован в классе Hobby.
 * • Класс Hobby должен содержать статическую переменную INDEX.
 * • Метод toString в классе Hobby должен инкрементировать
 *   и возвращать переменную INDEX в виде строки.
 */

public class CorrectionMistakes {
    public static void main(String[] args) {
        System.out.println(Dream.HOBBY.toString());
        System.out.println(new Hobby().INDEX);
    }

    interface Desire {

    }

    interface Dream {
        public static Hobby HOBBY = new Hobby();
    }

    static class Hobby implements Desire, Dream {
        static int INDEX = 1;

        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }
}





















