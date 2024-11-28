package StepikJava.ZaurJava.Course2.Lesson6.Predicate;

import java.util.ArrayList;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<String> aL = new ArrayList<>();
        aL.add("sfg");
        aL.add("dfgeh");
        aL.add("dfgjh");
        aL.add("waw");
        aL.add("hkl");

        System.out.println(aL); // [sfg, dfgeh, dfgjh, waw, hkl]
        aL.removeIf(element -> element.length() < 4);
        System.out.println(aL); // [dfgeh, dfgjh]
    }
}
