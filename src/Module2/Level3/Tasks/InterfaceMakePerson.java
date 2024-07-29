package Module2.Level3.Tasks;

/**
 * Есть public интерфейсы CanFly (летать), CanRun (бежать/ездить), CanSwim (плавать).
 * Добавь эти интерфейсы классам Human (человек), Duck (утка),
 * Penguin (пингвин), Airplane (самолет), и не забудь про реализацию
 * методов интерфейсов (в методах ничего делать не нужно).
 * -----
 * Требования:
 * • Класс Solution должен содержать интерфейс CanFly с одним методом fly().
 * • Класс Solution должен содержать интерфейс CanRun с одним методом run().
 * • Класс Solution должен содержать интерфейс CanSwim с одним методом swim().
 * • Человек должен уметь бегать и плавать.
 * • Утка должна уметь летать, плавать и бегать.
 * • Пингвин должен уметь плавать и бегать.
 * • Самолет должен уметь летат
 */

public class InterfaceMakePerson {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanRun {
        public void run();
    }

    public interface CanSwim {
        public void swim();
    }

    public class Human implements CanRun, CanSwim {

        public void run() {
            System.out.println("Human is running");
        }

        public void swim() {
            System.out.println("Human is swimming");
        }

    }

    public class Duck implements CanSwim, CanRun, CanFly {

        public void swim() {
            System.out.println("Duck is swimming");
        }

        public void run() {
            System.out.println("Duck is running");
        }

        public void fly() {
            System.out.println("Duck is flying");
        }

    }

    public class Penguin implements CanRun, CanSwim {

        public void run() {
            System.out.println("Penguin is running");
        }

        public void swim() {
            System.out.println("Penguin is swimming");
        }

    }

    public class Airplane implements CanFly {

        public void fly() {
            System.out.println("Airplane is flying");
        }

    }
}




















