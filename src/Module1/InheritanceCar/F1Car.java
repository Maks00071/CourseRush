package Module1.InheritanceCar;

public class F1Car extends Car {
    public F1Car(String model, int maxSpeed, int yearOfManufacture) {
        super(model, maxSpeed, yearOfManufacture);
    }
    public void pitStop() {
        //...пит-стоп делают только гоночные автомобили
        System.out.println("Заехали на пит-стоп!");
    }

    public static void main(String[] args) {
        F1Car formula1Car = new F1Car("Ferrari", 360, 2019);
        formula1Car.gas();
        formula1Car.brake();
        formula1Car.pitStop();
    }
}
