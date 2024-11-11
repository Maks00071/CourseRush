package StepikJava.ZaurJava.Course1.Lesson34.Lambda;

public class ClassLambda {
    public static void main(String[] args) {
        printText((String str) -> str.length()); // 9

        printSumTwoString((String x, String y) -> x.length() + y.length());  // 7
    }

    public static void printText(Function func) {
        System.out.println(func.def("Hello :) "));
    }

    public static void printSumTwoString(FuncSumm func) {
        System.out.println(func.defSum("abc", "abcd"));
    }

}
