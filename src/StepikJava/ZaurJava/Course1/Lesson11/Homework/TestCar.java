package StepikJava.ZaurJava.Course1.Lesson11.Homework;

public class TestCar {

    /**
     * Метод изменяет количество дверей у переданного объекта Car
     * @param car - изменяемый объект Car
     * @param doors - количество дверей
     */
    public static void changeCountDoors(Car car, int doors) {
        car.setCountDoors(doors);
    }

    /**
     * Метод меняет местами цвета у переданных объектов Car
     * @param car1 - первый изменяемый объект Car
     * @param car2 - второй изменяемый объект Car
     */
    public static void changeColors(Car car1, Car car2) {
        String color = car1.getColor();
        car1.setColor(car2.getColor());
        car2.setColor(color);
    }

    public static void main(String[] args) {

        Car car1 = new Car("Red", "V6", 4);
        Car car2 = new Car("Black", "V8", 2);

        System.out.println("The car1: " + car1.toString());
        System.out.println("The car2: " + car2.toString());

        System.out.println("The cars changed!");

        changeCountDoors(car1, 5);
        changeColors(car2, car1);

        System.out.println("The car1: " + car1.toString());
        System.out.println("The car2: " + car2.toString());
    }
}
