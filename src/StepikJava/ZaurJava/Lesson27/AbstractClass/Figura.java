package StepikJava.ZaurJava.Lesson27.AbstractClass;

abstract class Figura {

    int countSide;

    abstract void square();
    abstract void perimeter();

    public void showInfo() {
        System.out.println("This is the object of figure!");
    }
}
