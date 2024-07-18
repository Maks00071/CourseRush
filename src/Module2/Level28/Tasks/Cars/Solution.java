package Module2.Level28.Tasks.Cars;

/***** Конструируем дырчик *****
 * Чтобы у каждой машины был свой двигатель,
 * создай приватное неизменяемое поле engine в классе Car.
 * -----
 * Поле должно инициализироваться новым двигателем при создании машины.
 * -----
 * Методы машины должны вызывать соответствующие методы двигателя.
 * -----
 * Требования:
 * • Нельзя изменять класс Engine.
 * • В классе Car должно быть поле engine.
 * • Поле engine должно инициализироваться при создании объекта Car.
 * • Методы класса Car (start и turnOff) должны вызывать соответствующие методы класса Engine.
 */

public class Solution {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.turnOff();
    }
}

























