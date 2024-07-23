package Module2.Level29.Tasks;

/**
 * Есть public интерфейсы CanFly (летать), CanMove (передвигаться), CanEat (есть).
 * Добавь эти интерфейсы классам Dog (собака), Car (автомобиль),
 * Duck (утка), Airplane (самолет).
 * -----
 * Требования:
 * • Класс Solution должен содержать интерфейс CanFly с одним методом fly().
 * • Класс Solution должен содержать интерфейс CanMove с одним методом move().
 * • Класс Solution должен содержать интерфейс CanEat с одним методом eat().
 * • Собака должна уметь передвигаться и есть.
 * • Автомобиль должен уметь передвигаться.
 * • Самолет должен уметь передвигаться и летать.
 * • Утка должна уметь передвигаться, летать и есть.
 */

public class InterfaceSolution {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();
        Duck duck = new Duck();
        Airplane airplane = new Airplane();

        dog.eat();
        dog.move();
        car.move();
        duck.eat();
        duck.fly();
        duck.move();
        airplane.fly();
        airplane.move();
    }

    public interface CanFly {
        public void fly();
    }

    public interface CanMove {
        public void move();
    }

    public interface CanEat {
        public void eat();
    }

    static class Dog implements CanMove, CanEat {

        public void move() {
            System.out.println("Dog is moving");
        }

        public void eat() {
            System.out.println("Dog is eating");
        }
    }

    static class Car implements CanMove {

        public void move() {
            System.out.println("Car is moving");
        }
    }

    static class Duck implements CanMove, CanEat, CanFly {

        public void move() {
            System.out.println("Duck is moving");
        }

        public void eat() {
            System.out.println("Duck is eating");
        }

        public void fly() {
            System.out.println("Duck is flying");
        }
    }

    static class Airplane implements CanFly, CanMove {

        public void fly() {
            System.out.println("Airplane if flying");
        }

        public void move() {
            System.out.println("Airplane if moving");
        }
    }
}





















