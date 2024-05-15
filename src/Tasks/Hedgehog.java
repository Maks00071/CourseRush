package Tasks;

/*
Наша задача — накормить ежика. Нужно в методе "main" создать один объект "Apple" и
один объект "Hedgehog", у которого вызвать метод "eat" и передать нужный аргумент — яблоко.

        Требования:
•	В классе "Hedgehog" должен существовать вложенный класс "public static class Apple".
•	В классе "Hedgehog" должен существовать не статический, "публичный void метод eat(Apple)".
•	В методе "main" должен быть создан один объект класса "Apple".
•	В методе "main" должен быть создан один объект класса "Hedgehog".
•	В методе "main" у объекта класса "Hedgehog" нужно вызвать метод "eat" и передать
    созданный объект класс "Apple".
*/

public class Hedgehog {

    public void eat(Apple apple) {
        System.out.println("Яблоко было съедено!");
    }

    public static void main(String[] args) {
        Apple apple = new Apple();
        Hedgehog hedgehog = new Hedgehog();
        hedgehog.eat(apple);
    }

    public static class Apple {

    }
}
