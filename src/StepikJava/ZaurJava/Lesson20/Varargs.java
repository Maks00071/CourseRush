package StepikJava.ZaurJava.Lesson20;

public class Varargs {

    public static void summa(int ... a) {
        int summa = 0;

        for (int i = 0; i < a.length; i++) {
            summa += a[i];
        }

        System.out.println(summa);
    }

    public static void main(String[] args) {
        summa(4, 10); // 14
        summa(1, 2, 3, 4, 5); // 15
    }
}
