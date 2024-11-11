package StepikJava.ZaurJava.Course1.Lesson35.FunctionalInterface;

import java.util.ArrayList;
import java.util.function.Consumer;


public class TestCar {
    public static void main(String[] args) {

        ArrayList<Car> ourCars = ClassSupplierAndConsumer.createThreeCars(() -> new Car("Nissan Tiida", "silver metalic", 1.6));
        System.out.println("Our cars: " + ourCars);

//        ClassSupplierAndConsumer.changeCar(ourCars.get(0), car -> {
//            ourCars.get(0).setColor("Red");
//            ourCars.get(0).setEngine(2.4);
//            System.out.println("updated car: " + car);
//        });

        Consumer<Car> consumer = car -> {
            car.setColor("Red");
            car.setEngine(2.4);
            System.out.println("updated car: " + car);
        };

        consumer.accept(ourCars.get(0));

        System.out.println("ourCars: " + ourCars);

    }
}
