package StepikJava.ZaurJava.Course1.Lesson19;

public class MinMaxElement {
    public static void main(String[] args) {
        double array[] = new double[]{0.5, 1.1, 9.48, 0.05, 9.999, 0.0005};
        minMax(array);
    }

    public static void minMax(double[] doubleArray) {
        double minValue = doubleArray[0];
        double maxValuye = doubleArray[0];

        for (int i = 1; i < doubleArray.length; i++) {
            if (doubleArray[i] > maxValuye) {
                maxValuye = doubleArray[i];
                continue;
            }

            if (doubleArray[i] < minValue) {
                minValue = doubleArray[i];
            }
        }
        System.out.println("minValue = " + minValue);
        System.out.println("maxValue = " + maxValuye);
    }
}
