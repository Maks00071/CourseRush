package StepikJava.ZaurJava.Course1.Lesson11.Homework;

public class Car {

    private String color;
    private String engine;
    private int countDoors;

    public Car(String color, String engine, int countDoors) {
        this.color = color;
        this.engine = engine;
        this.countDoors = countDoors;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getCountDoors() {
        return countDoors;
    }

    public void setCountDoors(int countDoors) {
        this.countDoors = countDoors;
    }

    @Override
    public String toString() {
        return "The car has a color: " + color + ", a engine: " + engine +
                ", a count of doors: " + countDoors;
    }

}



















