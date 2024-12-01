package StepikJava.ZaurJava.Course2.Lesson6.Supplier;

import java.util.ArrayList;
import java.util.function.Supplier;


public class SupplierTest {
    public static void main(String[] args) {
        ArrayList<Car> ourCars = createThreeCars(() ->
                new Car("Nissan", "red", 2.0));

        System.out.println("Our Cars: " + ourCars);
        // Our Cars:
        // [
        // Car{model='Nissan', color='red', engine=2.0},
        // Car{model='Nissan', color='red', engine=2.0},
        // Car{model='Nissan', color='red', engine=2.0}
        // ]
    }

    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier) {
        ArrayList<Car> cars = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            cars.add(carSupplier.get());
        }

        return cars;
    }
}

























