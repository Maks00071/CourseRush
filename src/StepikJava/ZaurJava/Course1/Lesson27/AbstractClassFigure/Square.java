package StepikJava.ZaurJava.Course1.Lesson27.AbstractClassFigure;

public class Square extends Figure {

    int countSide = 4;
    double lengthSide1 = 10.5;

//    public Square(int countSide) {
//        super(countSide);
//        this.countSide = countSide;
//    }

    public void square() {
        double area = lengthSide1 * lengthSide1;
        System.out.println("The square of area = " + area);
    }

    public void perimeter() {
        System.out.println("The perimeter of square = " + countSide * lengthSide1);
    }
}
