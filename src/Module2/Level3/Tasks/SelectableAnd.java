package Module2.Level3.Tasks;

/**
 * Создай класс Screen и реализуй в нем интерфейсы Selectable и Updatable. Не забудь реализовать методы!
 * -----
 * Требования:
 * • Класс Screen должен реализовывать (implements) интерфейс Selectable.
 * • Класс Screen должен реализовывать (implements) интерфейс Updatable.
 * • В классе Screen должны быть реализованы методы интерфейса Selectable.
 * • В классе Screen должны быть реализованы методы интерфейса Updatable.
 */

public class SelectableAnd {
    public static void main(String[] args) {

    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable {
        void refresh();
    }

    public static class Screen implements Selectable, Updatable {

        public void onSelect() {
            System.out.println("It was selected!");
        }

        public void refresh() {
            System.out.println("It was updated!");
        }

    }
}



























