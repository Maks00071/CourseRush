package Module1.InheritanceCar;

public class Sedan extends Car {
    public Sedan (String model, int maxSpeed, int yearOfManufacture) {
        super(model, maxSpeed, yearOfManufacture);
    }

    public static void main(String[] args) {
        Sedan sedan = new Sedan("Lada", 160, 2020);
    }
}
