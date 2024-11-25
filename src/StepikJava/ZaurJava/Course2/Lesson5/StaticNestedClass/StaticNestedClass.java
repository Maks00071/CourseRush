package StepikJava.ZaurJava.Course2.Lesson5.StaticNestedClass;

public class StaticNestedClass {
    public static void main(String[] args) {
        Car.Engine engine1 = new Car.Engine(256);
        System.out.println(engine1); // "My Engine: {horsePower=256}"

        Car car1 = new Car("red", 2, engine1);
        System.out.println(car1);
        // "My Car: {color='red', doorCount=2, engine=My Engine: {horsePower=256}}"


    }
}
