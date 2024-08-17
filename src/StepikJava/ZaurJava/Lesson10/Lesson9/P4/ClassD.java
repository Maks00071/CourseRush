package StepikJava.ZaurJava.Lesson10.Lesson9.P4;

import StepikJava.ZaurJava.Lesson10.Lesson9.P1.ClassA;
import StepikJava.ZaurJava.Lesson10.Lesson9.P1.P2.ClassB;
import StepikJava.ZaurJava.Lesson10.Lesson9.P1.P2.P3.ClassC;
import StepikJava.ZaurJava.Lesson10.Lesson9.P4.P5.ClassE;

import static StepikJava.ZaurJava.Lesson10.Lesson9.P1.P2.ClassB.*;

public class ClassD {
    public static void main(String[] args) {
        ClassA classA = new ClassA();
        System.out.println(classA.a);

        ClassB classB = new ClassB();
        classB.showVariable();

        ClassC classC = new ClassC();
        System.out.println(classC.c);

        ClassE classE = new ClassE();
        System.out.println(classE.e);

        System.out.println(b);
    }
}
