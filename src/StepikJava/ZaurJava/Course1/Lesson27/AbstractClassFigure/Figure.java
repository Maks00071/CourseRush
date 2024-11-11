package StepikJava.ZaurJava.Course1.Lesson27.AbstractClassFigure;

abstract class Figure {

    int countSide;

//    Figure(int countSide) {
//        this.countSide = countSide;
//    }

    abstract void square();
    abstract void perimeter();

    public void showInfo() {
        System.out.println("This is the object of figure!");
    }
}
