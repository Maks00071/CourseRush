package Module2.Level29.Lesson.InterfaceCar;

public interface Car {

    default void gas() {
        System.out.println("Gas!");
    }

    default void brake() {
        System.out.println("Brake!");
    }
}
