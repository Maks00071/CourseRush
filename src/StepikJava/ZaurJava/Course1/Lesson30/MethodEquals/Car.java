package StepikJava.ZaurJava.Course1.Lesson30.MethodEquals;

public class Car {

    String color;
    String engine;

    public Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    // перезапишем метод .equals под класс Car
    @Override
    public boolean equals(Object obj) {
        // проверяем, является ли объект obj IS-A класса Car
        if (obj instanceof Car) {
            // если объект obj IS-A Car, то кастим obj
            Car car = (Car) obj;
            // сравниваем требуемые параметры (ссылаются ли они на один и тот же объект)
            return (color.equals(car.color) && engine.equals(car.engine));
        } else {
            return false;
        }
    }

    // перезапишем метод .toString()
    @Override
    public String toString() {
        return "color: " + color + ", engine: " + engine;
    }

}
