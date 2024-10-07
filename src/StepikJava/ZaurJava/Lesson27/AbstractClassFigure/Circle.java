package StepikJava.ZaurJava.Lesson27.AbstractClassFigure;

public class Circle extends Figure {

    int countSide = 0;
    double radius = 5.6;

//    public Circle(int countSide) {
//        super(countSide);
//    }

    public void square() {
        System.out.println("The square of circle = " + 3.14 * radius * radius);
    }

    public void perimeter() {
        System.out.println("The perimeter of circle = " + 2 * 3.14 * radius);
    }
}
