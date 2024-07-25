package Module2.Level29.Lesson.InterfaceCar;

public interface Car {

    public default void gas() {
        System.out.println("Gas!");
    }

    public default void brake() {
        System.out.println("Brake!");
    }
}
