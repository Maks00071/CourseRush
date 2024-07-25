package Module2.Level29.Lesson.InterfaceCar;

public class F1Car implements Car {

    @Override
    public void brake() {
        System.out.println("F1Car тормозит по другому!");
    }
}
