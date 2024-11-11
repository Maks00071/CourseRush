package StepikJava.ZaurJava.Course1.Lesson35.FunctionalInterface;

import java.util.function.Supplier;
import java.util.function.Consumer;


public class Car {

    private String model;
    private String color;
    private double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

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

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }


    @Override
    public String toString() {
        return "Our car is " + getModel() + ", color is "
                + getColor() + " and an engine is " + getEngine();
    }

}































