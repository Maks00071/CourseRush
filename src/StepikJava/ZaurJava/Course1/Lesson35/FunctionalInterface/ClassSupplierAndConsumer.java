package StepikJava.ZaurJava.Course1.Lesson35.FunctionalInterface;

import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.function.Consumer;


public class ClassSupplierAndConsumer {

    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier) {
        ArrayList<Car> carList = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            carList.add(carSupplier.get());
        }
        return carList;
    }

    public static void changeCar(Car car, Consumer consumer) {
        consumer.accept(car);
    }

}
