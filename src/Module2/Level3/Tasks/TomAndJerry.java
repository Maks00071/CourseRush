package Module2.Level3.Tasks;

/***** Том, Джерри и Спайк *****
 * Создай классы Dog, Cat и Mouse.
 * Реализуй интерфейсы в добавленных классах, учитывая что:
 *  - Кот (Cat) может передвигаться, может кого-то съесть и может быть сам съеден.
 *  - Мышь (Mouse) может передвигаться, и ее могут съесть;
 *  - Собака (Dog) может передвигаться и съесть кого-то.
 * Требования:
 * • Класс Cat должен быть объявлен внутри класса Solution.
 * • Класс Dog должен быть объявлен внутри класса Solution.
 * • Класс Mouse должен быть объявлен внутри класса Solution.
 * • Кот (Cat) может передвигаться, может кого-то съесть и может быть сам съеден.
 * • Мышь (Mouse) может передвигаться и может быть съедена.
 * • Собака (Dog) может передвигаться и съесть кого-то.
 */

public class TomAndJerry {
    public static void main(String[] args) {
        Dog spike = new Dog();
        Cat tom = new Cat();
        Mouse jerry = new Mouse();

        spike.move();
        spike.eat();

        tom.move();
        tom.eat();
        tom.beEaten();

        jerry.move();
        jerry.beEaten();
    }

    /**
     * Может двигаться
     */
    interface Movable {
        void move();
    }

    /**
     * Может быть съеден
     */
    interface Edible {
        void beEaten();
    }

    /**
     * Может кого-нибудь съесть
     */
    interface Eat {
        void eat();
    }

    public static class Dog implements Movable, Eat {

        public void move() {
            System.out.println("The dog is moving!");
        }

        public void eat() {
            System.out.println("The dog is eating!");
        }
    }

    public static class Cat implements Movable, Eat, Edible {

        public void move() {
            System.out.println("The cat is moving!");
        }

        public void eat() {
            System.out.println("The cat is eating!");
        }

        public void beEaten() {
            System.out.println("The cat was eaten!");
        }
    }

    public static class Mouse implements Movable, Edible {

        public void move() {
            System.out.println("The mouse is moving!");
        }

        public void beEaten() {
            System.out.println("The mouse was eaten!");
        }
    }
}

























