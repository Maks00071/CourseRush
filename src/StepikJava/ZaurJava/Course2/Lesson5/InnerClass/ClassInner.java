package StepikJava.ZaurJava.Course2.Lesson5.InnerClass;

public class ClassInner {
    public static void main(String[] args) {
        Car car1 = new Car("black", 4, 200);
        System.out.println(car1);
        // "My Car: {color='black', doorCount=4, engine=My Engine {horsePower=200}}"
    }
}
