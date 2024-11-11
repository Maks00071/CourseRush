package StepikJava.ZaurJava.Course1.Lesson27.AbstractClassFigure;

public class Rectangle extends Figure {

    int countSide = 4;
    double lengthSide1 = 5;
    double lengthSide2 = 14.8;

//    public Rectangle(int countSide) {
//        super(countSide);
//    }

    public void square() {
        double area = lengthSide1 * lengthSide2;
        System.out.println("The square of rectangle = " + area);
    }

    public void perimeter() {
        System.out.println("The perimeter of rectangle = " + 2 * (lengthSide1 + lengthSide2));
    }
}
