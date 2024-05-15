package Module1.InheritanceCar;

//родительский класс

public class Car {
    private String model;
    private int maxSpeed;
    private int yearOfManufacture;

    public Car(String model, int maxSpeed, int yearOfManufacture) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfManufacture = yearOfManufacture;
    }

    public void gas() {
        //...газ
        System.out.println("Жмем на педаль газа!");
    }

    public void brake() {
        //...тормоз
        System.out.println("Жмем на педаль тормоза!");
    }
}
