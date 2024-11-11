package StepikJava.ZaurJava.Course1.Lesson12;

public class Number {


    public int getMaxOfThreeNumbers(int x, int y, int z) {
        if (x > y) {
            if (x < z) {
                return z;
            }
            return x;
        } else if (y > z) {
            return y;
        }
        return z;
    }
}
