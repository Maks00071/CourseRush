package StepikJava.ZaurJava.Course1.Lesson36.MethodGenerics;

import java.util.ArrayList;

public class ClassMethodGenerics {

    public static <T> T getSecondElement(ArrayList<T> list) {
        return list.get(1);
    }

}
