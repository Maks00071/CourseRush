package StepikJava.ZaurJava.Course1.Lesson36.MethodGenerics;

import org.jetbrains.annotations.NotNull;
import java.util.ArrayList;

public class ClassMethodGenerics {

    public static <T> T getSecondElement(@NotNull ArrayList<T> list) {
        return list.get(1);
    }

}
