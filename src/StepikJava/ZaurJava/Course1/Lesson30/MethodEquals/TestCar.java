package StepikJava.ZaurJava.Course1.Lesson30.MethodEquals;

public class TestCar {
    public static void main(String[] args) {
        Car car1 = new Car("red", "V4");
        Car car2 = new Car("red", "V4");
        Car car3 = new Car("black", "V8");

        System.out.println(car1.equals(car2)); // true
        System.out.println(car1.equals(car3)); // false

        // дефолтная реализация метода .toString()
        System.out.println(car1.toString()); // "StepikJava.ZaurJava.Lesson30.MethodEquals.Car@5b480cf9"
        System.out.println(car1); // "StepikJava.ZaurJava.Lesson30.MethodEquals.Car@5b480cf9"

        // перезаписанный метод .toString()
        System.out.println(car1.toString()); // color: red, engine: V4

    }
}
