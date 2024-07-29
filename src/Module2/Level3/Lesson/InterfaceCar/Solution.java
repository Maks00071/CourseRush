package Module2.Level3.Lesson.InterfaceCar;

public class Solution {
    public static void main(String[] args) {
        Sedan sedan = new Sedan();
        Truck truck = new Truck();
        F1Car f1Car = new F1Car();

        sedan.gas();
        truck.brake();
        f1Car.gas();
        f1Car.brake();
    }
}
