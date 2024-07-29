package Module2.Level1.Lesson.AbstractClass;

/**
 * Класс максимально абстрактно описывает нужную нам сущность — автомобиль (Car)
 * Наш абстрактный класс — это просто «чертеж»,
 * по которому мы позже будем создавать классы-автомобили
 */

public abstract class Car {

    private String model;
    private String color;
    private int maxSpeed;

    public abstract void gas();

    public abstract void brake();

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
































