package StepikJava.ZaurJava.Course2.Lesson6.Consumer;

import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.function.Consumer;


public class ConsumerTest {
    public static void main(String[] args) {
        ArrayList<Car> myCars = createThreeCars(() -> new Car("BMW", "White", 3.5));

        System.out.println("myCars: " + myCars);
        /*
        myCars:
        [
        Car{model='BMW', color='White', engine=3.5},
        Car{model='BMW', color='White', engine=3.5},
        Car{model='BMW', color='White', engine=3.5}
        ]
         */

        System.out.println("---------------------------------------");

        changeCar(myCars.get(0), car ->
            {car.setColor("red");
            car.setEngine(5.0);
            System.out.println("upgraded car: " + car);
            });
        // upgraded car: Car{model='BMW', color='red', engine=5.0}
    }

    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier) {
        ArrayList<Car> cars = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            cars.add(carSupplier.get());
        }

        return cars;
    }

    public static void changeCar(Car car, Consumer<Car> carConsumer) {
        carConsumer.accept(car);
    }


}
