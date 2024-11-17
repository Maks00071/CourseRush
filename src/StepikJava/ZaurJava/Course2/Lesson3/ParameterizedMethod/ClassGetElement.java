package StepikJava.ZaurJava.Course2.Lesson3.ParameterizedMethod;

import java.util.ArrayList;


public class ClassGetElement {

    public static <T> T getSecondElement(ArrayList<T> array) {
        return array.get(1);
    }

}
