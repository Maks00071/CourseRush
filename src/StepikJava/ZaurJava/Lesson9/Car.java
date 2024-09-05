package StepikJava.ZaurJava.Lesson9;

public class Car {
    private String color;
    String engine;
    static int count;

    public Car(String color, String engine) {
        count++;    // кол-во созданных машин
        this.color = color;
        this.engine = engine;
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

    public void showColor() {
        System.out.println("The color of cars is " + getColor());
    }



}



















